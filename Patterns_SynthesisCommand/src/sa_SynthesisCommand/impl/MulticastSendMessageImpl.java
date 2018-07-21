/**
 */
package sa_SynthesisCommand.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import sa_SynthesisCommand.MulticastSendMessage;
import sa_SynthesisCommand.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multicast Send Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.impl.MulticastSendMessageImpl#getReceiverNames <em>Receiver Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MulticastSendMessageImpl extends SendMessageImpl implements MulticastSendMessage {
	/**
	 * The cached value of the '{@link #getReceiverNames() <em>Receiver Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> receiverNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticastSendMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.MULTICAST_SEND_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReceiverNames() {
		if (receiverNames == null) {
			receiverNames = new EDataTypeUniqueEList<String>(String.class, this, SaPackage.MULTICAST_SEND_MESSAGE__RECEIVER_NAMES);
		}
		return receiverNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.MULTICAST_SEND_MESSAGE__RECEIVER_NAMES:
				return getReceiverNames();
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
			case SaPackage.MULTICAST_SEND_MESSAGE__RECEIVER_NAMES:
				getReceiverNames().clear();
				getReceiverNames().addAll((Collection<? extends String>)newValue);
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
			case SaPackage.MULTICAST_SEND_MESSAGE__RECEIVER_NAMES:
				getReceiverNames().clear();
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
			case SaPackage.MULTICAST_SEND_MESSAGE__RECEIVER_NAMES:
				return receiverNames != null && !receiverNames.isEmpty();
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
		result.append(" (receiverNames: ");
		result.append(receiverNames);
		result.append(')');
		return result.toString();
	}

} //MulticastSendMessageImpl
