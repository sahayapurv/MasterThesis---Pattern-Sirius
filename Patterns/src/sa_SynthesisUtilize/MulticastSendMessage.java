/**
 */
package sa_SynthesisUtilize;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicast Send Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.MulticastSendMessage#getReceiverNames <em>Receiver Names</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getMulticastSendMessage()
 * @model
 * @generated
 */
public interface MulticastSendMessage extends SendMessage {
	/**
	 * Returns the value of the '<em><b>Receiver Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Names</em>' attribute list.
	 * @see sa_SynthesisUtilize.SaPackage#getMulticastSendMessage_ReceiverNames()
	 * @model
	 * @generated
	 */
	EList<String> getReceiverNames();

} // MulticastSendMessage
