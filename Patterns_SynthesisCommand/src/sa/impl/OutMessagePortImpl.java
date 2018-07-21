/**
 */
package sa.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sa.InMessagePort;
import sa.OutMessagePort;
import sa.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Message Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa.impl.OutMessagePortImpl#getInmsg <em>Inmsg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutMessagePortImpl extends MessagePortImpl implements OutMessagePort {
	/**
	 * The cached value of the '{@link #getInmsg() <em>Inmsg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInmsg()
	 * @generated
	 * @ordered
	 */
	protected EList<InMessagePort> inmsg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutMessagePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.OUT_MESSAGE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InMessagePort> getInmsg() {
		if (inmsg == null) {
			inmsg = new EObjectResolvingEList<InMessagePort>(InMessagePort.class, this, SaPackage.OUT_MESSAGE_PORT__INMSG);
		}
		return inmsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.OUT_MESSAGE_PORT__INMSG:
				return getInmsg();
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
			case SaPackage.OUT_MESSAGE_PORT__INMSG:
				getInmsg().clear();
				getInmsg().addAll((Collection<? extends InMessagePort>)newValue);
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
			case SaPackage.OUT_MESSAGE_PORT__INMSG:
				getInmsg().clear();
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
			case SaPackage.OUT_MESSAGE_PORT__INMSG:
				return inmsg != null && !inmsg.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutMessagePortImpl
