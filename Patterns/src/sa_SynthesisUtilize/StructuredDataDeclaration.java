/**
 */
package sa_SynthesisUtilize;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.StructuredDataDeclaration#getTypeExp <em>Type Exp</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.StructuredDataDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getStructuredDataDeclaration()
 * @model
 * @generated
 */
public interface StructuredDataDeclaration extends DataDeclaration {
	/**
	 * Returns the value of the '<em><b>Type Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Exp</em>' containment reference.
	 * @see #setTypeExp(StructuredDataType)
	 * @see sa_SynthesisUtilize.SaPackage#getStructuredDataDeclaration_TypeExp()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	StructuredDataType getTypeExp();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.StructuredDataDeclaration#getTypeExp <em>Type Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Exp</em>' containment reference.
	 * @see #getTypeExp()
	 * @generated
	 */
	void setTypeExp(StructuredDataType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see sa_SynthesisUtilize.SaPackage#getStructuredDataDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.StructuredDataDeclaration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // StructuredDataDeclaration
