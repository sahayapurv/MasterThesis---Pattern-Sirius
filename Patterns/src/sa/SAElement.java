/**
 */
package sa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SA Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa.SAElement#getName <em>Name</em>}</li>
 *   <li>{@link sa.SAElement#getPorts <em>Ports</em>}</li>
 *   <li>{@link sa.SAElement#getModes <em>Modes</em>}</li>
 *   <li>{@link sa.SAElement#getApplicationData <em>Application Data</em>}</li>
 * </ul>
 *
 * @see sa.SaPackage#getSAElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SAElementNameMustBeUnique NameMustNotBeEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SAElementNameMustBeUnique='SoftwareArchitecture.allInstances().SAElements-&gt;select(s : SAElement | s.name = self.name)-&gt;size() = 1' NameMustNotBeEmpty='name &lt;&gt; \'\''"
 * @generated
 */
public interface SAElement extends EObject {
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
	 * @see sa.SaPackage#getSAElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sa.SAElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link sa.MessagePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see sa.SaPackage#getSAElement_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessagePort> getPorts();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link sa.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see sa.SaPackage#getSAElement_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

	/**
	 * Returns the value of the '<em><b>Application Data</b></em>' containment reference list.
	 * The list contents are of type {@link sa.DataDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Data</em>' containment reference list.
	 * @see sa.SaPackage#getSAElement_ApplicationData()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataDeclaration> getApplicationData();

} // SAElement
