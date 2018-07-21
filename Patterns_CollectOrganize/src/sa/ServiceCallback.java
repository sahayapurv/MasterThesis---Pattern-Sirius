/**
 */
package sa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.ServiceCallback#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link sa.ServiceCallback#getCalledService <em>Called Service</em>}</li>
 *   <li>{@link sa.ServiceCallback#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getServiceCallback()
 * @model
 * @generated
 */
public interface ServiceCallback extends Event {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see sa.SaPackage#getServiceCallback_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link sa.ServiceCallback#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Called Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Service</em>' reference.
	 * @see #setCalledService(CallAsyncService)
	 * @see sa.SaPackage#getServiceCallback_CalledService()
	 * @model required="true"
	 * @generated
	 */
	CallAsyncService getCalledService();

	/**
	 * Sets the value of the '{@link sa.ServiceCallback#getCalledService <em>Called Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Service</em>' reference.
	 * @see #getCalledService()
	 * @generated
	 */
	void setCalledService(CallAsyncService value);

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
	 * @see sa.SaPackage#getServiceCallback_DataRecipient()
	 * @model
	 * @generated
	 */
	DataDeclaration getDataRecipient();

	/**
	 * Sets the value of the '{@link sa.ServiceCallback#getDataRecipient <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient</em>' reference.
	 * @see #getDataRecipient()
	 * @generated
	 */
	void setDataRecipient(DataDeclaration value);

} // ServiceCallback
