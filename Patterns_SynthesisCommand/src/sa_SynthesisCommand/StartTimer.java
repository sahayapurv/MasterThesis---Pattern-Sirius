/**
 */
package sa_SynthesisCommand;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.StartTimer#isCyclic <em>Cyclic</em>}</li>
 *   <li>{@link sa_SynthesisCommand.StartTimer#getDelay <em>Delay</em>}</li>
 *   <li>{@link sa_SynthesisCommand.StartTimer#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getStartTimer()
 * @model
 * @generated
 */
public interface StartTimer extends Action {
	/**
	 * Returns the value of the '<em><b>Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cyclic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cyclic</em>' attribute.
	 * @see #setCyclic(boolean)
	 * @see sa_SynthesisCommand.SaPackage#getStartTimer_Cyclic()
	 * @model
	 * @generated
	 */
	boolean isCyclic();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.StartTimer#isCyclic <em>Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cyclic</em>' attribute.
	 * @see #isCyclic()
	 * @generated
	 */
	void setCyclic(boolean value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see sa_SynthesisCommand.SaPackage#getStartTimer_Delay()
	 * @model
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.StartTimer#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see sa_SynthesisCommand.SaPackage#getStartTimer_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.StartTimer#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

} // StartTimer
