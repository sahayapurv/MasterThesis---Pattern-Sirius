/**
 */
package sa_SynthesisUtilize;

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
 *   <li>{@link sa_SynthesisUtilize.Action#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends LinkableElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link sa_SynthesisUtilize.Link}.
	 * It is bidirectional and its opposite is '{@link sa_SynthesisUtilize.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see sa_SynthesisUtilize.SaPackage#getAction_Incoming()
	 * @see sa_SynthesisUtilize.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncoming();

} // Action
