/**
 */
package sa_SynthesisUtilize;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.StructureElement#getMember <em>Member</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.StructureElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getStructureElement()
 * @model
 * @generated
 */
public interface StructureElement extends StructuredDataType {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(DataDeclaration)
	 * @see sa_SynthesisUtilize.SaPackage#getStructureElement_Member()
	 * @model required="true"
	 * @generated
	 */
	DataDeclaration getMember();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.StructureElement#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(DataDeclaration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Constant)
	 * @see sa_SynthesisUtilize.SaPackage#getStructureElement_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constant getValue();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.StructureElement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Constant value);

} // StructureElement
