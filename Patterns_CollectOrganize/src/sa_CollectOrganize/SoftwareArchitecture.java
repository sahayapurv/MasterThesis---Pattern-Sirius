/**
 */
package sa_CollectOrganize;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.SoftwareArchitecture#getSAElements <em>SA Elements</em>}</li>
 *   <li>{@link sa_CollectOrganize.SoftwareArchitecture#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see sa_CollectOrganize.SaPackage#getSoftwareArchitecture()
 * @model
 * @generated
 */
public interface SoftwareArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>SA Elements</b></em>' containment reference list.
	 * The list contents are of type {@link sa_CollectOrganize.SAElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SA Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SA Elements</em>' containment reference list.
	 * @see sa_CollectOrganize.SaPackage#getSoftwareArchitecture_SAElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SAElement> getSAElements();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link sa_CollectOrganize.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see sa_CollectOrganize.SaPackage#getSoftwareArchitecture_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // SoftwareArchitecture
