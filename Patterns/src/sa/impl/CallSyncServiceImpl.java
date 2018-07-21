/**
 */
package sa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sa.CallSyncService;
import sa.DataDeclaration;
import sa.Expression;
import sa.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Sync Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa.impl.CallSyncServiceImpl#getDataExp <em>Data Exp</em>}</li>
 *   <li>{@link sa.impl.CallSyncServiceImpl#getData <em>Data</em>}</li>
 *   <li>{@link sa.impl.CallSyncServiceImpl#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallSyncServiceImpl extends ActionImpl implements CallSyncService {
	/**
	 * The cached value of the '{@link #getDataExp() <em>Data Exp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExp()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> dataExp;

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
	 * The cached value of the '{@link #getDataRecipient() <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRecipient()
	 * @generated
	 * @ordered
	 */
	protected DataDeclaration dataRecipient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallSyncServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.CALL_SYNC_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getDataExp() {
		if (dataExp == null) {
			dataExp = new EObjectContainmentEList<Expression>(Expression.class, this, SaPackage.CALL_SYNC_SERVICE__DATA_EXP);
		}
		return dataExp;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.CALL_SYNC_SERVICE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDeclaration getDataRecipient() {
		if (dataRecipient != null && dataRecipient.eIsProxy()) {
			InternalEObject oldDataRecipient = (InternalEObject)dataRecipient;
			dataRecipient = (DataDeclaration)eResolveProxy(oldDataRecipient);
			if (dataRecipient != oldDataRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.CALL_SYNC_SERVICE__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
			}
		}
		return dataRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDeclaration basicGetDataRecipient() {
		return dataRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRecipient(DataDeclaration newDataRecipient) {
		DataDeclaration oldDataRecipient = dataRecipient;
		dataRecipient = newDataRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.CALL_SYNC_SERVICE__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.CALL_SYNC_SERVICE__DATA_EXP:
				return ((InternalEList<?>)getDataExp()).basicRemove(otherEnd, msgs);
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
			case SaPackage.CALL_SYNC_SERVICE__DATA_EXP:
				return getDataExp();
			case SaPackage.CALL_SYNC_SERVICE__DATA:
				return getData();
			case SaPackage.CALL_SYNC_SERVICE__DATA_RECIPIENT:
				if (resolve) return getDataRecipient();
				return basicGetDataRecipient();
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
			case SaPackage.CALL_SYNC_SERVICE__DATA_EXP:
				getDataExp().clear();
				getDataExp().addAll((Collection<? extends Expression>)newValue);
				return;
			case SaPackage.CALL_SYNC_SERVICE__DATA:
				setData((String)newValue);
				return;
			case SaPackage.CALL_SYNC_SERVICE__DATA_RECIPIENT:
				setDataRecipient((DataDeclaration)newValue);
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
			case SaPackage.CALL_SYNC_SERVICE__DATA_EXP:
				getDataExp().clear();
				return;
			case SaPackage.CALL_SYNC_SERVICE__DATA:
				setData(DATA_EDEFAULT);
				return;
			case SaPackage.CALL_SYNC_SERVICE__DATA_RECIPIENT:
				setDataRecipient((DataDeclaration)null);
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
			case SaPackage.CALL_SYNC_SERVICE__DATA_EXP:
				return dataExp != null && !dataExp.isEmpty();
			case SaPackage.CALL_SYNC_SERVICE__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case SaPackage.CALL_SYNC_SERVICE__DATA_RECIPIENT:
				return dataRecipient != null;
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

} //CallSyncServiceImpl
