/**
 */
package sa_SynthesisUtilize;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Fired</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.TimerFired#getTimerName <em>Timer Name</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.TimerFired#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getTimerFired()
 * @model
 * @generated
 */
public interface TimerFired extends Event {
	/**
	 * Returns the value of the '<em><b>Timer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Name</em>' attribute.
	 * @see #setTimerName(String)
	 * @see sa_SynthesisUtilize.SaPackage#getTimerFired_TimerName()
	 * @model
	 * @generated
	 */
	String getTimerName();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.TimerFired#getTimerName <em>Timer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Name</em>' attribute.
	 * @see #getTimerName()
	 * @generated
	 */
	void setTimerName(String value);

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
	 * @see sa_SynthesisUtilize.SaPackage#getTimerFired_Timer()
	 * @model required="true"
	 * @generated
	 */
	StartTimer getTimer();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.TimerFired#getTimer <em>Timer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' reference.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(StartTimer value);

} // TimerFired
