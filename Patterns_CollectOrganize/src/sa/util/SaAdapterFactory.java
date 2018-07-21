/**
 */
package sa.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sa.SaPackage
 * @generated
 */
public class SaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaSwitch<Adapter> modelSwitch =
		new SaSwitch<Adapter>() {
			@Override
			public Adapter caseSoftwareArchitecture(SoftwareArchitecture object) {
				return createSoftwareArchitectureAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseSensorController(SensorController object) {
				return createSensorControllerAdapter();
			}
			@Override
			public Adapter caseMessagePort(MessagePort object) {
				return createMessagePortAdapter();
			}
			@Override
			public Adapter caseInMessagePort(InMessagePort object) {
				return createInMessagePortAdapter();
			}
			@Override
			public Adapter caseOutMessagePort(OutMessagePort object) {
				return createOutMessagePortAdapter();
			}
			@Override
			public Adapter caseSAElement(SAElement object) {
				return createSAElementAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseInternalController(InternalController object) {
				return createInternalControllerAdapter();
			}
			@Override
			public Adapter caseInitialMode(InitialMode object) {
				return createInitialModeAdapter();
			}
			@Override
			public Adapter caseExternalMode(ExternalMode object) {
				return createExternalModeAdapter();
			}
			@Override
			public Adapter caseEnterMode(EnterMode object) {
				return createEnterModeAdapter();
			}
			@Override
			public Adapter caseExitMode(ExitMode object) {
				return createExitModeAdapter();
			}
			@Override
			public Adapter caseBehaviouralElement(BehaviouralElement object) {
				return createBehaviouralElementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCallAsyncService(CallAsyncService object) {
				return createCallAsyncServiceAdapter();
			}
			@Override
			public Adapter caseCallSyncService(CallSyncService object) {
				return createCallSyncServiceAdapter();
			}
			@Override
			public Adapter caseStartTimer(StartTimer object) {
				return createStartTimerAdapter();
			}
			@Override
			public Adapter caseStopTimer(StopTimer object) {
				return createStopTimerAdapter();
			}
			@Override
			public Adapter caseStoreData(StoreData object) {
				return createStoreDataAdapter();
			}
			@Override
			public Adapter caseControlAction(ControlAction object) {
				return createControlActionAdapter();
			}
			@Override
			public Adapter caseSendMessage(SendMessage object) {
				return createSendMessageAdapter();
			}
			@Override
			public Adapter caseBroadcastSendMessage(BroadcastSendMessage object) {
				return createBroadcastSendMessageAdapter();
			}
			@Override
			public Adapter caseUnicastSendMessage(UnicastSendMessage object) {
				return createUnicastSendMessageAdapter();
			}
			@Override
			public Adapter caseMulticastSendMessage(MulticastSendMessage object) {
				return createMulticastSendMessageAdapter();
			}
			@Override
			public Adapter caseSense(Sense object) {
				return createSenseAdapter();
			}
			@Override
			public Adapter caseSensePosition(SensePosition object) {
				return createSensePositionAdapter();
			}
			@Override
			public Adapter caseSenseAccelerometer(SenseAccelerometer object) {
				return createSenseAccelerometerAdapter();
			}
			@Override
			public Adapter caseActuate(Actuate object) {
				return createActuateAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseFork(Fork object) {
				return createForkAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseServiceCallback(ServiceCallback object) {
				return createServiceCallbackAdapter();
			}
			@Override
			public Adapter caseServiceCall(ServiceCall object) {
				return createServiceCallAdapter();
			}
			@Override
			public Adapter caseReceiveMessage(ReceiveMessage object) {
				return createReceiveMessageAdapter();
			}
			@Override
			public Adapter caseTimerFired(TimerFired object) {
				return createTimerFiredAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseLinkableElement(LinkableElement object) {
				return createLinkableElementAdapter();
			}
			@Override
			public Adapter caseDataDeclaration(DataDeclaration object) {
				return createDataDeclarationAdapter();
			}
			@Override
			public Adapter casePrimitiveDataDeclaration(PrimitiveDataDeclaration object) {
				return createPrimitiveDataDeclarationAdapter();
			}
			@Override
			public Adapter caseStructuredDataDeclaration(StructuredDataDeclaration object) {
				return createStructuredDataDeclarationAdapter();
			}
			@Override
			public Adapter caseStructuredDataType(StructuredDataType object) {
				return createStructuredDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseIntegerConst(IntegerConst object) {
				return createIntegerConstAdapter();
			}
			@Override
			public Adapter caseBooleanConst(BooleanConst object) {
				return createBooleanConstAdapter();
			}
			@Override
			public Adapter caseRealConst(RealConst object) {
				return createRealConstAdapter();
			}
			@Override
			public Adapter caseStringConst(StringConst object) {
				return createStringConstAdapter();
			}
			@Override
			public Adapter caseEnumConst(EnumConst object) {
				return createEnumConstAdapter();
			}
			@Override
			public Adapter caseStructureConst(StructureConst object) {
				return createStructureConstAdapter();
			}
			@Override
			public Adapter caseStructureElement(StructureElement object) {
				return createStructureElementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseNullExp(NullExp object) {
				return createNullExpAdapter();
			}
			@Override
			public Adapter caseDataRef(DataRef object) {
				return createDataRefAdapter();
			}
			@Override
			public Adapter caseStructureMemberRef(StructureMemberRef object) {
				return createStructureMemberRefAdapter();
			}
			@Override
			public Adapter caseArithmeticExpr(ArithmeticExpr object) {
				return createArithmeticExprAdapter();
			}
			@Override
			public Adapter caseBooleanExpr(BooleanExpr object) {
				return createBooleanExprAdapter();
			}
			@Override
			public Adapter caseRelationalExpr(RelationalExpr object) {
				return createRelationalExprAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sa.SoftwareArchitecture <em>Software Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.SoftwareArchitecture
	 * @generated
	 */
	public Adapter createSoftwareArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.SensorController <em>Sensor Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.SensorController
	 * @generated
	 */
	public Adapter createSensorControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.MessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.MessagePort
	 * @generated
	 */
	public Adapter createMessagePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.InMessagePort <em>In Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.InMessagePort
	 * @generated
	 */
	public Adapter createInMessagePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.OutMessagePort <em>Out Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.OutMessagePort
	 * @generated
	 */
	public Adapter createOutMessagePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.SAElement <em>SA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.SAElement
	 * @generated
	 */
	public Adapter createSAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.InternalController <em>Internal Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.InternalController
	 * @generated
	 */
	public Adapter createInternalControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.InitialMode <em>Initial Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.InitialMode
	 * @generated
	 */
	public Adapter createInitialModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.ExternalMode <em>External Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.ExternalMode
	 * @generated
	 */
	public Adapter createExternalModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.EnterMode <em>Enter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.EnterMode
	 * @generated
	 */
	public Adapter createEnterModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.ExitMode <em>Exit Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.ExitMode
	 * @generated
	 */
	public Adapter createExitModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.BehaviouralElement <em>Behavioural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.BehaviouralElement
	 * @generated
	 */
	public Adapter createBehaviouralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.CallAsyncService <em>Call Async Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.CallAsyncService
	 * @generated
	 */
	public Adapter createCallAsyncServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.CallSyncService <em>Call Sync Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.CallSyncService
	 * @generated
	 */
	public Adapter createCallSyncServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StartTimer <em>Start Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StartTimer
	 * @generated
	 */
	public Adapter createStartTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StopTimer <em>Stop Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StopTimer
	 * @generated
	 */
	public Adapter createStopTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StoreData <em>Store Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StoreData
	 * @generated
	 */
	public Adapter createStoreDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.ControlAction <em>Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.ControlAction
	 * @generated
	 */
	public Adapter createControlActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.SendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.SendMessage
	 * @generated
	 */
	public Adapter createSendMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.BroadcastSendMessage <em>Broadcast Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.BroadcastSendMessage
	 * @generated
	 */
	public Adapter createBroadcastSendMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.UnicastSendMessage <em>Unicast Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.UnicastSendMessage
	 * @generated
	 */
	public Adapter createUnicastSendMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.MulticastSendMessage <em>Multicast Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.MulticastSendMessage
	 * @generated
	 */
	public Adapter createMulticastSendMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Sense <em>Sense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Sense
	 * @generated
	 */
	public Adapter createSenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.SensePosition <em>Sense Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.SensePosition
	 * @generated
	 */
	public Adapter createSensePositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.SenseAccelerometer <em>Sense Accelerometer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.SenseAccelerometer
	 * @generated
	 */
	public Adapter createSenseAccelerometerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Actuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Actuate
	 * @generated
	 */
	public Adapter createActuateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.ServiceCallback <em>Service Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.ServiceCallback
	 * @generated
	 */
	public Adapter createServiceCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.ServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.ServiceCall
	 * @generated
	 */
	public Adapter createServiceCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.ReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.ReceiveMessage
	 * @generated
	 */
	public Adapter createReceiveMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.TimerFired <em>Timer Fired</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.TimerFired
	 * @generated
	 */
	public Adapter createTimerFiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.LinkableElement <em>Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.LinkableElement
	 * @generated
	 */
	public Adapter createLinkableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.DataDeclaration <em>Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.DataDeclaration
	 * @generated
	 */
	public Adapter createDataDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.PrimitiveDataDeclaration <em>Primitive Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.PrimitiveDataDeclaration
	 * @generated
	 */
	public Adapter createPrimitiveDataDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StructuredDataDeclaration <em>Structured Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StructuredDataDeclaration
	 * @generated
	 */
	public Adapter createStructuredDataDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StructuredDataType <em>Structured Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StructuredDataType
	 * @generated
	 */
	public Adapter createStructuredDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.IntegerConst <em>Integer Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.IntegerConst
	 * @generated
	 */
	public Adapter createIntegerConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.BooleanConst <em>Boolean Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.BooleanConst
	 * @generated
	 */
	public Adapter createBooleanConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.RealConst <em>Real Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.RealConst
	 * @generated
	 */
	public Adapter createRealConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StringConst <em>String Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StringConst
	 * @generated
	 */
	public Adapter createStringConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.EnumConst <em>Enum Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.EnumConst
	 * @generated
	 */
	public Adapter createEnumConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StructureConst <em>Structure Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StructureConst
	 * @generated
	 */
	public Adapter createStructureConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StructureElement <em>Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StructureElement
	 * @generated
	 */
	public Adapter createStructureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.NullExp <em>Null Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.NullExp
	 * @generated
	 */
	public Adapter createNullExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.DataRef <em>Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.DataRef
	 * @generated
	 */
	public Adapter createDataRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.StructureMemberRef <em>Structure Member Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.StructureMemberRef
	 * @generated
	 */
	public Adapter createStructureMemberRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.ArithmeticExpr <em>Arithmetic Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.ArithmeticExpr
	 * @generated
	 */
	public Adapter createArithmeticExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.BooleanExpr
	 * @generated
	 */
	public Adapter createBooleanExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sa.RelationalExpr <em>Relational Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sa.RelationalExpr
	 * @generated
	 */
	public Adapter createRelationalExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SaAdapterFactory
