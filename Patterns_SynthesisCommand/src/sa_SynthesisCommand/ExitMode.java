/**
 */
package sa_SynthesisCommand;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.ExitMode#getTargetMode <em>Target Mode</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getExitMode()
 * @model
 * @generated
 */
public interface ExitMode extends Action {
	/**
	 * Returns the value of the '<em><b>Target Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Mode</em>' reference.
	 * @see #setTargetMode(EnterMode)
	 * @see sa_SynthesisCommand.SaPackage#getExitMode_TargetMode()
	 * @model required="true"
	 * @generated
	 */
	EnterMode getTargetMode();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.ExitMode#getTargetMode <em>Target Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mode</em>' reference.
	 * @see #getTargetMode()
	 * @generated
	 */
	void setTargetMode(EnterMode value);

} // ExitMode
