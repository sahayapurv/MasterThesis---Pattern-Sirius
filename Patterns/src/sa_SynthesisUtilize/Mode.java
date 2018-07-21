/**
 */
package sa_SynthesisUtilize;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisUtilize.Mode#getName <em>Name</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.Mode#getBehaviouralElements <em>Behavioural Elements</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.Mode#getEntries <em>Entries</em>}</li>
 *   <li>{@link sa_SynthesisUtilize.Mode#getExits <em>Exits</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisUtilize.SaPackage#getMode()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ModeNameMustBeUnique NameMustNotContainWhiteSpace'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ModeNameMustBeUnique='SAElement.allInstances().modes-&gt;select(s : Mode | s.name = self.name)-&gt;size() = 1' NameMustNotContainWhiteSpace='name.toString().characters()-&gt;select(c : String | c= \' \')-&gt;size()=0'"
 * @generated
 */
public interface Mode extends EObject {
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
	 * @see sa_SynthesisUtilize.SaPackage#getMode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sa_SynthesisUtilize.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Behavioural Elements</b></em>' containment reference list.
	 * The list contents are of type {@link sa_SynthesisUtilize.BehaviouralElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioural Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioural Elements</em>' containment reference list.
	 * @see sa_SynthesisUtilize.SaPackage#getMode_BehaviouralElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviouralElement> getBehaviouralElements();

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link sa_SynthesisUtilize.EnterMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see sa_SynthesisUtilize.SaPackage#getMode_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnterMode> getEntries();

	/**
	 * Returns the value of the '<em><b>Exits</b></em>' containment reference list.
	 * The list contents are of type {@link sa_SynthesisUtilize.ExitMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exits</em>' containment reference list.
	 * @see sa_SynthesisUtilize.SaPackage#getMode_Exits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExitMode> getExits();

} // Mode
