/**
 */
package sa_SynthesisUtilize.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa_SynthesisUtilize.SaPackage;
import sa_SynthesisUtilize.StartTimer;
import sa_SynthesisUtilize.TimerFired;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Fired</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.TimerFiredImpl#getTimerName <em>Timer Name</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.TimerFiredImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerFiredImpl extends EventImpl implements TimerFired {
	/**
	 * The default value of the '{@link #getTimerName() <em>Timer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerName()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimerName() <em>Timer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerName()
	 * @generated
	 * @ordered
	 */
	protected String timerName = TIMER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected StartTimer timer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerFiredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.TIMER_FIRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimerName() {
		return timerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerName(String newTimerName) {
		String oldTimerName = timerName;
		timerName = newTimerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.TIMER_FIRED__TIMER_NAME, oldTimerName, timerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimer getTimer() {
		if (timer != null && timer.eIsProxy()) {
			InternalEObject oldTimer = (InternalEObject)timer;
			timer = (StartTimer)eResolveProxy(oldTimer);
			if (timer != oldTimer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.TIMER_FIRED__TIMER, oldTimer, timer));
			}
		}
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimer basicGetTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(StartTimer newTimer) {
		StartTimer oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.TIMER_FIRED__TIMER, oldTimer, timer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.TIMER_FIRED__TIMER_NAME:
				return getTimerName();
			case SaPackage.TIMER_FIRED__TIMER:
				if (resolve) return getTimer();
				return basicGetTimer();
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
			case SaPackage.TIMER_FIRED__TIMER_NAME:
				setTimerName((String)newValue);
				return;
			case SaPackage.TIMER_FIRED__TIMER:
				setTimer((StartTimer)newValue);
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
			case SaPackage.TIMER_FIRED__TIMER_NAME:
				setTimerName(TIMER_NAME_EDEFAULT);
				return;
			case SaPackage.TIMER_FIRED__TIMER:
				setTimer((StartTimer)null);
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
			case SaPackage.TIMER_FIRED__TIMER_NAME:
				return TIMER_NAME_EDEFAULT == null ? timerName != null : !TIMER_NAME_EDEFAULT.equals(timerName);
			case SaPackage.TIMER_FIRED__TIMER:
				return timer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timerName: ");
		result.append(timerName);
		result.append(')');
		return result.toString();
	}

} //TimerFiredImpl
