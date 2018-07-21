/**
 */
package sa_CollectOrganize.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sa_CollectOrganize.Action;
import sa_CollectOrganize.Actuate;
import sa_CollectOrganize.ArithmeticExpr;
import sa_CollectOrganize.ArithmeticOp;
import sa_CollectOrganize.BehaviouralElement;
import sa_CollectOrganize.BooleanConst;
import sa_CollectOrganize.BooleanExpr;
import sa_CollectOrganize.BooleanOp;
import sa_CollectOrganize.BroadcastSendMessage;
import sa_CollectOrganize.CallAsyncService;
import sa_CollectOrganize.CallSyncService;
import sa_CollectOrganize.Choice;
import sa_CollectOrganize.Component;
import sa_CollectOrganize.Constant;
import sa_CollectOrganize.ControlAction;
import sa_CollectOrganize.Controller;
import sa_CollectOrganize.DataDeclaration;
import sa_CollectOrganize.DataRef;
import sa_CollectOrganize.EnterMode;
import sa_CollectOrganize.EnumConst;
import sa_CollectOrganize.Enumeration;
import sa_CollectOrganize.Event;
import sa_CollectOrganize.ExitMode;
import sa_CollectOrganize.Expression;
import sa_CollectOrganize.ExternalMode;
import sa_CollectOrganize.Fork;
import sa_CollectOrganize.InMessagePort;
import sa_CollectOrganize.InitialMode;
import sa_CollectOrganize.IntegerConst;
import sa_CollectOrganize.InternalController;
import sa_CollectOrganize.Join;
import sa_CollectOrganize.Link;
import sa_CollectOrganize.LinkableElement;
import sa_CollectOrganize.MessagePort;
import sa_CollectOrganize.Mode;
import sa_CollectOrganize.MulticastSendMessage;
import sa_CollectOrganize.NullExp;
import sa_CollectOrganize.OutMessagePort;
import sa_CollectOrganize.PrimitiveDataDeclaration;
import sa_CollectOrganize.PrimitiveType;
import sa_CollectOrganize.RealConst;
import sa_CollectOrganize.ReceiveMessage;
import sa_CollectOrganize.RelationalExpr;
import sa_CollectOrganize.RelationalOp;
import sa_CollectOrganize.SAElement;
import sa_CollectOrganize.SaFactory;
import sa_CollectOrganize.SaPackage;
import sa_CollectOrganize.SendMessage;
import sa_CollectOrganize.Sense;
import sa_CollectOrganize.SenseAccelerometer;
import sa_CollectOrganize.SensePosition;
import sa_CollectOrganize.SensorController;
import sa_CollectOrganize.ServiceCall;
import sa_CollectOrganize.ServiceCallback;
import sa_CollectOrganize.SoftwareArchitecture;
import sa_CollectOrganize.StartTimer;
import sa_CollectOrganize.StopTimer;
import sa_CollectOrganize.StoreData;
import sa_CollectOrganize.StringConst;
import sa_CollectOrganize.Structure;
import sa_CollectOrganize.StructureConst;
import sa_CollectOrganize.StructureElement;
import sa_CollectOrganize.StructureMemberRef;
import sa_CollectOrganize.StructuredDataDeclaration;
import sa_CollectOrganize.StructuredDataType;
import sa_CollectOrganize.TimerFired;
import sa_CollectOrganize.UnicastSendMessage;

import sa_CollectOrganize.util.SaValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SaPackageImpl extends EPackageImpl implements SaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inMessagePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outMessagePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviouralElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callAsyncServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSyncServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSendMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unicastSendMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multicastSendMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensePositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseAccelerometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerFiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDataDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMemberRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOpEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sa_CollectOrganize.SaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SaPackageImpl() {
		super(eNS_URI, SaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SaPackage init() {
		if (isInited) return (SaPackage)EPackage.Registry.INSTANCE.getEPackage(SaPackage.eNS_URI);

		// Obtain or create and register package
		SaPackageImpl theSaPackage = (SaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSaPackage.createPackageContents();

		// Initialize created meta-data
		theSaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SaPackage.eNS_URI, theSaPackage);
		return theSaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareArchitecture() {
		return softwareArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareArchitecture_SAElements() {
		return (EReference)softwareArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareArchitecture_Links() {
		return (EReference)softwareArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_HasController() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_HasSensorController() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorController() {
		return sensorControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagePort() {
		return messagePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessagePort_Name() {
		return (EAttribute)messagePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInMessagePort() {
		return inMessagePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInMessagePort_Rcv_msg() {
		return (EReference)inMessagePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutMessagePort() {
		return outMessagePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutMessagePort_Inmsg() {
		return (EReference)outMessagePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAElement() {
		return saElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAElement_Name() {
		return (EAttribute)saElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAElement_Ports() {
		return (EReference)saElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAElement_Modes() {
		return (EReference)saElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAElement_ApplicationData() {
		return (EReference)saElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMode_Name() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_BehaviouralElements() {
		return (EReference)modeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Entries() {
		return (EReference)modeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Exits() {
		return (EReference)modeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalController() {
		return internalControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialMode() {
		return initialModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalMode() {
		return externalModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterMode() {
		return enterModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitMode() {
		return exitModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExitMode_TargetMode() {
		return (EReference)exitModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviouralElement() {
		return behaviouralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviouralElement_Name() {
		return (EAttribute)behaviouralElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Incoming() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAsyncService() {
		return callAsyncServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAsyncService_DataExp() {
		return (EReference)callAsyncServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallAsyncService_Data() {
		return (EAttribute)callAsyncServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSyncService() {
		return callSyncServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSyncService_DataExp() {
		return (EReference)callSyncServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallSyncService_Data() {
		return (EAttribute)callSyncServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSyncService_DataRecipient() {
		return (EReference)callSyncServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartTimer() {
		return startTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartTimer_Cyclic() {
		return (EAttribute)startTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartTimer_Delay() {
		return (EAttribute)startTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartTimer_Period() {
		return (EAttribute)startTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopTimer() {
		return stopTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopTimer_Timer() {
		return (EReference)stopTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreData() {
		return storeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreData_DataRecipient() {
		return (EReference)storeDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreData_DataExp() {
		return (EReference)storeDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoreData_Data() {
		return (EAttribute)storeDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlAction() {
		return controlActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMessage() {
		return sendMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessage_DataExp() {
		return (EReference)sendMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendMessage_Data() {
		return (EAttribute)sendMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessage_ToMessagePorts() {
		return (EReference)sendMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSendMessage() {
		return broadcastSendMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnicastSendMessage() {
		return unicastSendMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnicastSendMessage_ReceiverName() {
		return (EAttribute)unicastSendMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulticastSendMessage() {
		return multicastSendMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMulticastSendMessage_ReceiverNames() {
		return (EAttribute)multicastSendMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSense() {
		return senseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSense_DataDeclarationName() {
		return (EAttribute)senseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSense_Data() {
		return (EAttribute)senseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSense_DataRecipient() {
		return (EReference)senseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensePosition() {
		return sensePositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensePosition_DataDeclarationName() {
		return (EAttribute)sensePositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensePosition_Data() {
		return (EAttribute)sensePositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensePosition_DataRecipient() {
		return (EReference)sensePositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenseAccelerometer() {
		return senseAccelerometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenseAccelerometer_DataDeclarationName() {
		return (EAttribute)senseAccelerometerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenseAccelerometer_Data() {
		return (EAttribute)senseAccelerometerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenseAccelerometer_DataRecipient() {
		return (EReference)senseAccelerometerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuate() {
		return actuateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuate_DataExp() {
		return (EReference)actuateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuate_Data() {
		return (EAttribute)actuateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFork() {
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCallback() {
		return serviceCallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCallback_ServiceName() {
		return (EAttribute)serviceCallbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCallback_CalledService() {
		return (EReference)serviceCallbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCallback_DataRecipient() {
		return (EReference)serviceCallbackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCall() {
		return serviceCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCall_ServiceName() {
		return (EAttribute)serviceCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCall_DataRecipient() {
		return (EReference)serviceCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveMessage() {
		return receiveMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveMessage_DataRecipientName() {
		return (EAttribute)receiveMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveMessage_FromMessagePorts() {
		return (EReference)receiveMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveMessage_DataRecipient() {
		return (EReference)receiveMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerFired() {
		return timerFiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerFired_TimerName() {
		return (EAttribute)timerFiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerFired_Timer() {
		return (EReference)timerFiredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Source() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Target() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_ConditionExp() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Condition() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkableElement() {
		return linkableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkableElement_Outgoing() {
		return (EReference)linkableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkableElement_InAction() {
		return (EReference)linkableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDeclaration() {
		return dataDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDeclaration_DataName() {
		return (EAttribute)dataDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDeclaration_Value() {
		return (EAttribute)dataDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDeclaration_Name() {
		return (EAttribute)dataDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataDeclaration() {
		return primitiveDataDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDataDeclaration_Type() {
		return (EAttribute)primitiveDataDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveDataDeclaration_ValueExp() {
		return (EReference)primitiveDataDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDataDeclaration() {
		return structuredDataDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDataDeclaration_TypeExp() {
		return (EReference)structuredDataDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredDataDeclaration_Type() {
		return (EAttribute)structuredDataDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDataType() {
		return structuredDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredDataType_Name() {
		return (EAttribute)structuredDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeration_Literals() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Members() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConst() {
		return integerConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerConst_Value() {
		return (EAttribute)integerConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConst() {
		return booleanConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConst_Value() {
		return (EAttribute)booleanConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealConst() {
		return realConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealConst_Value() {
		return (EAttribute)realConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConst() {
		return stringConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringConst_Value() {
		return (EAttribute)stringConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumConst() {
		return enumConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumConst_Enumeration() {
		return (EReference)enumConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumConst_Value() {
		return (EAttribute)enumConstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureConst() {
		return structureConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureConst_Values() {
		return (EReference)structureConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElement() {
		return structureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureElement_Member() {
		return (EReference)structureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureElement_Value() {
		return (EReference)structureElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Name() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullExp() {
		return nullExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRef() {
		return dataRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRef_Declaration() {
		return (EReference)dataRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMemberRef() {
		return structureMemberRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMemberRef_Structure() {
		return (EReference)structureMemberRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMemberRef_Member() {
		return (EReference)structureMemberRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpr() {
		return arithmeticExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticExpr_LeftOperand() {
		return (EReference)arithmeticExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticExpr_RightOperand() {
		return (EReference)arithmeticExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticExpr_Operator() {
		return (EAttribute)arithmeticExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpr() {
		return booleanExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpr_LeftOperand() {
		return (EReference)booleanExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpr_RightOperand() {
		return (EReference)booleanExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpr_Operator() {
		return (EAttribute)booleanExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpr() {
		return relationalExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpr_LeftOperand() {
		return (EReference)relationalExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpr_RightOperand() {
		return (EReference)relationalExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpr_Operator() {
		return (EAttribute)relationalExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticOp() {
		return arithmeticOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanOp() {
		return booleanOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOp() {
		return relationalOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaFactory getSaFactory() {
		return (SaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		softwareArchitectureEClass = createEClass(SOFTWARE_ARCHITECTURE);
		createEReference(softwareArchitectureEClass, SOFTWARE_ARCHITECTURE__SA_ELEMENTS);
		createEReference(softwareArchitectureEClass, SOFTWARE_ARCHITECTURE__LINKS);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__HAS_CONTROLLER);
		createEReference(componentEClass, COMPONENT__HAS_SENSOR_CONTROLLER);

		controllerEClass = createEClass(CONTROLLER);

		sensorControllerEClass = createEClass(SENSOR_CONTROLLER);

		messagePortEClass = createEClass(MESSAGE_PORT);
		createEAttribute(messagePortEClass, MESSAGE_PORT__NAME);

		inMessagePortEClass = createEClass(IN_MESSAGE_PORT);
		createEReference(inMessagePortEClass, IN_MESSAGE_PORT__RCV_MSG);

		outMessagePortEClass = createEClass(OUT_MESSAGE_PORT);
		createEReference(outMessagePortEClass, OUT_MESSAGE_PORT__INMSG);

		saElementEClass = createEClass(SA_ELEMENT);
		createEAttribute(saElementEClass, SA_ELEMENT__NAME);
		createEReference(saElementEClass, SA_ELEMENT__PORTS);
		createEReference(saElementEClass, SA_ELEMENT__MODES);
		createEReference(saElementEClass, SA_ELEMENT__APPLICATION_DATA);

		modeEClass = createEClass(MODE);
		createEAttribute(modeEClass, MODE__NAME);
		createEReference(modeEClass, MODE__BEHAVIOURAL_ELEMENTS);
		createEReference(modeEClass, MODE__ENTRIES);
		createEReference(modeEClass, MODE__EXITS);

		internalControllerEClass = createEClass(INTERNAL_CONTROLLER);

		initialModeEClass = createEClass(INITIAL_MODE);

		externalModeEClass = createEClass(EXTERNAL_MODE);

		enterModeEClass = createEClass(ENTER_MODE);

		exitModeEClass = createEClass(EXIT_MODE);
		createEReference(exitModeEClass, EXIT_MODE__TARGET_MODE);

		behaviouralElementEClass = createEClass(BEHAVIOURAL_ELEMENT);
		createEAttribute(behaviouralElementEClass, BEHAVIOURAL_ELEMENT__NAME);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__INCOMING);

		callAsyncServiceEClass = createEClass(CALL_ASYNC_SERVICE);
		createEReference(callAsyncServiceEClass, CALL_ASYNC_SERVICE__DATA_EXP);
		createEAttribute(callAsyncServiceEClass, CALL_ASYNC_SERVICE__DATA);

		callSyncServiceEClass = createEClass(CALL_SYNC_SERVICE);
		createEReference(callSyncServiceEClass, CALL_SYNC_SERVICE__DATA_EXP);
		createEAttribute(callSyncServiceEClass, CALL_SYNC_SERVICE__DATA);
		createEReference(callSyncServiceEClass, CALL_SYNC_SERVICE__DATA_RECIPIENT);

		startTimerEClass = createEClass(START_TIMER);
		createEAttribute(startTimerEClass, START_TIMER__CYCLIC);
		createEAttribute(startTimerEClass, START_TIMER__DELAY);
		createEAttribute(startTimerEClass, START_TIMER__PERIOD);

		stopTimerEClass = createEClass(STOP_TIMER);
		createEReference(stopTimerEClass, STOP_TIMER__TIMER);

		storeDataEClass = createEClass(STORE_DATA);
		createEReference(storeDataEClass, STORE_DATA__DATA_RECIPIENT);
		createEReference(storeDataEClass, STORE_DATA__DATA_EXP);
		createEAttribute(storeDataEClass, STORE_DATA__DATA);

		controlActionEClass = createEClass(CONTROL_ACTION);

		sendMessageEClass = createEClass(SEND_MESSAGE);
		createEReference(sendMessageEClass, SEND_MESSAGE__DATA_EXP);
		createEAttribute(sendMessageEClass, SEND_MESSAGE__DATA);
		createEReference(sendMessageEClass, SEND_MESSAGE__TO_MESSAGE_PORTS);

		broadcastSendMessageEClass = createEClass(BROADCAST_SEND_MESSAGE);

		unicastSendMessageEClass = createEClass(UNICAST_SEND_MESSAGE);
		createEAttribute(unicastSendMessageEClass, UNICAST_SEND_MESSAGE__RECEIVER_NAME);

		multicastSendMessageEClass = createEClass(MULTICAST_SEND_MESSAGE);
		createEAttribute(multicastSendMessageEClass, MULTICAST_SEND_MESSAGE__RECEIVER_NAMES);

		senseEClass = createEClass(SENSE);
		createEAttribute(senseEClass, SENSE__DATA_DECLARATION_NAME);
		createEAttribute(senseEClass, SENSE__DATA);
		createEReference(senseEClass, SENSE__DATA_RECIPIENT);

		sensePositionEClass = createEClass(SENSE_POSITION);
		createEAttribute(sensePositionEClass, SENSE_POSITION__DATA_DECLARATION_NAME);
		createEAttribute(sensePositionEClass, SENSE_POSITION__DATA);
		createEReference(sensePositionEClass, SENSE_POSITION__DATA_RECIPIENT);

		senseAccelerometerEClass = createEClass(SENSE_ACCELEROMETER);
		createEAttribute(senseAccelerometerEClass, SENSE_ACCELEROMETER__DATA_DECLARATION_NAME);
		createEAttribute(senseAccelerometerEClass, SENSE_ACCELEROMETER__DATA);
		createEReference(senseAccelerometerEClass, SENSE_ACCELEROMETER__DATA_RECIPIENT);

		actuateEClass = createEClass(ACTUATE);
		createEReference(actuateEClass, ACTUATE__DATA_EXP);
		createEAttribute(actuateEClass, ACTUATE__DATA);

		joinEClass = createEClass(JOIN);

		forkEClass = createEClass(FORK);

		choiceEClass = createEClass(CHOICE);

		eventEClass = createEClass(EVENT);

		serviceCallbackEClass = createEClass(SERVICE_CALLBACK);
		createEAttribute(serviceCallbackEClass, SERVICE_CALLBACK__SERVICE_NAME);
		createEReference(serviceCallbackEClass, SERVICE_CALLBACK__CALLED_SERVICE);
		createEReference(serviceCallbackEClass, SERVICE_CALLBACK__DATA_RECIPIENT);

		serviceCallEClass = createEClass(SERVICE_CALL);
		createEAttribute(serviceCallEClass, SERVICE_CALL__SERVICE_NAME);
		createEReference(serviceCallEClass, SERVICE_CALL__DATA_RECIPIENT);

		receiveMessageEClass = createEClass(RECEIVE_MESSAGE);
		createEAttribute(receiveMessageEClass, RECEIVE_MESSAGE__DATA_RECIPIENT_NAME);
		createEReference(receiveMessageEClass, RECEIVE_MESSAGE__FROM_MESSAGE_PORTS);
		createEReference(receiveMessageEClass, RECEIVE_MESSAGE__DATA_RECIPIENT);

		timerFiredEClass = createEClass(TIMER_FIRED);
		createEAttribute(timerFiredEClass, TIMER_FIRED__TIMER_NAME);
		createEReference(timerFiredEClass, TIMER_FIRED__TIMER);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SOURCE);
		createEReference(linkEClass, LINK__TARGET);
		createEReference(linkEClass, LINK__CONDITION_EXP);
		createEAttribute(linkEClass, LINK__CONDITION);
		createEAttribute(linkEClass, LINK__NAME);

		linkableElementEClass = createEClass(LINKABLE_ELEMENT);
		createEReference(linkableElementEClass, LINKABLE_ELEMENT__OUTGOING);
		createEReference(linkableElementEClass, LINKABLE_ELEMENT__IN_ACTION);

		dataDeclarationEClass = createEClass(DATA_DECLARATION);
		createEAttribute(dataDeclarationEClass, DATA_DECLARATION__DATA_NAME);
		createEAttribute(dataDeclarationEClass, DATA_DECLARATION__VALUE);
		createEAttribute(dataDeclarationEClass, DATA_DECLARATION__NAME);

		primitiveDataDeclarationEClass = createEClass(PRIMITIVE_DATA_DECLARATION);
		createEAttribute(primitiveDataDeclarationEClass, PRIMITIVE_DATA_DECLARATION__TYPE);
		createEReference(primitiveDataDeclarationEClass, PRIMITIVE_DATA_DECLARATION__VALUE_EXP);

		structuredDataDeclarationEClass = createEClass(STRUCTURED_DATA_DECLARATION);
		createEReference(structuredDataDeclarationEClass, STRUCTURED_DATA_DECLARATION__TYPE_EXP);
		createEAttribute(structuredDataDeclarationEClass, STRUCTURED_DATA_DECLARATION__TYPE);

		structuredDataTypeEClass = createEClass(STRUCTURED_DATA_TYPE);
		createEAttribute(structuredDataTypeEClass, STRUCTURED_DATA_TYPE__NAME);

		enumerationEClass = createEClass(ENUMERATION);
		createEAttribute(enumerationEClass, ENUMERATION__LITERALS);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__MEMBERS);

		constantEClass = createEClass(CONSTANT);

		integerConstEClass = createEClass(INTEGER_CONST);
		createEAttribute(integerConstEClass, INTEGER_CONST__VALUE);

		booleanConstEClass = createEClass(BOOLEAN_CONST);
		createEAttribute(booleanConstEClass, BOOLEAN_CONST__VALUE);

		realConstEClass = createEClass(REAL_CONST);
		createEAttribute(realConstEClass, REAL_CONST__VALUE);

		stringConstEClass = createEClass(STRING_CONST);
		createEAttribute(stringConstEClass, STRING_CONST__VALUE);

		enumConstEClass = createEClass(ENUM_CONST);
		createEReference(enumConstEClass, ENUM_CONST__ENUMERATION);
		createEAttribute(enumConstEClass, ENUM_CONST__VALUE);

		structureConstEClass = createEClass(STRUCTURE_CONST);
		createEReference(structureConstEClass, STRUCTURE_CONST__VALUES);

		structureElementEClass = createEClass(STRUCTURE_ELEMENT);
		createEReference(structureElementEClass, STRUCTURE_ELEMENT__MEMBER);
		createEReference(structureElementEClass, STRUCTURE_ELEMENT__VALUE);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__NAME);

		nullExpEClass = createEClass(NULL_EXP);

		dataRefEClass = createEClass(DATA_REF);
		createEReference(dataRefEClass, DATA_REF__DECLARATION);

		structureMemberRefEClass = createEClass(STRUCTURE_MEMBER_REF);
		createEReference(structureMemberRefEClass, STRUCTURE_MEMBER_REF__STRUCTURE);
		createEReference(structureMemberRefEClass, STRUCTURE_MEMBER_REF__MEMBER);

		arithmeticExprEClass = createEClass(ARITHMETIC_EXPR);
		createEReference(arithmeticExprEClass, ARITHMETIC_EXPR__LEFT_OPERAND);
		createEReference(arithmeticExprEClass, ARITHMETIC_EXPR__RIGHT_OPERAND);
		createEAttribute(arithmeticExprEClass, ARITHMETIC_EXPR__OPERATOR);

		booleanExprEClass = createEClass(BOOLEAN_EXPR);
		createEReference(booleanExprEClass, BOOLEAN_EXPR__LEFT_OPERAND);
		createEReference(booleanExprEClass, BOOLEAN_EXPR__RIGHT_OPERAND);
		createEAttribute(booleanExprEClass, BOOLEAN_EXPR__OPERATOR);

		relationalExprEClass = createEClass(RELATIONAL_EXPR);
		createEReference(relationalExprEClass, RELATIONAL_EXPR__LEFT_OPERAND);
		createEReference(relationalExprEClass, RELATIONAL_EXPR__RIGHT_OPERAND);
		createEAttribute(relationalExprEClass, RELATIONAL_EXPR__OPERATOR);

		// Create enums
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		arithmeticOpEEnum = createEEnum(ARITHMETIC_OP);
		booleanOpEEnum = createEEnum(BOOLEAN_OP);
		relationalOpEEnum = createEEnum(RELATIONAL_OP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(this.getSAElement());
		controllerEClass.getESuperTypes().add(this.getSAElement());
		sensorControllerEClass.getESuperTypes().add(this.getSAElement());
		inMessagePortEClass.getESuperTypes().add(this.getMessagePort());
		outMessagePortEClass.getESuperTypes().add(this.getMessagePort());
		internalControllerEClass.getESuperTypes().add(this.getMode());
		initialModeEClass.getESuperTypes().add(this.getMode());
		externalModeEClass.getESuperTypes().add(this.getMode());
		enterModeEClass.getESuperTypes().add(this.getEvent());
		exitModeEClass.getESuperTypes().add(this.getAction());
		actionEClass.getESuperTypes().add(this.getLinkableElement());
		callAsyncServiceEClass.getESuperTypes().add(this.getAction());
		callSyncServiceEClass.getESuperTypes().add(this.getAction());
		startTimerEClass.getESuperTypes().add(this.getAction());
		stopTimerEClass.getESuperTypes().add(this.getAction());
		storeDataEClass.getESuperTypes().add(this.getAction());
		controlActionEClass.getESuperTypes().add(this.getAction());
		sendMessageEClass.getESuperTypes().add(this.getAction());
		broadcastSendMessageEClass.getESuperTypes().add(this.getSendMessage());
		unicastSendMessageEClass.getESuperTypes().add(this.getSendMessage());
		multicastSendMessageEClass.getESuperTypes().add(this.getSendMessage());
		senseEClass.getESuperTypes().add(this.getAction());
		sensePositionEClass.getESuperTypes().add(this.getAction());
		senseAccelerometerEClass.getESuperTypes().add(this.getAction());
		actuateEClass.getESuperTypes().add(this.getAction());
		joinEClass.getESuperTypes().add(this.getControlAction());
		forkEClass.getESuperTypes().add(this.getControlAction());
		choiceEClass.getESuperTypes().add(this.getControlAction());
		eventEClass.getESuperTypes().add(this.getLinkableElement());
		serviceCallbackEClass.getESuperTypes().add(this.getEvent());
		serviceCallEClass.getESuperTypes().add(this.getEvent());
		receiveMessageEClass.getESuperTypes().add(this.getEvent());
		timerFiredEClass.getESuperTypes().add(this.getEvent());
		linkableElementEClass.getESuperTypes().add(this.getBehaviouralElement());
		primitiveDataDeclarationEClass.getESuperTypes().add(this.getDataDeclaration());
		structuredDataDeclarationEClass.getESuperTypes().add(this.getDataDeclaration());
		enumerationEClass.getESuperTypes().add(this.getStructuredDataType());
		structureEClass.getESuperTypes().add(this.getStructuredDataType());
		constantEClass.getESuperTypes().add(this.getExpression());
		integerConstEClass.getESuperTypes().add(this.getConstant());
		booleanConstEClass.getESuperTypes().add(this.getConstant());
		realConstEClass.getESuperTypes().add(this.getConstant());
		stringConstEClass.getESuperTypes().add(this.getConstant());
		enumConstEClass.getESuperTypes().add(this.getConstant());
		structureConstEClass.getESuperTypes().add(this.getConstant());
		structureElementEClass.getESuperTypes().add(this.getStructuredDataType());
		nullExpEClass.getESuperTypes().add(this.getExpression());
		dataRefEClass.getESuperTypes().add(this.getExpression());
		structureMemberRefEClass.getESuperTypes().add(this.getExpression());
		arithmeticExprEClass.getESuperTypes().add(this.getExpression());
		booleanExprEClass.getESuperTypes().add(this.getExpression());
		relationalExprEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(softwareArchitectureEClass, SoftwareArchitecture.class, "SoftwareArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareArchitecture_SAElements(), this.getSAElement(), null, "SAElements", null, 0, -1, SoftwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareArchitecture_Links(), this.getLink(), null, "links", null, 0, -1, SoftwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_HasController(), this.getController(), null, "hasController", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_HasSensorController(), this.getSensorController(), null, "hasSensorController", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorControllerEClass, SensorController.class, "SensorController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messagePortEClass, MessagePort.class, "MessagePort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessagePort_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessagePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inMessagePortEClass, InMessagePort.class, "InMessagePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInMessagePort_Rcv_msg(), this.getReceiveMessage(), null, "rcv_msg", null, 0, -1, InMessagePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outMessagePortEClass, OutMessagePort.class, "OutMessagePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutMessagePort_Inmsg(), this.getInMessagePort(), null, "inmsg", null, 0, -1, OutMessagePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saElementEClass, SAElement.class, "SAElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSAElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAElement_Ports(), this.getMessagePort(), null, "ports", null, 0, -1, SAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAElement_Modes(), this.getMode(), null, "modes", null, 0, -1, SAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAElement_ApplicationData(), this.getDataDeclaration(), null, "applicationData", null, 0, -1, SAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode_BehaviouralElements(), this.getBehaviouralElement(), null, "behaviouralElements", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode_Entries(), this.getEnterMode(), null, "entries", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode_Exits(), this.getExitMode(), null, "exits", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalControllerEClass, InternalController.class, "InternalController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialModeEClass, InitialMode.class, "InitialMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalModeEClass, ExternalMode.class, "ExternalMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enterModeEClass, EnterMode.class, "EnterMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitModeEClass, ExitMode.class, "ExitMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExitMode_TargetMode(), this.getEnterMode(), null, "targetMode", null, 1, 1, ExitMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviouralElementEClass, BehaviouralElement.class, "BehaviouralElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviouralElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, BehaviouralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Incoming(), this.getLink(), this.getLink_Target(), "incoming", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callAsyncServiceEClass, CallAsyncService.class, "CallAsyncService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallAsyncService_DataExp(), this.getExpression(), null, "dataExp", null, 0, -1, CallAsyncService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallAsyncService_Data(), ecorePackage.getEString(), "data", null, 0, 1, CallAsyncService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callSyncServiceEClass, CallSyncService.class, "CallSyncService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallSyncService_DataExp(), this.getExpression(), null, "dataExp", null, 0, -1, CallSyncService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallSyncService_Data(), ecorePackage.getEString(), "data", null, 0, 1, CallSyncService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallSyncService_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 0, 1, CallSyncService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startTimerEClass, StartTimer.class, "StartTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartTimer_Cyclic(), ecorePackage.getEBoolean(), "cyclic", null, 0, 1, StartTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartTimer_Delay(), ecorePackage.getEInt(), "delay", null, 0, 1, StartTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartTimer_Period(), ecorePackage.getEInt(), "period", null, 0, 1, StartTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopTimerEClass, StopTimer.class, "StopTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopTimer_Timer(), this.getStartTimer(), null, "timer", null, 1, 1, StopTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeDataEClass, StoreData.class, "StoreData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreData_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 1, 1, StoreData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreData_DataExp(), this.getExpression(), null, "dataExp", null, 1, 1, StoreData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreData_Data(), ecorePackage.getEString(), "data", null, 1, 1, StoreData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlActionEClass, ControlAction.class, "ControlAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendMessageEClass, SendMessage.class, "SendMessage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendMessage_DataExp(), this.getExpression(), null, "dataExp", null, 0, 1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendMessage_Data(), ecorePackage.getEString(), "data", null, 0, 1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendMessage_ToMessagePorts(), this.getOutMessagePort(), null, "toMessagePorts", null, 1, -1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(broadcastSendMessageEClass, BroadcastSendMessage.class, "BroadcastSendMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unicastSendMessageEClass, UnicastSendMessage.class, "UnicastSendMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnicastSendMessage_ReceiverName(), ecorePackage.getEString(), "receiverName", null, 0, 1, UnicastSendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multicastSendMessageEClass, MulticastSendMessage.class, "MulticastSendMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMulticastSendMessage_ReceiverNames(), ecorePackage.getEString(), "receiverNames", null, 0, -1, MulticastSendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseEClass, Sense.class, "Sense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSense_DataDeclarationName(), ecorePackage.getEString(), "dataDeclarationName", null, 0, 1, Sense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSense_Data(), ecorePackage.getEString(), "data", null, 0, 1, Sense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSense_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 0, 1, Sense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensePositionEClass, SensePosition.class, "SensePosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensePosition_DataDeclarationName(), ecorePackage.getEString(), "dataDeclarationName", null, 0, 1, SensePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensePosition_Data(), ecorePackage.getEString(), "data", null, 0, 1, SensePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensePosition_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 0, 1, SensePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseAccelerometerEClass, SenseAccelerometer.class, "SenseAccelerometer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenseAccelerometer_DataDeclarationName(), ecorePackage.getEString(), "dataDeclarationName", null, 0, 1, SenseAccelerometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSenseAccelerometer_Data(), ecorePackage.getEString(), "data", null, 0, 1, SenseAccelerometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseAccelerometer_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 0, 1, SenseAccelerometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuateEClass, Actuate.class, "Actuate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActuate_DataExp(), this.getExpression(), null, "dataExp", null, 0, 1, Actuate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuate_Data(), ecorePackage.getEString(), "data", null, 0, 1, Actuate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceCallbackEClass, ServiceCallback.class, "ServiceCallback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCallback_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, ServiceCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceCallback_CalledService(), this.getCallAsyncService(), null, "calledService", null, 1, 1, ServiceCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceCallback_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 0, 1, ServiceCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCallEClass, ServiceCall.class, "ServiceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCall_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, ServiceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceCall_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 0, 1, ServiceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveMessageEClass, ReceiveMessage.class, "ReceiveMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReceiveMessage_DataRecipientName(), ecorePackage.getEString(), "dataRecipientName", null, 0, 1, ReceiveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiveMessage_FromMessagePorts(), this.getInMessagePort(), null, "fromMessagePorts", null, 0, -1, ReceiveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiveMessage_DataRecipient(), this.getDataDeclaration(), null, "dataRecipient", null, 0, 1, ReceiveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerFiredEClass, TimerFired.class, "TimerFired", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimerFired_TimerName(), ecorePackage.getEString(), "timerName", null, 0, 1, TimerFired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimerFired_Timer(), this.getStartTimer(), null, "timer", null, 1, 1, TimerFired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Source(), this.getLinkableElement(), this.getLinkableElement_Outgoing(), "source", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Target(), this.getAction(), this.getAction_Incoming(), "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_ConditionExp(), this.getExpression(), null, "conditionExp", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkableElementEClass, LinkableElement.class, "LinkableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkableElement_Outgoing(), this.getLink(), this.getLink_Source(), "outgoing", null, 0, -1, LinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkableElement_InAction(), this.getAction(), null, "inAction", null, 0, -1, LinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDeclarationEClass, DataDeclaration.class, "DataDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDeclaration_DataName(), ecorePackage.getEString(), "dataName", null, 1, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataDeclaration_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataDeclarationEClass, PrimitiveDataDeclaration.class, "PrimitiveDataDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDataDeclaration_Type(), this.getPrimitiveType(), "type", null, 1, 1, PrimitiveDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveDataDeclaration_ValueExp(), this.getConstant(), null, "valueExp", null, 0, -1, PrimitiveDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredDataDeclarationEClass, StructuredDataDeclaration.class, "StructuredDataDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredDataDeclaration_TypeExp(), this.getStructuredDataType(), null, "typeExp", null, 0, -1, StructuredDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredDataDeclaration_Type(), ecorePackage.getEString(), "type", null, 1, 1, StructuredDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredDataTypeEClass, StructuredDataType.class, "StructuredDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, StructuredDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumeration_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Members(), this.getDataDeclaration(), null, "members", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerConstEClass, IntegerConst.class, "IntegerConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConst_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanConstEClass, BooleanConst.class, "BooleanConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConst_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realConstEClass, RealConst.class, "RealConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealConst_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, RealConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstEClass, StringConst.class, "StringConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConst_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumConstEClass, EnumConst.class, "EnumConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumConst_Enumeration(), this.getEnumeration(), null, "enumeration", null, 0, 1, EnumConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumConst_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureConstEClass, StructureConst.class, "StructureConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureConst_Values(), this.getStructureElement(), null, "values", null, 0, -1, StructureConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureElementEClass, StructureElement.class, "StructureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureElement_Member(), this.getDataDeclaration(), null, "member", null, 1, 1, StructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructureElement_Value(), this.getConstant(), null, "value", null, 1, 1, StructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullExpEClass, NullExp.class, "NullExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRefEClass, DataRef.class, "DataRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRef_Declaration(), this.getDataDeclaration(), null, "declaration", null, 1, 1, DataRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureMemberRefEClass, StructureMemberRef.class, "StructureMemberRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureMemberRef_Structure(), this.getStructure(), null, "structure", null, 1, 1, StructureMemberRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructureMemberRef_Member(), this.getPrimitiveDataDeclaration(), null, "member", null, 1, 1, StructureMemberRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticExprEClass, ArithmeticExpr.class, "ArithmeticExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticExpr_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, ArithmeticExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticExpr_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, ArithmeticExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArithmeticExpr_Operator(), this.getArithmeticOp(), "operator", null, 1, 1, ArithmeticExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExprEClass, BooleanExpr.class, "BooleanExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpr_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, BooleanExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanExpr_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, BooleanExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanExpr_Operator(), this.getBooleanOp(), "operator", null, 0, 1, BooleanExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalExprEClass, RelationalExpr.class, "RelationalExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpr_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, RelationalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpr_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, RelationalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalExpr_Operator(), this.getRelationalOp(), "operator", null, 0, 1, RelationalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INTEGER);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.REAL);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);

		initEEnum(arithmeticOpEEnum, ArithmeticOp.class, "ArithmeticOp");
		addEEnumLiteral(arithmeticOpEEnum, ArithmeticOp.SUM);
		addEEnumLiteral(arithmeticOpEEnum, ArithmeticOp.SUB);
		addEEnumLiteral(arithmeticOpEEnum, ArithmeticOp.MULT);
		addEEnumLiteral(arithmeticOpEEnum, ArithmeticOp.DIV);

		initEEnum(booleanOpEEnum, BooleanOp.class, "BooleanOp");
		addEEnumLiteral(booleanOpEEnum, BooleanOp.AND);
		addEEnumLiteral(booleanOpEEnum, BooleanOp.OR);
		addEEnumLiteral(booleanOpEEnum, BooleanOp.NOT);

		initEEnum(relationalOpEEnum, RelationalOp.class, "RelationalOp");
		addEEnumLiteral(relationalOpEEnum, RelationalOp.GREATER);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.GREATER_EQ);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.LESS);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.LESS_EQ);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.NOT_EQUAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.label
		createGmfAnnotations();
		// gmf.compartment
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (saElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "SAElementNameMustBeUnique NameMustNotContainWhiteSpace"
		   });	
		addAnnotation
		  (modeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ModeNameMustBeUnique NameMustNotContainWhiteSpace"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (saElementEClass, 
		   source, 
		   new String[] {
			 "SAElementNameMustBeUnique", "SoftwareArchitecture.allInstances().SAElements->select(s : SAElement | s.name = self.name)->size() = 1",
			 "NameMustNotContainWhiteSpace", "name.toString().characters()->select(c : String | c= \' \')->size()=0"
		   });	
		addAnnotation
		  (modeEClass, 
		   source, 
		   new String[] {
			 "ModeNameMustBeUnique", "SAElement.allInstances().modes->select(s : Mode | s.name = self.name)->size() = 1",
			 "NameMustNotContainWhiteSpace", "name.toString().characters()->select(c : String | c= \' \')->size()=0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.label";	
		addAnnotation
		  (getMode_Name(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMulticastSendMessage_ReceiverNames(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getStructuredDataDeclaration_TypeExp(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });
	}

} //SaPackageImpl
