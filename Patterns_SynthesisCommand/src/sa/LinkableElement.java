/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.LinkableElement#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link sa.LinkableElement#getInAction <em>In Action</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getLinkableElement()
 * @model abstract="true"
 * @generated
 */
public interface LinkableElement extends BehaviouralElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link sa.Link}.
	 * It is bidirectional and its opposite is '{@link sa.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see sa.SaPackage#getLinkableElement_Outgoing()
	 * @see sa.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoing();

	/**
	 * Returns the value of the '<em><b>In Action</b></em>' reference list.
	 * The list contents are of type {@link sa.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Action</em>' reference list.
	 * @see sa.SaPackage#getLinkableElement_InAction()
	 * @model
	 * @generated
	 */
	EList<Action> getInAction();

} // LinkableElement
