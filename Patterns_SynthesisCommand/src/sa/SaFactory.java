/**
 */
package sa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sa.SaPackage
 * @generated
 */
public interface SaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SaFactory eINSTANCE = sa.impl.SaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Software Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Architecture</em>'.
	 * @generated
	 */
	SoftwareArchitecture createSoftwareArchitecture();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>In Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Message Port</em>'.
	 * @generated
	 */
	InMessagePort createInMessagePort();

	/**
	 * Returns a new object of class '<em>Out Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Message Port</em>'.
	 * @generated
	 */
	OutMessagePort createOutMessagePort();

	/**
	 * Returns a new object of class '<em>Initial Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Mode</em>'.
	 * @generated
	 */
	InitialMode createInitialMode();

	/**
	 * Returns a new object of class '<em>External Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Mode</em>'.
	 * @generated
	 */
	ExternalMode createExternalMode();

	/**
	 * Returns a new object of class '<em>Enter Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enter Mode</em>'.
	 * @generated
	 */
	EnterMode createEnterMode();

	/**
	 * Returns a new object of class '<em>Exit Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Mode</em>'.
	 * @generated
	 */
	ExitMode createExitMode();

	/**
	 * Returns a new object of class '<em>Call Async Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Async Service</em>'.
	 * @generated
	 */
	CallAsyncService createCallAsyncService();

	/**
	 * Returns a new object of class '<em>Call Sync Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Sync Service</em>'.
	 * @generated
	 */
	CallSyncService createCallSyncService();

	/**
	 * Returns a new object of class '<em>Start Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Timer</em>'.
	 * @generated
	 */
	StartTimer createStartTimer();

	/**
	 * Returns a new object of class '<em>Stop Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Timer</em>'.
	 * @generated
	 */
	StopTimer createStopTimer();

	/**
	 * Returns a new object of class '<em>Store Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Data</em>'.
	 * @generated
	 */
	StoreData createStoreData();

	/**
	 * Returns a new object of class '<em>Broadcast Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Send Message</em>'.
	 * @generated
	 */
	BroadcastSendMessage createBroadcastSendMessage();

	/**
	 * Returns a new object of class '<em>Unicast Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unicast Send Message</em>'.
	 * @generated
	 */
	UnicastSendMessage createUnicastSendMessage();

	/**
	 * Returns a new object of class '<em>Multicast Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicast Send Message</em>'.
	 * @generated
	 */
	MulticastSendMessage createMulticastSendMessage();

	/**
	 * Returns a new object of class '<em>Sense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense</em>'.
	 * @generated
	 */
	Sense createSense();

	/**
	 * Returns a new object of class '<em>Sense Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Position</em>'.
	 * @generated
	 */
	SensePosition createSensePosition();

	/**
	 * Returns a new object of class '<em>Sense Accelerometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Accelerometer</em>'.
	 * @generated
	 */
	SenseAccelerometer createSenseAccelerometer();

	/**
	 * Returns a new object of class '<em>Actuate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuate</em>'.
	 * @generated
	 */
	Actuate createActuate();

	/**
	 * Returns a new object of class '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join</em>'.
	 * @generated
	 */
	Join createJoin();

	/**
	 * Returns a new object of class '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork</em>'.
	 * @generated
	 */
	Fork createFork();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Service Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Callback</em>'.
	 * @generated
	 */
	ServiceCallback createServiceCallback();

	/**
	 * Returns a new object of class '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call</em>'.
	 * @generated
	 */
	ServiceCall createServiceCall();

	/**
	 * Returns a new object of class '<em>Receive Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Message</em>'.
	 * @generated
	 */
	ReceiveMessage createReceiveMessage();

	/**
	 * Returns a new object of class '<em>Timer Fired</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Fired</em>'.
	 * @generated
	 */
	TimerFired createTimerFired();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Primitive Data Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Declaration</em>'.
	 * @generated
	 */
	PrimitiveDataDeclaration createPrimitiveDataDeclaration();

	/**
	 * Returns a new object of class '<em>Structured Data Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Data Declaration</em>'.
	 * @generated
	 */
	StructuredDataDeclaration createStructuredDataDeclaration();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Integer Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Const</em>'.
	 * @generated
	 */
	IntegerConst createIntegerConst();

	/**
	 * Returns a new object of class '<em>Boolean Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Const</em>'.
	 * @generated
	 */
	BooleanConst createBooleanConst();

	/**
	 * Returns a new object of class '<em>Real Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Const</em>'.
	 * @generated
	 */
	RealConst createRealConst();

	/**
	 * Returns a new object of class '<em>String Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Const</em>'.
	 * @generated
	 */
	StringConst createStringConst();

	/**
	 * Returns a new object of class '<em>Enum Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Const</em>'.
	 * @generated
	 */
	EnumConst createEnumConst();

	/**
	 * Returns a new object of class '<em>Structure Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Const</em>'.
	 * @generated
	 */
	StructureConst createStructureConst();

	/**
	 * Returns a new object of class '<em>Structure Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Element</em>'.
	 * @generated
	 */
	StructureElement createStructureElement();

	/**
	 * Returns a new object of class '<em>Null Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Exp</em>'.
	 * @generated
	 */
	NullExp createNullExp();

	/**
	 * Returns a new object of class '<em>Data Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Ref</em>'.
	 * @generated
	 */
	DataRef createDataRef();

	/**
	 * Returns a new object of class '<em>Structure Member Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Member Ref</em>'.
	 * @generated
	 */
	StructureMemberRef createStructureMemberRef();

	/**
	 * Returns a new object of class '<em>Arithmetic Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expr</em>'.
	 * @generated
	 */
	ArithmeticExpr createArithmeticExpr();

	/**
	 * Returns a new object of class '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expr</em>'.
	 * @generated
	 */
	BooleanExpr createBooleanExpr();

	/**
	 * Returns a new object of class '<em>Relational Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expr</em>'.
	 * @generated
	 */
	RelationalExpr createRelationalExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SaPackage getSaPackage();

} //SaFactory
