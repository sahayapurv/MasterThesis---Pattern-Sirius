/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends StructuredDataType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' attribute list.
	 * @see sa.SaPackage#getEnumeration_Literals()
	 * @model
	 * @generated
	 */
	EList<String> getLiterals();

} // Enumeration
