/**
 */
package sa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa.EnterMode;
import sa.ExitMode;
import sa.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa.impl.ExitModeImpl#getTargetMode <em>Target Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExitModeImpl extends ActionImpl implements ExitMode {
	/**
	 * The cached value of the '{@link #getTargetMode() <em>Target Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMode()
	 * @generated
	 * @ordered
	 */
	protected EnterMode targetMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.EXIT_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterMode getTargetMode() {
		if (targetMode != null && targetMode.eIsProxy()) {
			InternalEObject oldTargetMode = (InternalEObject)targetMode;
			targetMode = (EnterMode)eResolveProxy(oldTargetMode);
			if (targetMode != oldTargetMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.EXIT_MODE__TARGET_MODE, oldTargetMode, targetMode));
			}
		}
		return targetMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterMode basicGetTargetMode() {
		return targetMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMode(EnterMode newTargetMode) {
		EnterMode oldTargetMode = targetMode;
		targetMode = newTargetMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.EXIT_MODE__TARGET_MODE, oldTargetMode, targetMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.EXIT_MODE__TARGET_MODE:
				if (resolve) return getTargetMode();
				return basicGetTargetMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SaPackage.EXIT_MODE__TARGET_MODE:
				setTargetMode((EnterMode)newValue);
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
			case SaPackage.EXIT_MODE__TARGET_MODE:
				setTargetMode((EnterMode)null);
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
			case SaPackage.EXIT_MODE__TARGET_MODE:
				return targetMode != null;
		}
		return super.eIsSet(featureID);
	}

} //ExitModeImpl
