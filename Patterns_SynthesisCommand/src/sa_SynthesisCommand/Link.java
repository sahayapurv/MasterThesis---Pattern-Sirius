/**
 */
package sa_SynthesisCommand;

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
 *   <li>{@link sa_SynthesisCommand.Link#getSource <em>Source</em>}</li>
 *   <li>{@link sa_SynthesisCommand.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link sa_SynthesisCommand.Link#getConditionExp <em>Condition Exp</em>}</li>
 *   <li>{@link sa_SynthesisCommand.Link#getCondition <em>Condition</em>}</li>
 *   <li>{@link sa_SynthesisCommand.Link#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sa_SynthesisCommand.LinkableElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LinkableElement)
	 * @see sa_SynthesisCommand.SaPackage#getLink_Source()
	 * @see sa_SynthesisCommand.LinkableElement#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	LinkableElement getSource();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LinkableElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sa_SynthesisCommand.Action#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Action)
	 * @see sa_SynthesisCommand.SaPackage#getLink_Target()
	 * @see sa_SynthesisCommand.Action#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Action getTarget();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Action value);

	/**
	 * Returns the value of the '<em><b>Condition Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Exp</em>' containment reference.
	 * @see #setConditionExp(Expression)
	 * @see sa_SynthesisCommand.SaPackage#getLink_ConditionExp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getConditionExp();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.Link#getConditionExp <em>Condition Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Exp</em>' containment reference.
	 * @see #getConditionExp()
	 * @generated
	 */
	void setConditionExp(Expression value);

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
	 * @see sa_SynthesisCommand.SaPackage#getLink_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.Link#getCondition <em>Condition</em>}' attribute.
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
	 * @see sa_SynthesisCommand.SaPackage#getLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sa_SynthesisCommand.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Link
