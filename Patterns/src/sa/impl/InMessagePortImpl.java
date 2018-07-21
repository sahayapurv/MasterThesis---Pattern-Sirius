/**
 */
package sa.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
	 * The cached value of the '{@link #getRcv_msg() <em>Rcv msg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcv_msg()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiveMessage> rcv_msg;

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
	public EList<ReceiveMessage> getRcv_msg() {
		if (rcv_msg == null) {
			rcv_msg = new EObjectResolvingEList<ReceiveMessage>(ReceiveMessage.class, this, SaPackage.IN_MESSAGE_PORT__RCV_MSG);
		}
		return rcv_msg;
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
				return getRcv_msg();
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
			case SaPackage.IN_MESSAGE_PORT__RCV_MSG:
				getRcv_msg().clear();
				getRcv_msg().addAll((Collection<? extends ReceiveMessage>)newValue);
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
				getRcv_msg().clear();
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
				return rcv_msg != null && !rcv_msg.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InMessagePortImpl
