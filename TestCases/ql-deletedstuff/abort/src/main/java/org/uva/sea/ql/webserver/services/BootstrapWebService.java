package org.uva.sea.ql.webserver.services;

import java.io.*;
import java.util.*;

import javax.ws.rs.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.*;
import org.uva.sea.ql.ServerProperties;
import org.uva.sea.ql.ast.traversal.typechecking.base.ISymbolTable;
import org.uva.sea.ql.ast.types.datatypes.*;
import org.uva.sea.ql.webserver.models.*;

import com.google.inject.Inject;

/**
 * WebService for a generated bootstrap FrontEnd.
 * 
 * @author J. Dijkstra
 */
@Path("/bootstrap")
@Produces("application/json")
@Consumes("application/json")
public class BootstrapWebService {
	// Know all types to validate
	private final StringType stringType = new StringType();
	private final BoolType boolType = new BoolType();
	private final IntType intType = new IntType();
	private final MoneyType moneyType = new MoneyType();

	@Inject
	private ISymbolTable symbolTable;

	@Inject
	private ServerProperties properties;

	/**
	 * Validate whether the input is a valid int type
	 * 
	 * @param input
	 *            input
	 * @return whether the input is valid or not
	 */
	@POST
	@Path("/validateInteger")
	public boolean validateInteger(final ValidationWrapper input) {
		return intType.isAssignableFrom(input.getValue());
	}

	/**
	 * Validate whether the input is a valid string type
	 * 
	 * @param input
	 *            input
	 * @return whether the input is valid or not
	 */
	@POST
	@Path("/validateString")
	public boolean validateString(final ValidationWrapper input) {
		return stringType.isAssignableFrom(input.getValue());
	}

	/**
	 * Validate whether the input is a valid money type
	 * 
	 * @param input
	 *            input
	 * @return whether the input is valid or not
	 */
	@POST
	@Path("/validateMoney")
	public boolean validateMoney(final ValidationWrapper input) {
		return moneyType.isAssignableFrom(input.getValue());
	}

	/**
	 * Validate whether the input is a valid boolean type
	 * 
	 * @param input
	 *            input
	 * @return whether the input is valid or not
	 */
	@POST
	@Path("/validateBoolean")
	public boolean validateBoolean(final ValidationWrapper input) {
		return boolType.isAssignableFrom(input.getValue());
	}

	/**
	 * Validate and persist a form (if valid).
	 * 
	 * @param form
	 *            form input
	 * @return whether the validation and persistence was successful
	 */
	@POST
	@Path("/persist")
	public boolean validateAndPersistForm(final FormWrapper form) {
		// Iterate over the input form map
		final Map<String, String> inputValues = form.getFormMap();
		for (final Map.Entry<String, String> entry : inputValues.entrySet()) {
			final String name = entry.getKey();
			final String value = entry.getValue();

			// Check if the corresponding name found in the input is assignable
			// according to the symbol table
			if (!symbolTable.getDataTypeByName(name).isAssignableFrom(value)) {
				System.err.println(String.format("Invalid input for %s (value: \"%s\")", name, value));
				return false;
			}
		}

		// Write to file and return whether it was successful or not
		return writeFormToFile(form);
	}

	private boolean writeFormToFile(final FormWrapper form) {
		final String outputPath = generateOutputPath();
		final File outputFile = new File(outputPath);

		// Try to output the input form to a JSON file
		try {
			final ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(outputFile, form.getFormMap());

			return true;
		} catch (final JsonGenerationException e) {
			System.err.println(String.format("Failed to generate JSON (%s)", e.getMessage()));
		} catch (final JsonMappingException e) {
			System.err.println(String.format("Failed to map JSON (%s)", e.getMessage()));
		} catch (final IOException e) {
			System.err.println(String.format("IO Exception (%s)", e.getMessage()));
		}

		return false;
	}

	private String generateOutputPath() {
		return String.format("%s/form-%d.json", properties.getSaveFormPath(), Calendar.getInstance().getTimeInMillis());
	}
}
