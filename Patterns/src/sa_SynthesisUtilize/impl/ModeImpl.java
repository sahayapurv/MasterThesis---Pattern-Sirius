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

import sa_SynthesisUtilize.BehaviouralElement;
import sa_SynthesisUtilize.EnterMode;
import sa_SynthesisUtilize.ExitMode;
import sa_SynthesisUtilize.Mode;
import sa_SynthesisUtilize.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.ModeImpl#getName <em>Name</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.ModeImpl#getBehaviouralElements <em>Behavioural Elements</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.ModeImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.ModeImpl#getExits <em>Exits</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModeImpl extends MinimalEObjectImpl.Container implements Mode {
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
	 * The cached value of the '{@link #getBehaviouralElements() <em>Behavioural Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviouralElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviouralElement> behaviouralElements;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<EnterMode> entries;

	/**
	 * The cached value of the '{@link #getExits() <em>Exits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExits()
	 * @generated
	 * @ordered
	 */
	protected EList<ExitMode> exits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.MODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.MODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviouralElement> getBehaviouralElements() {
		if (behaviouralElements == null) {
			behaviouralElements = new EObjectContainmentEList<BehaviouralElement>(BehaviouralElement.class, this, SaPackage.MODE__BEHAVIOURAL_ELEMENTS);
		}
		return behaviouralElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnterMode> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<EnterMode>(EnterMode.class, this, SaPackage.MODE__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExitMode> getExits() {
		if (exits == null) {
			exits = new EObjectContainmentEList<ExitMode>(ExitMode.class, this, SaPackage.MODE__EXITS);
		}
		return exits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.MODE__BEHAVIOURAL_ELEMENTS:
				return ((InternalEList<?>)getBehaviouralElements()).basicRemove(otherEnd, msgs);
			case SaPackage.MODE__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case SaPackage.MODE__EXITS:
				return ((InternalEList<?>)getExits()).basicRemove(otherEnd, msgs);
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
			case SaPackage.MODE__NAME:
				return getName();
			case SaPackage.MODE__BEHAVIOURAL_ELEMENTS:
				return getBehaviouralElements();
			case SaPackage.MODE__ENTRIES:
				return getEntries();
			case SaPackage.MODE__EXITS:
				return getExits();
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
			case SaPackage.MODE__NAME:
				setName((String)newValue);
				return;
			case SaPackage.MODE__BEHAVIOURAL_ELEMENTS:
				getBehaviouralElements().clear();
				getBehaviouralElements().addAll((Collection<? extends BehaviouralElement>)newValue);
				return;
			case SaPackage.MODE__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends EnterMode>)newValue);
				return;
			case SaPackage.MODE__EXITS:
				getExits().clear();
				getExits().addAll((Collection<? extends ExitMode>)newValue);
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
			case SaPackage.MODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SaPackage.MODE__BEHAVIOURAL_ELEMENTS:
				getBehaviouralElements().clear();
				return;
			case SaPackage.MODE__ENTRIES:
				getEntries().clear();
				return;
			case SaPackage.MODE__EXITS:
				getExits().clear();
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
			case SaPackage.MODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SaPackage.MODE__BEHAVIOURAL_ELEMENTS:
				return behaviouralElements != null && !behaviouralElements.isEmpty();
			case SaPackage.MODE__ENTRIES:
				return entries != null && !entries.isEmpty();
			case SaPackage.MODE__EXITS:
				return exits != null && !exits.isEmpty();
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

} //ModeImpl
