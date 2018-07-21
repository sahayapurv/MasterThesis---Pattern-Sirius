/**
 */
package sa_SynthesisUtilize;

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
 *   <li>{@link sa_SynthesisUtilize.LinkableElement#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.LinkableElement#getInAction <em>In Action</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getLinkableElement()
 * @model abstract="true"
 * @generated
 */
public interface LinkableElement extends BehaviouralElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link sa_SynthesisUtilize.Link}.
	 * It is bidirectional and its opposite is '{@link sa_SynthesisUtilize.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see sa_SynthesisUtilize.SaPackage#getLinkableElement_Outgoing()
	 * @see sa_SynthesisUtilize.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoing();

	/**
	 * Returns the value of the '<em><b>In Action</b></em>' reference list.
	 * The list contents are of type {@link sa_SynthesisUtilize.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Action</em>' reference list.
	 * @see sa_SynthesisUtilize.SaPackage#getLinkableElement_InAction()
	 * @model
	 * @generated
	 */
	EList<Action> getInAction();

} // LinkableElement
