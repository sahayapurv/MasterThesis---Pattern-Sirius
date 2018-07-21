/**
 */
package sa_SynthesisUtilize.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa_SynthesisUtilize.Actuate;
import sa_SynthesisUtilize.Expression;
import sa_SynthesisUtilize.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.ActuateImpl#getDataExp <em>Data Exp</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.ActuateImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuateImpl extends ActionImpl implements Actuate {
	/**
	 * The cached value of the '{@link #getDataExp() <em>Data Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExp()
	 * @generated
	 * @ordered
	 */
	protected Expression dataExp;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.ACTUATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDataExp() {
		return dataExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExp(Expression newDataExp, NotificationChain msgs) {
		Expression oldDataExp = dataExp;
		dataExp = newDataExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaPackage.ACTUATE__DATA_EXP, oldDataExp, newDataExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExp(Expression newDataExp) {
		if (newDataExp != dataExp) {
			NotificationChain msgs = null;
			if (dataExp != null)
				msgs = ((InternalEObject)dataExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaPackage.ACTUATE__DATA_EXP, null, msgs);
			if (newDataExp != null)
				msgs = ((InternalEObject)newDataExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaPackage.ACTUATE__DATA_EXP, null, msgs);
			msgs = basicSetDataExp(newDataExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.ACTUATE__DATA_EXP, newDataExp, newDataExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.ACTUATE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.ACTUATE__DATA_EXP:
				return basicSetDataExp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.ACTUATE__DATA_EXP:
				return getDataExp();
			case SaPackage.ACTUATE__DATA:
				return getData();
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
			case SaPackage.ACTUATE__DATA_EXP:
				setDataExp((Expression)newValue);
				return;
			case SaPackage.ACTUATE__DATA:
				setData((String)newValue);
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
			case SaPackage.ACTUATE__DATA_EXP:
				setDataExp((Expression)null);
				return;
			case SaPackage.ACTUATE__DATA:
				setData(DATA_EDEFAULT);
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
			case SaPackage.ACTUATE__DATA_EXP:
				return dataExp != null;
			case SaPackage.ACTUATE__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
		result.append(" (data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //ActuateImpl
