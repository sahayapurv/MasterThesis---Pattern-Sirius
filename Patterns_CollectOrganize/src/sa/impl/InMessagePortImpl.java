/**
 */
package sa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sa.InMessagePort;
import sa.ReceiveMessage;
import sa.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Message Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa.impl.InMessagePortImpl#getRcv_msg <em>Rcv msg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InMessagePortImpl extends MessagePortImpl implements InMessagePort {
	/**
	 * The cached value of the '{@link #getRcv_msg() <em>Rcv msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcv_msg()
	 * @generated
	 * @ordered
	 */
	protected ReceiveMessage rcv_msg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InMessagePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.IN_MESSAGE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessage getRcv_msg() {
		if (rcv_msg != null && rcv_msg.eIsProxy()) {
			InternalEObject oldRcv_msg = (InternalEObject)rcv_msg;
			rcv_msg = (ReceiveMessage)eResolveProxy(oldRcv_msg);
			if (rcv_msg != oldRcv_msg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.IN_MESSAGE_PORT__RCV_MSG, oldRcv_msg, rcv_msg));
			}
		}
		return rcv_msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessage basicGetRcv_msg() {
		return rcv_msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcv_msg(ReceiveMessage newRcv_msg) {
		ReceiveMessage oldRcv_msg = rcv_msg;
		rcv_msg = newRcv_msg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.IN_MESSAGE_PORT__RCV_MSG, oldRcv_msg, rcv_msg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.IN_MESSAGE_PORT__RCV_MSG:
				if (resolve) return getRcv_msg();
				return basicGetRcv_msg();
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
			case SaPackage.IN_MESSAGE_PORT__RCV_MSG:
				setRcv_msg((ReceiveMessage)newValue);
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
			case SaPackage.IN_MESSAGE_PORT__RCV_MSG:
				setRcv_msg((ReceiveMessage)null);
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
			case SaPackage.IN_MESSAGE_PORT__RCV_MSG:
				return rcv_msg != null;
		}
		return super.eIsSet(featureID);
	}

} //InMessagePortImpl
