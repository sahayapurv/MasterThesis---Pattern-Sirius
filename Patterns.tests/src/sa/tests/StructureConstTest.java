/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.StructureConst;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structure Const</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureConstTest extends ConstantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructureConstTest.class);
	}

	/**
	 * Constructs a new Structure Const test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureConstTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structure Const test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructureConst getFixture() {
		return (StructureConst)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createStructureConst());
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

} //StructureConstTest
