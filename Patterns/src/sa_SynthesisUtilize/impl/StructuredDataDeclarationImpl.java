/**
 */
package sa_SynthesisUtilize.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sa_SynthesisUtilize.SaPackage;
import sa_SynthesisUtilize.StructuredDataDeclaration;
import sa_SynthesisUtilize.StructuredDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.impl.StructuredDataDeclarationImpl#getTypeExp <em>Type Exp</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.impl.StructuredDataDeclarationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredDataDeclarationImpl extends DataDeclarationImpl implements StructuredDataDeclaration {
	/**
	 * The cached value of the '{@link #getTypeExp() <em>Type Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeExp()
	 * @generated
	 * @ordered
	 */
	protected StructuredDataType typeExp;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredDataDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SaPackage.Literals.STRUCTURED_DATA_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDataType getTypeExp() {
		return typeExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeExp(StructuredDataType newTypeExp, NotificationChain msgs) {
		StructuredDataType oldTypeExp = typeExp;
		typeExp = newTypeExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP, oldTypeExp, newTypeExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeExp(StructuredDataType newTypeExp) {
		if (newTypeExp != typeExp) {
			NotificationChain msgs = null;
			if (typeExp != null)
				msgs = ((InternalEObject)typeExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP, null, msgs);
			if (newTypeExp != null)
				msgs = ((InternalEObject)newTypeExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP, null, msgs);
			msgs = basicSetTypeExp(newTypeExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP, newTypeExp, newTypeExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SaPackage.STRUCTURED_DATA_DECLARATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP:
				return basicSetTypeExp(null, msgs);
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
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP:
				return getTypeExp();
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE:
				return getType();
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
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP:
				setTypeExp((StructuredDataType)newValue);
				return;
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE:
				setType((String)newValue);
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
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP:
				setTypeExp((StructuredDataType)null);
				return;
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE_EXP:
				return typeExp != null;
			case SaPackage.STRUCTURED_DATA_DECLARATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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

} //StructuredDataDeclarationImpl
