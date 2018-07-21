/**
 */
package sa_CollectOrganize;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_CollectOrganize.Link#getSource <em>Source</em>}</li>
 *   <li>{@link sa_CollectOrganize.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link sa_CollectOrganize.Link#getConditionExp <em>Condition Exp</em>}</li>
 *   <li>{@link sa_CollectOrganize.Link#getCondition <em>Condition</em>}</li>
 *   <li>{@link sa_CollectOrganize.Link#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sa_CollectOrganize.SaPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sa_CollectOrganize.LinkableElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LinkableElement)
	 * @see sa_CollectOrganize.SaPackage#getLink_Source()
	 * @see sa_CollectOrganize.LinkableElement#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	LinkableElement getSource();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LinkableElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sa_CollectOrganize.Action#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Action)
	 * @see sa_CollectOrganize.SaPackage#getLink_Target()
	 * @see sa_CollectOrganize.Action#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Action getTarget();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Action value);

	/**
	 * Returns the value of the '<em><b>Condition Exp</b></em>' containment reference list.
	 * The list contents are of type {@link sa_CollectOrganize.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Exp</em>' containment reference list.
	 * @see sa_CollectOrganize.SaPackage#getLink_ConditionExp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getConditionExp();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see sa_CollectOrganize.SaPackage#getLink_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.Link#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

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
	 * @see sa_CollectOrganize.SaPackage#getLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sa_CollectOrganize.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Link
