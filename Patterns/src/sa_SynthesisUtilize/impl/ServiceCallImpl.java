/**
 */
package sa_SynthesisUtilize.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa_SynthesisUtilize.DataDeclaration;
import sa_SynthesisUtilize.SaPackage;
import sa_SynthesisUtilize.ServiceCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.ServiceCallImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.ServiceCallImpl#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceCallImpl extends EventImpl implements ServiceCall {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

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
	protected ServiceCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.SERVICE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SERVICE_CALL__SERVICE_NAME, oldServiceName, serviceName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.SERVICE_CALL__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SERVICE_CALL__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.SERVICE_CALL__SERVICE_NAME:
				return getServiceName();
			case SaPackage.SERVICE_CALL__DATA_RECIPIENT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SaPackage.SERVICE_CALL__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case SaPackage.SERVICE_CALL__DATA_RECIPIENT:
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
			case SaPackage.SERVICE_CALL__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case SaPackage.SERVICE_CALL__DATA_RECIPIENT:
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
			case SaPackage.SERVICE_CALL__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case SaPackage.SERVICE_CALL__DATA_RECIPIENT:
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
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} //ServiceCallImpl
