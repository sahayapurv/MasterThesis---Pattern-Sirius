/**
 */
package sa_CollectOrganize;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unicast Send Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.UnicastSendMessage#getReceiverName <em>Receiver Name</em>}</li>
 * </ul>
 *
 * @see sa_CollectOrganize.SaPackage#getUnicastSendMessage()
 * @model
 * @generated
 */
public interface UnicastSendMessage extends SendMessage {
	/**
	 * Returns the value of the '<em><b>Receiver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Name</em>' attribute.
	 * @see #setReceiverName(String)
	 * @see sa_CollectOrganize.SaPackage#getUnicastSendMessage_ReceiverName()
	 * @model
	 * @generated
	 */
	String getReceiverName();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.UnicastSendMessage#getReceiverName <em>Receiver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Name</em>' attribute.
	 * @see #getReceiverName()
	 * @generated
	 */
	void setReceiverName(String value);

} // UnicastSendMessage
