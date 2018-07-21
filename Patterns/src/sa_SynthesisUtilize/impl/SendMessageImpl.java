/**
 */
package sa_SynthesisUtilize.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sa_SynthesisUtilize.Expression;
import sa_SynthesisUtilize.OutMessagePort;
import sa_SynthesisUtilize.SaPackage;
import sa_SynthesisUtilize.SendMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.SendMessageImpl#getDataExp <em>Data Exp</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.SendMessageImpl#getData <em>Data</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.SendMessageImpl#getToMessagePorts <em>To Message Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SendMessageImpl extends ActionImpl implements SendMessage {
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
	 * The cached value of the '{@link #getToMessagePorts() <em>To Message Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMessagePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutMessagePort> toMessagePorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.SEND_MESSAGE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaPackage.SEND_MESSAGE__DATA_EXP, oldDataExp, newDataExp);
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
				msgs = ((InternalEObject)dataExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaPackage.SEND_MESSAGE__DATA_EXP, null, msgs);
			if (newDataExp != null)
				msgs = ((InternalEObject)newDataExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaPackage.SEND_MESSAGE__DATA_EXP, null, msgs);
			msgs = basicSetDataExp(newDataExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SEND_MESSAGE__DATA_EXP, newDataExp, newDataExp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SEND_MESSAGE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutMessagePort> getToMessagePorts() {
		if (toMessagePorts == null) {
			toMessagePorts = new EObjectResolvingEList<OutMessagePort>(OutMessagePort.class, this, SaPackage.SEND_MESSAGE__TO_MESSAGE_PORTS);
		}
		return toMessagePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.SEND_MESSAGE__DATA_EXP:
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
			case SaPackage.SEND_MESSAGE__DATA_EXP:
				return getDataExp();
			case SaPackage.SEND_MESSAGE__DATA:
				return getData();
			case SaPackage.SEND_MESSAGE__TO_MESSAGE_PORTS:
				return getToMessagePorts();
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
			case SaPackage.SEND_MESSAGE__DATA_EXP:
				setDataExp((Expression)newValue);
				return;
			case SaPackage.SEND_MESSAGE__DATA:
				setData((String)newValue);
				return;
			case SaPackage.SEND_MESSAGE__TO_MESSAGE_PORTS:
				getToMessagePorts().clear();
				getToMessagePorts().addAll((Collection<? extends OutMessagePort>)newValue);
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
			case SaPackage.SEND_MESSAGE__DATA_EXP:
				setDataExp((Expression)null);
				return;
			case SaPackage.SEND_MESSAGE__DATA:
				setData(DATA_EDEFAULT);
				return;
			case SaPackage.SEND_MESSAGE__TO_MESSAGE_PORTS:
				getToMessagePorts().clear();
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
			case SaPackage.SEND_MESSAGE__DATA_EXP:
				return dataExp != null;
			case SaPackage.SEND_MESSAGE__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case SaPackage.SEND_MESSAGE__TO_MESSAGE_PORTS:
				return toMessagePorts != null && !toMessagePorts.isEmpty();
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

} //SendMessageImpl
