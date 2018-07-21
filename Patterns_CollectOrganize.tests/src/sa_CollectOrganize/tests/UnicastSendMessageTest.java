/**
 */
package sa_CollectOrganize.tests;

import junit.textui.TestRunner;

import sa_CollectOrganize.SaFactory;
import sa_CollectOrganize.UnicastSendMessage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unicast Send Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnicastSendMessageTest extends SendMessageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnicastSendMessageTest.class);
	}

	/**
	 * Constructs a new Unicast Send Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnicastSendMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unicast Send Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnicastSendMessage getFixture() {
		return (UnicastSendMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createUnicastSendMessage());
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

} //UnicastSendMessageTest
