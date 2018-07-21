/**
 */
package sa_SynthesisCommand;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.StoreData#getDataRecipient <em>Data Recipient</em>}</li>
 *   <li>{@link sa_SynthesisCommand.StoreData#getDataExp <em>Data Exp</em>}</li>
 *   <li>{@link sa_SynthesisCommand.StoreData#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getStoreData()
 * @model
 * @generated
 */
public interface StoreData extends Action {
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
	 * @see sa_SynthesisCommand.SaPackage#getStoreData_DataRecipient()
	 * @model required="true"
	 * @generated
	 */
	DataDeclaration getDataRecipient();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.StoreData#getDataRecipient <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient</em>' reference.
	 * @see #getDataRecipient()
	 * @generated
	 */
	void setDataRecipient(DataDeclaration value);

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
	 * @see sa_SynthesisCommand.SaPackage#getStoreData_DataExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDataExp();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.StoreData#getDataExp <em>Data Exp</em>}' containment reference.
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
	 * @see sa_SynthesisCommand.SaPackage#getStoreData_Data()
	 * @model required="true"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.StoreData#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // StoreData
