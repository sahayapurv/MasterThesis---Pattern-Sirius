/**
 */
package sa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sa.DataDeclaration;
import sa.InMessagePort;
import sa.ReceiveMessage;
import sa.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa.impl.ReceiveMessageImpl#getDataRecipientName <em>Data Recipient Name</em>}</li>
 *   <li>{@link sa.impl.ReceiveMessageImpl#getFromMessagePorts <em>From Message Ports</em>}</li>
 *   <li>{@link sa.impl.ReceiveMessageImpl#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiveMessageImpl extends EventImpl implements ReceiveMessage {
	/**
	 * The default value of the '{@link #getDataRecipientName() <em>Data Recipient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRecipientName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RECIPIENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRecipientName() <em>Data Recipient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRecipientName()
	 * @generated
	 * @ordered
	 */
	protected String dataRecipientName = DATA_RECIPIENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromMessagePorts() <em>From Message Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromMessagePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InMessagePort> fromMessagePorts;

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
	protected ReceiveMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.RECEIVE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataRecipientName() {
		return dataRecipientName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRecipientName(String newDataRecipientName) {
		String oldDataRecipientName = dataRecipientName;
		dataRecipientName = newDataRecipientName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT_NAME, oldDataRecipientName, dataRecipientName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InMessagePort> getFromMessagePorts() {
		if (fromMessagePorts == null) {
			fromMessagePorts = new EObjectResolvingEList<InMessagePort>(InMessagePort.class, this, SaPackage.RECEIVE_MESSAGE__FROM_MESSAGE_PORTS);
		}
		return fromMessagePorts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT_NAME:
				return getDataRecipientName();
			case SaPackage.RECEIVE_MESSAGE__FROM_MESSAGE_PORTS:
				return getFromMessagePorts();
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT:
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
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT_NAME:
				setDataRecipientName((String)newValue);
				return;
			case SaPackage.RECEIVE_MESSAGE__FROM_MESSAGE_PORTS:
				getFromMessagePorts().clear();
				getFromMessagePorts().addAll((Collection<? extends InMessagePort>)newValue);
				return;
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT:
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
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT_NAME:
				setDataRecipientName(DATA_RECIPIENT_NAME_EDEFAULT);
				return;
			case SaPackage.RECEIVE_MESSAGE__FROM_MESSAGE_PORTS:
				getFromMessagePorts().clear();
				return;
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT:
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
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT_NAME:
				return DATA_RECIPIENT_NAME_EDEFAULT == null ? dataRecipientName != null : !DATA_RECIPIENT_NAME_EDEFAULT.equals(dataRecipientName);
			case SaPackage.RECEIVE_MESSAGE__FROM_MESSAGE_PORTS:
				return fromMessagePorts != null && !fromMessagePorts.isEmpty();
			case SaPackage.RECEIVE_MESSAGE__DATA_RECIPIENT:
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
		result.append(" (dataRecipientName: ");
		result.append(dataRecipientName);
		result.append(')');
		return result.toString();
	}

} //ReceiveMessageImpl
