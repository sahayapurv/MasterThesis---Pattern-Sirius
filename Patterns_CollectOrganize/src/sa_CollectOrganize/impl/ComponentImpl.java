/**
 */
package sa_CollectOrganize.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sa_CollectOrganize.Component;
import sa_CollectOrganize.Controller;
import sa_CollectOrganize.SaPackage;
import sa_CollectOrganize.SensorController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.impl.ComponentImpl#getHasController <em>Has Controller</em>}</li>
 *   <li>{@link sa_CollectOrganize.impl.ComponentImpl#getHasSensorController <em>Has Sensor Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends SAElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getHasController() <em>Has Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasController()
	 * @generated
	 * @ordered
	 */
	protected Controller hasController;

	/**
	 * The cached value of the '{@link #getHasSensorController() <em>Has Sensor Controller</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSensorController()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorController> hasSensorController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getHasController() {
		if (hasController != null && hasController.eIsProxy()) {
			InternalEObject oldHasController = (InternalEObject)hasController;
			hasController = (Controller)eResolveProxy(oldHasController);
			if (hasController != oldHasController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.COMPONENT__HAS_CONTROLLER, oldHasController, hasController));
			}
		}
		return hasController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetHasController() {
		return hasController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasController(Controller newHasController) {
		Controller oldHasController = hasController;
		hasController = newHasController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.COMPONENT__HAS_CONTROLLER, oldHasController, hasController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorController> getHasSensorController() {
		if (hasSensorController == null) {
			hasSensorController = new EObjectResolvingEList<SensorController>(SensorController.class, this, SaPackage.COMPONENT__HAS_SENSOR_CONTROLLER);
		}
		return hasSensorController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.COMPONENT__HAS_CONTROLLER:
				if (resolve) return getHasController();
				return basicGetHasController();
			case SaPackage.COMPONENT__HAS_SENSOR_CONTROLLER:
				return getHasSensorController();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SaPackage.COMPONENT__HAS_CONTROLLER:
				setHasController((Controller)newValue);
				return;
			case SaPackage.COMPONENT__HAS_SENSOR_CONTROLLER:
				getHasSensorController().clear();
				getHasSensorController().addAll((Collection<? extends SensorController>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SaPackage.COMPONENT__HAS_CONTROLLER:
				setHasController((Controller)null);
				return;
			case SaPackage.COMPONENT__HAS_SENSOR_CONTROLLER:
				getHasSensorController().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SaPackage.COMPONENT__HAS_CONTROLLER:
				return hasController != null;
			case SaPackage.COMPONENT__HAS_SENSOR_CONTROLLER:
				return hasSensorController != null && !hasSensorController.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
