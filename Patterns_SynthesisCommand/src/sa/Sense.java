/**
 */
package sa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.Sense#getDataDeclarationName <em>Data Declaration Name</em>}</li>
 *   <li>{@link sa.Sense#getData <em>Data</em>}</li>
 *   <li>{@link sa.Sense#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getSense()
 * @model
 * @generated
 */
public interface Sense extends Action {
	/**
	 * Returns the value of the '<em><b>Data Declaration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Declaration Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Declaration Name</em>' attribute.
	 * @see #setDataDeclarationName(String)
	 * @see sa.SaPackage#getSense_DataDeclarationName()
	 * @model
	 * @generated
	 */
	String getDataDeclarationName();

	/**
	 * Sets the value of the '{@link sa.Sense#getDataDeclarationName <em>Data Declaration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Declaration Name</em>' attribute.
	 * @see #getDataDeclarationName()
	 * @generated
	 */
	void setDataDeclarationName(String value);

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
	 * @see sa.SaPackage#getSense_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link sa.Sense#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

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
	 * @see sa.SaPackage#getSense_DataRecipient()
	 * @model required="true"
	 * @generated
	 */
	DataDeclaration getDataRecipient();

	/**
	 * Sets the value of the '{@link sa.Sense#getDataRecipient <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient</em>' reference.
	 * @see #getDataRecipient()
	 * @generated
	 */
	void setDataRecipient(DataDeclaration value);

} // Sense
