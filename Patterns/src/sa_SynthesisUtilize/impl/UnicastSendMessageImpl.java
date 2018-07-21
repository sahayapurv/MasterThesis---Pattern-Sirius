/**
 */
package sa_SynthesisUtilize.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa_SynthesisUtilize.SaPackage;
import sa_SynthesisUtilize.UnicastSendMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unicast Send Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.UnicastSendMessageImpl#getReceiverName <em>Receiver Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnicastSendMessageImpl extends SendMessageImpl implements UnicastSendMessage {
	/**
	 * The default value of the '{@link #getReceiverName() <em>Receiver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverName()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiverName() <em>Receiver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverName()
	 * @generated
	 * @ordered
	 */
	protected String receiverName = RECEIVER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnicastSendMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.UNICAST_SEND_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiverName() {
		return receiverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverName(String newReceiverName) {
		String oldReceiverName = receiverName;
		receiverName = newReceiverName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.UNICAST_SEND_MESSAGE__RECEIVER_NAME, oldReceiverName, receiverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.UNICAST_SEND_MESSAGE__RECEIVER_NAME:
				return getReceiverName();
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
			case SaPackage.UNICAST_SEND_MESSAGE__RECEIVER_NAME:
				setReceiverName((String)newValue);
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
			case SaPackage.UNICAST_SEND_MESSAGE__RECEIVER_NAME:
				setReceiverName(RECEIVER_NAME_EDEFAULT);
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
			case SaPackage.UNICAST_SEND_MESSAGE__RECEIVER_NAME:
				return RECEIVER_NAME_EDEFAULT == null ? receiverName != null : !RECEIVER_NAME_EDEFAULT.equals(receiverName);
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
		result.append(" (receiverName: ");
		result.append(receiverName);
		result.append(')');
		return result.toString();
	}

} //UnicastSendMessageImpl
