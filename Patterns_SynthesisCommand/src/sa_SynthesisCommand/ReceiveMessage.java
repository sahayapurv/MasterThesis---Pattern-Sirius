/**
 */
package sa_SynthesisCommand;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.ReceiveMessage#getDataRecipientName <em>Data Recipient Name</em>}</li>
 *   <li>{@link sa_SynthesisCommand.ReceiveMessage#getFromMessagePorts <em>From Message Ports</em>}</li>
 *   <li>{@link sa_SynthesisCommand.ReceiveMessage#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getReceiveMessage()
 * @model
 * @generated
 */
public interface ReceiveMessage extends Event {
	/**
	 * Returns the value of the '<em><b>Data Recipient Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Recipient Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Recipient Name</em>' attribute.
	 * @see #setDataRecipientName(String)
	 * @see sa_SynthesisCommand.SaPackage#getReceiveMessage_DataRecipientName()
	 * @model
	 * @generated
	 */
	String getDataRecipientName();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.ReceiveMessage#getDataRecipientName <em>Data Recipient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient Name</em>' attribute.
	 * @see #getDataRecipientName()
	 * @generated
	 */
	void setDataRecipientName(String value);

	/**
	 * Returns the value of the '<em><b>From Message Ports</b></em>' reference list.
	 * The list contents are of type {@link sa_SynthesisCommand.InMessagePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Message Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Message Ports</em>' reference list.
	 * @see sa_SynthesisCommand.SaPackage#getReceiveMessage_FromMessagePorts()
	 * @model
	 * @generated
	 */
	EList<InMessagePort> getFromMessagePorts();

	/**
	 * Returns the value of the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Recipient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Recipient</em>' reference.
	 * @see #setDataRecipient(DataDeclaration)
	 * @see sa_SynthesisCommand.SaPackage#getReceiveMessage_DataRecipient()
	 * @model
	 * @generated
	 */
	DataDeclaration getDataRecipient();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.ReceiveMessage#getDataRecipient <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient</em>' reference.
	 * @see #getDataRecipient()
	 * @generated
	 */
	void setDataRecipient(DataDeclaration value);

} // ReceiveMessage
