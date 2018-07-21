/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.MulticastSendMessage;
import sa.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multicast Send Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MulticastSendMessageTest extends SendMessageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MulticastSendMessageTest.class);
	}

	/**
	 * Constructs a new Multicast Send Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticastSendMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multicast Send Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MulticastSendMessage getFixture() {
		return (MulticastSendMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createMulticastSendMessage());
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

} //MulticastSendMessageTest
