/**
 */
package sa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.Component#getHasController <em>Has Controller</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends SAElement {
	/**
	 * Returns the value of the '<em><b>Has Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Controller</em>' reference.
	 * @see #setHasController(Controller)
	 * @see sa.SaPackage#getComponent_HasController()
	 * @model
	 * @generated
	 */
	Controller getHasController();

	/**
	 * Sets the value of the '{@link sa.Component#getHasController <em>Has Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Controller</em>' reference.
	 * @see #getHasController()
	 * @generated
	 */
	void setHasController(Controller value);

} // Component
