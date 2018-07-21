/**
 */
package sa_SynthesisCommand;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Message Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sa_SynthesisCommand.InMessagePort#getRcv_msg <em>Rcv msg</em>}</li>
 * </ul>
 *
 * @see sa_SynthesisCommand.SaPackage#getInMessagePort()
 * @model
 * @generated
 */
public interface InMessagePort extends MessagePort {
	/**
	 * Returns the value of the '<em><b>Rcv msg</b></em>' reference list.
	 * The list contents are of type {@link sa_SynthesisCommand.ReceiveMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcv msg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcv msg</em>' reference list.
	 * @see sa_SynthesisCommand.SaPackage#getInMessagePort_Rcv_msg()
	 * @model
	 * @generated
	 */
	EList<ReceiveMessage> getRcv_msg();

} // InMessagePort
