/**
 */
package sa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Message Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.InMessagePort#getRcv_msg <em>Rcv msg</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getInMessagePort()
 * @model
 * @generated
 */
public interface InMessagePort extends MessagePort {

	/**
	 * Returns the value of the '<em><b>Rcv msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcv msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcv msg</em>' reference.
	 * @see #setRcv_msg(ReceiveMessage)
	 * @see sa.SaPackage#getInMessagePort_Rcv_msg()
	 * @model
	 * @generated
	 */
	ReceiveMessage getRcv_msg();

	/**
	 * Sets the value of the '{@link sa.InMessagePort#getRcv_msg <em>Rcv msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcv msg</em>' reference.
	 * @see #getRcv_msg()
	 * @generated
	 */
	void setRcv_msg(ReceiveMessage value);
} // InMessagePort
