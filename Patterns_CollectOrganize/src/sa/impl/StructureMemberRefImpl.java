/**
 */
package sa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa.PrimitiveDataDeclaration;
import sa.SaPackage;
import sa.Structure;
import sa.StructureMemberRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Member Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa.impl.StructureMemberRefImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link sa.impl.StructureMemberRefImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMemberRefImpl extends ExpressionImpl implements StructureMemberRef {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Structure structure;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveDataDeclaration member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMemberRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.STRUCTURE_MEMBER_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getStructure() {
		if (structure != null && structure.eIsProxy()) {
			InternalEObject oldStructure = (InternalEObject)structure;
			structure = (Structure)eResolveProxy(oldStructure);
			if (structure != oldStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.STRUCTURE_MEMBER_REF__STRUCTURE, oldStructure, structure));
			}
		}
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Structure newStructure) {
		Structure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.STRUCTURE_MEMBER_REF__STRUCTURE, oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataDeclaration getMember() {
		if (member != null && member.eIsProxy()) {
			InternalEObject oldMember = (InternalEObject)member;
			member = (PrimitiveDataDeclaration)eResolveProxy(oldMember);
			if (member != oldMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SaPackage.STRUCTURE_MEMBER_REF__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataDeclaration basicGetMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(PrimitiveDataDeclaration newMember) {
		PrimitiveDataDeclaration oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.STRUCTURE_MEMBER_REF__MEMBER, oldMember, member));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SaPackage.STRUCTURE_MEMBER_REF__STRUCTURE:
				if (resolve) return getStructure();
				return basicGetStructure();
			case SaPackage.STRUCTURE_MEMBER_REF__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
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
			case SaPackage.STRUCTURE_MEMBER_REF__STRUCTURE:
				setStructure((Structure)newValue);
				return;
			case SaPackage.STRUCTURE_MEMBER_REF__MEMBER:
				setMember((PrimitiveDataDeclaration)newValue);
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
			case SaPackage.STRUCTURE_MEMBER_REF__STRUCTURE:
				setStructure((Structure)null);
				return;
			case SaPackage.STRUCTURE_MEMBER_REF__MEMBER:
				setMember((PrimitiveDataDeclaration)null);
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
			case SaPackage.STRUCTURE_MEMBER_REF__STRUCTURE:
				return structure != null;
			case SaPackage.STRUCTURE_MEMBER_REF__MEMBER:
				return member != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMemberRefImpl
