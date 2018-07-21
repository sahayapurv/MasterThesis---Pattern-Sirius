/**
 */
package sa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Member Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.StructureMemberRef#getStructure <em>Structure</em>}</li>
 *   <li>{@link sa.StructureMemberRef#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getStructureMemberRef()
 * @model
 * @generated
 */
public interface StructureMemberRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' reference.
	 * @see #setStructure(Structure)
	 * @see sa.SaPackage#getStructureMemberRef_Structure()
	 * @model required="true"
	 * @generated
	 */
	Structure getStructure();

	/**
	 * Sets the value of the '{@link sa.StructureMemberRef#getStructure <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Structure value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(PrimitiveDataDeclaration)
	 * @see sa.SaPackage#getStructureMemberRef_Member()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveDataDeclaration getMember();

	/**
	 * Sets the value of the '{@link sa.StructureMemberRef#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(PrimitiveDataDeclaration value);

} // StructureMemberRef
