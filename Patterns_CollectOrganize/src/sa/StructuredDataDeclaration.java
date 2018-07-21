/**
 */
package sa;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.StructuredDataDeclaration#getTypeExp <em>Type Exp</em>}</li>
 *   <li>{@link sa.StructuredDataDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getStructuredDataDeclaration()
 * @model
 * @generated
 */
public interface StructuredDataDeclaration extends DataDeclaration {
	/**
	 * Returns the value of the '<em><b>Type Exp</b></em>' containment reference list.
	 * The list contents are of type {@link sa.StructuredDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Exp</em>' containment reference list.
	 * @see sa.SaPackage#getStructuredDataDeclaration_TypeExp()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<StructuredDataType> getTypeExp();

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
	 * @see sa.SaPackage#getStructuredDataDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link sa.StructuredDataDeclaration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // StructuredDataDeclaration
