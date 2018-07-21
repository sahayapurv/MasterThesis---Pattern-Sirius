/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.Structure#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getStructure()
 * @model abstract="true"
 * @generated
 */
public interface Structure extends StructuredDataType {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link sa.DataDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see sa.SaPackage#getStructure_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataDeclaration> getMembers();

} // Structure
