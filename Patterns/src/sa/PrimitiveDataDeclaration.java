/**
 */
package sa;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.PrimitiveDataDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link sa.PrimitiveDataDeclaration#getValueExp <em>Value Exp</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getPrimitiveDataDeclaration()
 * @model
 * @generated
 */
public interface PrimitiveDataDeclaration extends DataDeclaration {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sa.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sa.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see sa.SaPackage#getPrimitiveDataDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link sa.PrimitiveDataDeclaration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sa.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Value Exp</b></em>' containment reference list.
	 * The list contents are of type {@link sa.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Exp</em>' containment reference list.
	 * @see sa.SaPackage#getPrimitiveDataDeclaration_ValueExp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getValueExp();

} // PrimitiveDataDeclaration
