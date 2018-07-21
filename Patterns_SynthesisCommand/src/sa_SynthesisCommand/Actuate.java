/**
 */
package sa_SynthesisCommand;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.Actuate#getDataExp <em>Data Exp</em>}</li>
 *   <li>{@link sa_SynthesisCommand.Actuate#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getActuate()
 * @model
 * @generated
 */
public interface Actuate extends Action {
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
	 * @see sa_SynthesisCommand.SaPackage#getActuate_DataExp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDataExp();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.Actuate#getDataExp <em>Data Exp</em>}' containment reference.
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
	 * @see sa_SynthesisCommand.SaPackage#getActuate_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.Actuate#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // Actuate
