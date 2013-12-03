package org.uva.sea.ql.ast.operators.unary;

import org.uva.sea.ql.ast.base.*;
import org.uva.sea.ql.ast.operators.base.UnaryOperator;
import org.uva.sea.ql.ast.traversal.base.IVisitor;
import org.uva.sea.ql.ast.traversal.typechecking.SymbolTable;
import org.uva.sea.ql.ast.types.datatypes.*;

/**
 * Represents the negative operation in the QL language.
 * 
 * @author J. Dijkstra
 */
public class Neg extends UnaryOperator {
	private static final DataType TYPE = new NumericType();

	/**
	 * Constructor.
	 * 
	 * @param expression
	 *            expression or operation the negative operation affects
	 * @param syntaxPosition
	 *            the original position of the expression in the input syntax
	 */
	public Neg(final Expression expression, final SyntaxPosition syntaxPosition) {
		super(expression, syntaxPosition);
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
