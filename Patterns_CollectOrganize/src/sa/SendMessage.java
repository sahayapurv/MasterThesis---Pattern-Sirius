/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.SendMessage#getDataExp <em>Data Exp</em>}</li>
 *   <li>{@link sa.SendMessage#getData <em>Data</em>}</li>
 *   <li>{@link sa.SendMessage#getToMessagePorts <em>To Message Ports</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getSendMessage()
 * @model abstract="true"
 * @generated
 */
public interface SendMessage extends Action {
	/**
	 * Returns the value of the '<em><b>Data Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Exp</em>' containment reference.
	 * @see #setDataExp(Expression)
	 * @see sa.SaPackage#getSendMessage_DataExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDataExp();

	/**
	 * Sets the value of the '{@link sa.SendMessage#getDataExp <em>Data Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Exp</em>' containment reference.
	 * @see #getDataExp()
	 * @generated
	 */
	void setDataExp(Expression value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see sa.SaPackage#getSendMessage_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link sa.SendMessage#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>To Message Ports</b></em>' reference list.
	 * The list contents are of type {@link sa.OutMessagePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Message Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Message Ports</em>' reference list.
	 * @see sa.SaPackage#getSendMessage_ToMessagePorts()
	 * @model required="true"
	 * @generated
	 */
	EList<OutMessagePort> getToMessagePorts();

} // SendMessage
