/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.ReceiveMessage;
import sa.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Receive Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReceiveMessageTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReceiveMessageTest.class);
	}

	/**
	 * Constructs a new Receive Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Receive Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReceiveMessage getFixture() {
		return (ReceiveMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createReceiveMessage());
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

} //ReceiveMessageTest
