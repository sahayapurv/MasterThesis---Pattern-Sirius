/**
 */
package sa_SynthesisCommand;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.BooleanExpr#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link sa_SynthesisCommand.BooleanExpr#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link sa_SynthesisCommand.BooleanExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getBooleanExpr()
 * @model
 * @generated
 */
public interface BooleanExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(Expression)
	 * @see sa_SynthesisCommand.SaPackage#getBooleanExpr_LeftOperand()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeftOperand();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.BooleanExpr#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(Expression)
	 * @see sa_SynthesisCommand.SaPackage#getBooleanExpr_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightOperand();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.BooleanExpr#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link sa_SynthesisCommand.BooleanOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see sa_SynthesisCommand.BooleanOp
	 * @see #setOperator(BooleanOp)
	 * @see sa_SynthesisCommand.SaPackage#getBooleanExpr_Operator()
	 * @model
	 * @generated
	 */
	BooleanOp getOperator();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.BooleanExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see sa_SynthesisCommand.BooleanOp
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOp value);

} // BooleanExpr
