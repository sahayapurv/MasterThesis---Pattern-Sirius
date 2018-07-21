/**
 */
package sa_SynthesisUtilize;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Message Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.OutMessagePort#getInmsg <em>Inmsg</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getOutMessagePort()
 * @model
 * @generated
 */
public interface OutMessagePort extends MessagePort {
	/**
	 * Returns the value of the '<em><b>Inmsg</b></em>' reference list.
	 * The list contents are of type {@link sa_SynthesisUtilize.InMessagePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inmsg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inmsg</em>' reference list.
	 * @see sa_SynthesisUtilize.SaPackage#getOutMessagePort_Inmsg()
	 * @model
	 * @generated
	 */
	EList<InMessagePort> getInmsg();

} // OutMessagePort
