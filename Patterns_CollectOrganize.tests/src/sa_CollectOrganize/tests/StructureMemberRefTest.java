/**
 */
package sa_CollectOrganize.tests;

import junit.textui.TestRunner;

import sa_CollectOrganize.SaFactory;
import sa_CollectOrganize.StructureMemberRef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structure Member Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureMemberRefTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructureMemberRefTest.class);
	}

	/**
	 * Constructs a new Structure Member Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMemberRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structure Member Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructureMemberRef getFixture() {
		return (StructureMemberRef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createStructureMemberRef());
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

} //StructureMemberRefTest
