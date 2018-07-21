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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sa_SynthesisUtilize.Constant;
import sa_SynthesisUtilize.PrimitiveDataDeclaration;
import sa_SynthesisUtilize.PrimitiveType;
import sa_SynthesisUtilize.SaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.PrimitiveDataDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.PrimitiveDataDeclarationImpl#getValueExp <em>Value Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveDataDeclarationImpl extends DataDeclarationImpl implements PrimitiveDataDeclaration {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType TYPE_EDEFAULT = PrimitiveType.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueExp() <em>Value Exp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExp()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> valueExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveDataDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.PRIMITIVE_DATA_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveType newType) {
		PrimitiveType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.PRIMITIVE_DATA_DECLARATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getValueExp() {
		if (valueExp == null) {
			valueExp = new EObjectContainmentEList<Constant>(Constant.class, this, SaPackage.PRIMITIVE_DATA_DECLARATION__VALUE_EXP);
		}
		return valueExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.PRIMITIVE_DATA_DECLARATION__VALUE_EXP:
				return ((InternalEList<?>)getValueExp()).basicRemove(otherEnd, msgs);
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
			case SaPackage.PRIMITIVE_DATA_DECLARATION__TYPE:
				return getType();
			case SaPackage.PRIMITIVE_DATA_DECLARATION__VALUE_EXP:
				return getValueExp();
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
			case SaPackage.PRIMITIVE_DATA_DECLARATION__TYPE:
				setType((PrimitiveType)newValue);
				return;
			case SaPackage.PRIMITIVE_DATA_DECLARATION__VALUE_EXP:
				getValueExp().clear();
				getValueExp().addAll((Collection<? extends Constant>)newValue);
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
			case SaPackage.PRIMITIVE_DATA_DECLARATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SaPackage.PRIMITIVE_DATA_DECLARATION__VALUE_EXP:
				getValueExp().clear();
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
			case SaPackage.PRIMITIVE_DATA_DECLARATION__TYPE:
				return type != TYPE_EDEFAULT;
			case SaPackage.PRIMITIVE_DATA_DECLARATION__VALUE_EXP:
				return valueExp != null && !valueExp.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PrimitiveDataDeclarationImpl
