/**
 */
package sa_CollectOrganize;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.EnumConst#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link sa_CollectOrganize.EnumConst#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sa_CollectOrganize.SaPackage#getEnumConst()
 * @model
 * @generated
 */
public interface EnumConst extends Constant {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' reference.
	 * @see #setEnumeration(Enumeration)
	 * @see sa_CollectOrganize.SaPackage#getEnumConst_Enumeration()
	 * @model
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.EnumConst#getEnumeration <em>Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see sa_CollectOrganize.SaPackage#getEnumConst_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.EnumConst#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EnumConst
