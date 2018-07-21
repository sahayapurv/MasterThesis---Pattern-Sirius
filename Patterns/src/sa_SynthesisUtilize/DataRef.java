/**
 */
package sa_SynthesisUtilize;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.DataRef#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getDataRef()
 * @model
 * @generated
 */
public interface DataRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(DataDeclaration)
	 * @see sa_SynthesisUtilize.SaPackage#getDataRef_Declaration()
	 * @model required="true"
	 * @generated
	 */
	DataDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.DataRef#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(DataDeclaration value);

} // DataRef
