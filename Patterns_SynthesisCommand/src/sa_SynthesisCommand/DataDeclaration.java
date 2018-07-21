/**
 */
package sa_SynthesisCommand;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.DataDeclaration#getDataName <em>Data Name</em>}</li>
 *   <li>{@link sa_SynthesisCommand.DataDeclaration#getValue <em>Value</em>}</li>
 *   <li>{@link sa_SynthesisCommand.DataDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getDataDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface DataDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Name</em>' attribute.
	 * @see #setDataName(String)
	 * @see sa_SynthesisCommand.SaPackage#getDataDeclaration_DataName()
	 * @model required="true"
	 * @generated
	 */
	String getDataName();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.DataDeclaration#getDataName <em>Data Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Name</em>' attribute.
	 * @see #getDataName()
	 * @generated
	 */
	void setDataName(String value);

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
	 * @see sa_SynthesisCommand.SaPackage#getDataDeclaration_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.DataDeclaration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sa_SynthesisCommand.SaPackage#getDataDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.DataDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataDeclaration
