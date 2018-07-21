/**
 */
package sa_SynthesisUtilize.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sa_SynthesisUtilize.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SaFactoryImpl extends EFactoryImpl implements SaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SaFactory init() {
		try {
			SaFactory theSaFactory = (SaFactory)EPackage.Registry.INSTANCE.getEFactory(SaPackage.eNS_URI);
			if (theSaFactory != null) {
				return theSaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SaPackage.SOFTWARE_ARCHITECTURE: return createSoftwareArchitecture();
			case SaPackage.COMPONENT: return createComponent();
			case SaPackage.CONTROLLER: return createController();
			case SaPackage.IN_MESSAGE_PORT: return createInMessagePort();
			case SaPackage.OUT_MESSAGE_PORT: return createOutMessagePort();
			case SaPackage.INITIAL_MODE: return createInitialMode();
			case SaPackage.EXTERNAL_MODE: return createExternalMode();
			case SaPackage.INTERNAL_CONTROLLER: return createInternalController();
			case SaPackage.ENTER_MODE: return createEnterMode();
			case SaPackage.EXIT_MODE: return createExitMode();
			case SaPackage.CALL_ASYNC_SERVICE: return createCallAsyncService();
			case SaPackage.CALL_SYNC_SERVICE: return createCallSyncService();
			case SaPackage.START_TIMER: return createStartTimer();
			case SaPackage.STOP_TIMER: return createStopTimer();
			case SaPackage.STORE_DATA: return createStoreData();
			case SaPackage.BROADCAST_SEND_MESSAGE: return createBroadcastSendMessage();
			case SaPackage.UNICAST_SEND_MESSAGE: return createUnicastSendMessage();
			case SaPackage.MULTICAST_SEND_MESSAGE: return createMulticastSendMessage();
			case SaPackage.SENSE: return createSense();
			case SaPackage.SENSE_POSITION: return createSensePosition();
			case SaPackage.SENSE_ACCELEROMETER: return createSenseAccelerometer();
			case SaPackage.ACTUATE: return createActuate();
			case SaPackage.JOIN: return createJoin();
			case SaPackage.FORK: return createFork();
			case SaPackage.CHOICE: return createChoice();
			case SaPackage.SERVICE_CALLBACK: return createServiceCallback();
			case SaPackage.SERVICE_CALL: return createServiceCall();
			case SaPackage.RECEIVE_MESSAGE: return createReceiveMessage();
			case SaPackage.TIMER_FIRED: return createTimerFired();
			case SaPackage.LINK: return createLink();
			case SaPackage.PRIMITIVE_DATA_DECLARATION: return createPrimitiveDataDeclaration();
			case SaPackage.STRUCTURED_DATA_DECLARATION: return createStructuredDataDeclaration();
			case SaPackage.ENUMERATION: return createEnumeration();
			case SaPackage.INTEGER_CONST: return createIntegerConst();
			case SaPackage.BOOLEAN_CONST: return createBooleanConst();
			case SaPackage.REAL_CONST: return createRealConst();
			case SaPackage.STRING_CONST: return createStringConst();
			case SaPackage.ENUM_CONST: return createEnumConst();
			case SaPackage.STRUCTURE_CONST: return createStructureConst();
			case SaPackage.STRUCTURE_ELEMENT: return createStructureElement();
			case SaPackage.NULL_EXP: return createNullExp();
			case SaPackage.DATA_REF: return createDataRef();
			case SaPackage.STRUCTURE_MEMBER_REF: return createStructureMemberRef();
			case SaPackage.ARITHMETIC_EXPR: return createArithmeticExpr();
			case SaPackage.BOOLEAN_EXPR: return createBooleanExpr();
			case SaPackage.RELATIONAL_EXPR: return createRelationalExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SaPackage.PRIMITIVE_TYPE:
				return createPrimitiveTypeFromString(eDataType, initialValue);
			case SaPackage.ARITHMETIC_OP:
				return createArithmeticOpFromString(eDataType, initialValue);
			case SaPackage.BOOLEAN_OP:
				return createBooleanOpFromString(eDataType, initialValue);
			case SaPackage.RELATIONAL_OP:
				return createRelationalOpFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SaPackage.PRIMITIVE_TYPE:
				return convertPrimitiveTypeToString(eDataType, instanceValue);
			case SaPackage.ARITHMETIC_OP:
				return convertArithmeticOpToString(eDataType, instanceValue);
			case SaPackage.BOOLEAN_OP:
				return convertBooleanOpToString(eDataType, instanceValue);
			case SaPackage.RELATIONAL_OP:
				return convertRelationalOpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareArchitecture createSoftwareArchitecture() {
		SoftwareArchitectureImpl softwareArchitecture = new SoftwareArchitectureImpl();
		return softwareArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMessagePort createInMessagePort() {
		InMessagePortImpl inMessagePort = new InMessagePortImpl();
		return inMessagePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMessagePort createOutMessagePort() {
		OutMessagePortImpl outMessagePort = new OutMessagePortImpl();
		return outMessagePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialMode createInitialMode() {
		InitialModeImpl initialMode = new InitialModeImpl();
		return initialMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalMode createExternalMode() {
		ExternalModeImpl externalMode = new ExternalModeImpl();
		return externalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalController createInternalController() {
		InternalControllerImpl internalController = new InternalControllerImpl();
		return internalController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterMode createEnterMode() {
		EnterModeImpl enterMode = new EnterModeImpl();
		return enterMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitMode createExitMode() {
		ExitModeImpl exitMode = new ExitModeImpl();
		return exitMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAsyncService createCallAsyncService() {
		CallAsyncServiceImpl callAsyncService = new CallAsyncServiceImpl();
		return callAsyncService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSyncService createCallSyncService() {
		CallSyncServiceImpl callSyncService = new CallSyncServiceImpl();
		return callSyncService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimer createStartTimer() {
		StartTimerImpl startTimer = new StartTimerImpl();
		return startTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopTimer createStopTimer() {
		StopTimerImpl stopTimer = new StopTimerImpl();
		return stopTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreData createStoreData() {
		StoreDataImpl storeData = new StoreDataImpl();
		return storeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSendMessage createBroadcastSendMessage() {
		BroadcastSendMessageImpl broadcastSendMessage = new BroadcastSendMessageImpl();
		return broadcastSendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnicastSendMessage createUnicastSendMessage() {
		UnicastSendMessageImpl unicastSendMessage = new UnicastSendMessageImpl();
		return unicastSendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticastSendMessage createMulticastSendMessage() {
		MulticastSendMessageImpl multicastSendMessage = new MulticastSendMessageImpl();
		return multicastSendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sense createSense() {
		SenseImpl sense = new SenseImpl();
		return sense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensePosition createSensePosition() {
		SensePositionImpl sensePosition = new SensePositionImpl();
		return sensePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseAccelerometer createSenseAccelerometer() {
		SenseAccelerometerImpl senseAccelerometer = new SenseAccelerometerImpl();
		return senseAccelerometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuate createActuate() {
		ActuateImpl actuate = new ActuateImpl();
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCallback createServiceCallback() {
		ServiceCallbackImpl serviceCallback = new ServiceCallbackImpl();
		return serviceCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCall createServiceCall() {
		ServiceCallImpl serviceCall = new ServiceCallImpl();
		return serviceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessage createReceiveMessage() {
		ReceiveMessageImpl receiveMessage = new ReceiveMessageImpl();
		return receiveMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerFired createTimerFired() {
		TimerFiredImpl timerFired = new TimerFiredImpl();
		return timerFired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataDeclaration createPrimitiveDataDeclaration() {
		PrimitiveDataDeclarationImpl primitiveDataDeclaration = new PrimitiveDataDeclarationImpl();
		return primitiveDataDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDataDeclaration createStructuredDataDeclaration() {
		StructuredDataDeclarationImpl structuredDataDeclaration = new StructuredDataDeclarationImpl();
		return structuredDataDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConst createIntegerConst() {
		IntegerConstImpl integerConst = new IntegerConstImpl();
		return integerConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConst createBooleanConst() {
		BooleanConstImpl booleanConst = new BooleanConstImpl();
		return booleanConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealConst createRealConst() {
		RealConstImpl realConst = new RealConstImpl();
		return realConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConst createStringConst() {
		StringConstImpl stringConst = new StringConstImpl();
		return stringConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConst createEnumConst() {
		EnumConstImpl enumConst = new EnumConstImpl();
		return enumConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureConst createStructureConst() {
		StructureConstImpl structureConst = new StructureConstImpl();
		return structureConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElement createStructureElement() {
		StructureElementImpl structureElement = new StructureElementImpl();
		return structureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullExp createNullExp() {
		NullExpImpl nullExp = new NullExpImpl();
		return nullExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRef createDataRef() {
		DataRefImpl dataRef = new DataRefImpl();
		return dataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMemberRef createStructureMemberRef() {
		StructureMemberRefImpl structureMemberRef = new StructureMemberRefImpl();
		return structureMemberRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpr createArithmeticExpr() {
		ArithmeticExprImpl arithmeticExpr = new ArithmeticExprImpl();
		return arithmeticExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr createBooleanExpr() {
		BooleanExprImpl booleanExpr = new BooleanExprImpl();
		return booleanExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpr createRelationalExpr() {
		RelationalExprImpl relationalExpr = new RelationalExprImpl();
		return relationalExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOp createArithmeticOpFromString(EDataType eDataType, String initialValue) {
		ArithmeticOp result = ArithmeticOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOp createBooleanOpFromString(EDataType eDataType, String initialValue) {
		BooleanOp result = BooleanOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOp createRelationalOpFromString(EDataType eDataType, String initialValue) {
		RelationalOp result = RelationalOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaPackage getSaPackage() {
		return (SaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SaPackage getPackage() {
		return SaPackage.eINSTANCE;
	}

} //SaFactoryImpl
