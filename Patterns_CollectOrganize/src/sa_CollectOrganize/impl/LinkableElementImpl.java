/**
 */
package sa_CollectOrganize.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sa_CollectOrganize.Action;
import sa_CollectOrganize.Link;
import sa_CollectOrganize.LinkableElement;
import sa_CollectOrganize.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linkable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.impl.LinkableElementImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link sa_CollectOrganize.impl.LinkableElementImpl#getInAction <em>In Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkableElementImpl extends BehaviouralElementImpl implements LinkableElement {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> outgoing;

	/**
	 * The cached value of the '{@link #getInAction() <em>In Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> inAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.LINKABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Link>(Link.class, this, SaPackage.LINKABLE_ELEMENT__OUTGOING, SaPackage.LINK__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getInAction() {
		if (inAction == null) {
			inAction = new EObjectResolvingEList<Action>(Action.class, this, SaPackage.LINKABLE_ELEMENT__IN_ACTION);
		}
		return inAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.LINKABLE_ELEMENT__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.LINKABLE_ELEMENT__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case SaPackage.LINKABLE_ELEMENT__OUTGOING:
				return getOutgoing();
			case SaPackage.LINKABLE_ELEMENT__IN_ACTION:
				return getInAction();
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
			case SaPackage.LINKABLE_ELEMENT__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Link>)newValue);
				return;
			case SaPackage.LINKABLE_ELEMENT__IN_ACTION:
				getInAction().clear();
				getInAction().addAll((Collection<? extends Action>)newValue);
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
			case SaPackage.LINKABLE_ELEMENT__OUTGOING:
				getOutgoing().clear();
				return;
			case SaPackage.LINKABLE_ELEMENT__IN_ACTION:
				getInAction().clear();
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
			case SaPackage.LINKABLE_ELEMENT__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case SaPackage.LINKABLE_ELEMENT__IN_ACTION:
				return inAction != null && !inAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkableElementImpl
