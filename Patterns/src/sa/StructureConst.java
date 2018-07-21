/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.StructureConst#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getStructureConst()
 * @model
 * @generated
 */
public interface StructureConst extends Constant {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link sa.StructureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see sa.SaPackage#getStructureConst_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureElement> getValues();

} // StructureConst
