/**
 */
package sa_SynthesisUtilize;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.RelationalExpr#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.RelationalExpr#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.RelationalExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getRelationalExpr()
 * @model
 * @generated
 */
public interface RelationalExpr extends Expression {
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
	 * @see sa_SynthesisUtilize.SaPackage#getRelationalExpr_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftOperand();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.RelationalExpr#getLeftOperand <em>Left Operand</em>}' containment reference.
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
	 * @see sa_SynthesisUtilize.SaPackage#getRelationalExpr_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightOperand();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.RelationalExpr#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link sa_SynthesisUtilize.RelationalOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see sa_SynthesisUtilize.RelationalOp
	 * @see #setOperator(RelationalOp)
	 * @see sa_SynthesisUtilize.SaPackage#getRelationalExpr_Operator()
	 * @model
	 * @generated
	 */
	RelationalOp getOperator();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.RelationalExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see sa_SynthesisUtilize.RelationalOp
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOp value);

} // RelationalExpr
