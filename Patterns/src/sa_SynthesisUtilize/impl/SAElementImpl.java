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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sa_SynthesisUtilize.DataDeclaration;
import sa_SynthesisUtilize.MessagePort;
import sa_SynthesisUtilize.Mode;
import sa_SynthesisUtilize.SAElement;
import sa_SynthesisUtilize.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SA Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.SAElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.SAElementImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.SAElementImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.SAElementImpl#getApplicationData <em>Application Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SAElementImpl extends MinimalEObjectImpl.Container implements SAElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<MessagePort> ports;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * The cached value of the '{@link #getApplicationData() <em>Application Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataDeclaration> applicationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SAElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.SA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.SA_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessagePort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<MessagePort>(MessagePort.class, this, SaPackage.SA_ELEMENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, SaPackage.SA_ELEMENT__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataDeclaration> getApplicationData() {
		if (applicationData == null) {
			applicationData = new EObjectContainmentEList<DataDeclaration>(DataDeclaration.class, this, SaPackage.SA_ELEMENT__APPLICATION_DATA);
		}
		return applicationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.SA_ELEMENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case SaPackage.SA_ELEMENT__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
			case SaPackage.SA_ELEMENT__APPLICATION_DATA:
				return ((InternalEList<?>)getApplicationData()).basicRemove(otherEnd, msgs);
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
			case SaPackage.SA_ELEMENT__NAME:
				return getName();
			case SaPackage.SA_ELEMENT__PORTS:
				return getPorts();
			case SaPackage.SA_ELEMENT__MODES:
				return getModes();
			case SaPackage.SA_ELEMENT__APPLICATION_DATA:
				return getApplicationData();
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
			case SaPackage.SA_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case SaPackage.SA_ELEMENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends MessagePort>)newValue);
				return;
			case SaPackage.SA_ELEMENT__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
				return;
			case SaPackage.SA_ELEMENT__APPLICATION_DATA:
				getApplicationData().clear();
				getApplicationData().addAll((Collection<? extends DataDeclaration>)newValue);
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
			case SaPackage.SA_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SaPackage.SA_ELEMENT__PORTS:
				getPorts().clear();
				return;
			case SaPackage.SA_ELEMENT__MODES:
				getModes().clear();
				return;
			case SaPackage.SA_ELEMENT__APPLICATION_DATA:
				getApplicationData().clear();
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
			case SaPackage.SA_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SaPackage.SA_ELEMENT__PORTS:
				return ports != null && !ports.isEmpty();
			case SaPackage.SA_ELEMENT__MODES:
				return modes != null && !modes.isEmpty();
			case SaPackage.SA_ELEMENT__APPLICATION_DATA:
				return applicationData != null && !applicationData.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SAElementImpl
