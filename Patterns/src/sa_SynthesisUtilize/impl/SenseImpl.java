/**
 */
package sa_SynthesisUtilize.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa_SynthesisUtilize.DataDeclaration;
import sa_SynthesisUtilize.SaPackage;
import sa_SynthesisUtilize.Sense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.SenseImpl#getDataDeclarationName <em>Data Declaration Name</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.SenseImpl#getData <em>Data</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.SenseImpl#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SenseImpl extends ActionImpl implements Sense {
	/**
	 * The default value of the '{@link #getDataDeclarationName() <em>Data Declaration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDeclarationName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DECLARATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDeclarationName() <em>Data Declaration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDeclarationName()
	 * @generated
	 * @ordered
	 */
	protected String dataDeclarationName = DATA_DECLARATION_NAME_EDEFAULT;

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
	protected SenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.SENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataDeclarationName() {
		return dataDeclarationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDeclarationName(String newDataDeclarationName) {
		String oldDataDeclarationName = dataDeclarationName;
		dataDeclarationName = newDataDeclarationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SENSE__DATA_DECLARATION_NAME, oldDataDeclarationName, dataDeclarationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SENSE__DATA, oldData, data));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.SENSE__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SENSE__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.SENSE__DATA_DECLARATION_NAME:
				return getDataDeclarationName();
			case SaPackage.SENSE__DATA:
				return getData();
			case SaPackage.SENSE__DATA_RECIPIENT:
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
			case SaPackage.SENSE__DATA_DECLARATION_NAME:
				setDataDeclarationName((String)newValue);
				return;
			case SaPackage.SENSE__DATA:
				setData((String)newValue);
				return;
			case SaPackage.SENSE__DATA_RECIPIENT:
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
			case SaPackage.SENSE__DATA_DECLARATION_NAME:
				setDataDeclarationName(DATA_DECLARATION_NAME_EDEFAULT);
				return;
			case SaPackage.SENSE__DATA:
				setData(DATA_EDEFAULT);
				return;
			case SaPackage.SENSE__DATA_RECIPIENT:
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
			case SaPackage.SENSE__DATA_DECLARATION_NAME:
				return DATA_DECLARATION_NAME_EDEFAULT == null ? dataDeclarationName != null : !DATA_DECLARATION_NAME_EDEFAULT.equals(dataDeclarationName);
			case SaPackage.SENSE__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case SaPackage.SENSE__DATA_RECIPIENT:
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
		result.append(" (dataDeclarationName: ");
		result.append(dataDeclarationName);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //SenseImpl
