/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.Action#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends LinkableElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link sa.Link}.
	 * It is bidirectional and its opposite is '{@link sa.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see sa.SaPackage#getAction_Incoming()
	 * @see sa.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncoming();

} // Action
