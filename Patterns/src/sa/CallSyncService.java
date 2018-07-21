/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Sync Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.CallSyncService#getDataExp <em>Data Exp</em>}</li>
 *   <li>{@link sa.CallSyncService#getData <em>Data</em>}</li>
 *   <li>{@link sa.CallSyncService#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getCallSyncService()
 * @model
 * @generated
 */
public interface CallSyncService extends Action {
	/**
	 * Returns the value of the '<em><b>Data Exp</b></em>' containment reference list.
	 * The list contents are of type {@link sa.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Exp</em>' containment reference list.
	 * @see sa.SaPackage#getCallSyncService_DataExp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getDataExp();

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
	 * @see sa.SaPackage#getCallSyncService_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link sa.CallSyncService#getData <em>Data</em>}' attribute.
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
	 * @see sa.SaPackage#getCallSyncService_DataRecipient()
	 * @model
	 * @generated
	 */
	DataDeclaration getDataRecipient();

	/**
	 * Sets the value of the '{@link sa.CallSyncService#getDataRecipient <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient</em>' reference.
	 * @see #getDataRecipient()
	 * @generated
	 */
	void setDataRecipient(DataDeclaration value);

} // CallSyncService
