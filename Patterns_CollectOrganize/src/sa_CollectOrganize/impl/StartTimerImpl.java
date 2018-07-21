/**
 */
package sa_CollectOrganize.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa_CollectOrganize.SaPackage;
import sa_CollectOrganize.StartTimer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.impl.StartTimerImpl#isCyclic <em>Cyclic</em>}</li>
 *   <li>{@link sa_CollectOrganize.impl.StartTimerImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link sa_CollectOrganize.impl.StartTimerImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartTimerImpl extends ActionImpl implements StartTimer {
	/**
	 * The default value of the '{@link #isCyclic() <em>Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCyclic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CYCLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCyclic() <em>Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCyclic()
	 * @generated
	 * @ordered
	 */
	protected boolean cyclic = CYCLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected int delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.START_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCyclic() {
		return cyclic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclic(boolean newCyclic) {
		boolean oldCyclic = cyclic;
		cyclic = newCyclic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.START_TIMER__CYCLIC, oldCyclic, cyclic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(int newDelay) {
		int oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.START_TIMER__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.START_TIMER__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.START_TIMER__CYCLIC:
				return isCyclic();
			case SaPackage.START_TIMER__DELAY:
				return getDelay();
			case SaPackage.START_TIMER__PERIOD:
				return getPeriod();
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
			case SaPackage.START_TIMER__CYCLIC:
				setCyclic((Boolean)newValue);
				return;
			case SaPackage.START_TIMER__DELAY:
				setDelay((Integer)newValue);
				return;
			case SaPackage.START_TIMER__PERIOD:
				setPeriod((Integer)newValue);
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
			case SaPackage.START_TIMER__CYCLIC:
				setCyclic(CYCLIC_EDEFAULT);
				return;
			case SaPackage.START_TIMER__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case SaPackage.START_TIMER__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
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
			case SaPackage.START_TIMER__CYCLIC:
				return cyclic != CYCLIC_EDEFAULT;
			case SaPackage.START_TIMER__DELAY:
				return delay != DELAY_EDEFAULT;
			case SaPackage.START_TIMER__PERIOD:
				return period != PERIOD_EDEFAULT;
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
		result.append(" (cyclic: ");
		result.append(cyclic);
		result.append(", delay: ");
		result.append(delay);
		result.append(", period: ");
		result.append(period);
		result.append(')');
		return result.toString();
	}

} //StartTimerImpl
