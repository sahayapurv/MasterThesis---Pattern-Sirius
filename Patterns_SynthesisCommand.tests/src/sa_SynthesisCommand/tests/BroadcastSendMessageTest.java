/**
 */
package sa_SynthesisCommand.tests;

import junit.textui.TestRunner;

import sa_SynthesisCommand.BroadcastSendMessage;
import sa_SynthesisCommand.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Broadcast Send Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BroadcastSendMessageTest extends SendMessageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BroadcastSendMessageTest.class);
	}

	/**
	 * Constructs a new Broadcast Send Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSendMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Broadcast Send Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BroadcastSendMessage getFixture() {
		return (BroadcastSendMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createBroadcastSendMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BroadcastSendMessageTest
