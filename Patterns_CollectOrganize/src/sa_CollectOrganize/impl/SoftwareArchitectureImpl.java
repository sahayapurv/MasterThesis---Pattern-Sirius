/**
 */
package sa_CollectOrganize.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sa_CollectOrganize.Link;
import sa_CollectOrganize.SAElement;
import sa_CollectOrganize.SaPackage;
import sa_CollectOrganize.SoftwareArchitecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.impl.SoftwareArchitectureImpl#getSAElements <em>SA Elements</em>}</li>
 *   <li>{@link sa_CollectOrganize.impl.SoftwareArchitectureImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareArchitectureImpl extends MinimalEObjectImpl.Container implements SoftwareArchitecture {
	/**
	 * The cached value of the '{@link #getSAElements() <em>SA Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SAElement> saElements;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.SOFTWARE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAElement> getSAElements() {
		if (saElements == null) {
			saElements = new EObjectContainmentEList<SAElement>(SAElement.class, this, SaPackage.SOFTWARE_ARCHITECTURE__SA_ELEMENTS);
		}
		return saElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, SaPackage.SOFTWARE_ARCHITECTURE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.SOFTWARE_ARCHITECTURE__SA_ELEMENTS:
				return ((InternalEList<?>)getSAElements()).basicRemove(otherEnd, msgs);
			case SaPackage.SOFTWARE_ARCHITECTURE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case SaPackage.SOFTWARE_ARCHITECTURE__SA_ELEMENTS:
				return getSAElements();
			case SaPackage.SOFTWARE_ARCHITECTURE__LINKS:
				return getLinks();
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
			case SaPackage.SOFTWARE_ARCHITECTURE__SA_ELEMENTS:
				getSAElements().clear();
				getSAElements().addAll((Collection<? extends SAElement>)newValue);
				return;
			case SaPackage.SOFTWARE_ARCHITECTURE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
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
			case SaPackage.SOFTWARE_ARCHITECTURE__SA_ELEMENTS:
				getSAElements().clear();
				return;
			case SaPackage.SOFTWARE_ARCHITECTURE__LINKS:
				getLinks().clear();
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
			case SaPackage.SOFTWARE_ARCHITECTURE__SA_ELEMENTS:
				return saElements != null && !saElements.isEmpty();
			case SaPackage.SOFTWARE_ARCHITECTURE__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareArchitectureImpl
