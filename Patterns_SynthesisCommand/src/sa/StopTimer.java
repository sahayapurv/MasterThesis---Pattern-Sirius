/**
 */
package sa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.StopTimer#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getStopTimer()
 * @model
 * @generated
 */
public interface StopTimer extends Action {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' reference.
	 * @see #setTimer(StartTimer)
	 * @see sa.SaPackage#getStopTimer_Timer()
	 * @model required="true"
	 * @generated
	 */
	StartTimer getTimer();

	/**
	 * Sets the value of the '{@link sa.StopTimer#getTimer <em>Timer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' reference.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(StartTimer value);

} // StopTimer
