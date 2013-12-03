package org.uva.sea.ql.ast.operators.binary;

import org.uva.sea.ql.ast.base.*;
import org.uva.sea.ql.ast.operators.base.BinaryOperator;
import org.uva.sea.ql.ast.traversal.base.IVisitor;
import org.uva.sea.ql.ast.traversal.typechecking.SymbolTable;
import org.uva.sea.ql.ast.types.datatypes.*;

/**
 * Represents a greater than or equal to operation in the QL language.
 * 
 * @author J. Dijkstra
 */
public class GEq extends BinaryOperator {
	private static final DataType TYPE = new BoolType();

	/**
	 * Constructor.
	 * 
	 * @param leftHandSide
	 *            left hand side of the operator
	 * @param rightHandSide
	 *            right hand side of the operator
	 * @param syntaxPosition
	 *            the original position of the expression in the input syntax
	 */
	public GEq(final Expression leftHandSide, final Expression rightHandSide, final SyntaxPosition syntaxPosition) {
		super(leftHandSide, rightHandSide, syntaxPosition);
	}

	@Override
	public DataType typeOf(final SymbolTable symbolTable) {
		return TYPE;
	}

	@Override
	public <T> T accept(final IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
