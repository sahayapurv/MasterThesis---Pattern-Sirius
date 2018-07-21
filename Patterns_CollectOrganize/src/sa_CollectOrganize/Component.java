/**
 */
package sa_CollectOrganize;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.Component#getHasController <em>Has Controller</em>}</li>
 *   <li>{@link sa_CollectOrganize.Component#getHasSensorController <em>Has Sensor Controller</em>}</li>
 * </ul>
 *
 * @see sa_CollectOrganize.SaPackage#getComponent()
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
	 * @see sa_CollectOrganize.SaPackage#getComponent_HasController()
	 * @model
	 * @generated
	 */
	Controller getHasController();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.Component#getHasController <em>Has Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Controller</em>' reference.
	 * @see #getHasController()
	 * @generated
	 */
	void setHasController(Controller value);

	/**
	 * Returns the value of the '<em><b>Has Sensor Controller</b></em>' reference list.
	 * The list contents are of type {@link sa_CollectOrganize.SensorController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sensor Controller</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sensor Controller</em>' reference list.
	 * @see sa_CollectOrganize.SaPackage#getComponent_HasSensorController()
	 * @model
	 * @generated
	 */
	EList<SensorController> getHasSensorController();

} // Component
