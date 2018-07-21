/**
 */
package sa.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import sa.util.SaAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SaItemProviderAdapterFactory extends SaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.SoftwareArchitecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareArchitectureItemProvider softwareArchitectureItemProvider;

	/**
	 * This creates an adapter for a {@link sa.SoftwareArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareArchitectureAdapter() {
		if (softwareArchitectureItemProvider == null) {
			softwareArchitectureItemProvider = new SoftwareArchitectureItemProvider(this);
		}

		return softwareArchitectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Controller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerItemProvider controllerItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerAdapter() {
		if (controllerItemProvider == null) {
			controllerItemProvider = new ControllerItemProvider(this);
		}

		return controllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.SensorController} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorControllerItemProvider sensorControllerItemProvider;

	/**
	 * This creates an adapter for a {@link sa.SensorController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorControllerAdapter() {
		if (sensorControllerItemProvider == null) {
			sensorControllerItemProvider = new SensorControllerItemProvider(this);
		}

		return sensorControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.InMessagePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InMessagePortItemProvider inMessagePortItemProvider;

	/**
	 * This creates an adapter for a {@link sa.InMessagePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInMessagePortAdapter() {
		if (inMessagePortItemProvider == null) {
			inMessagePortItemProvider = new InMessagePortItemProvider(this);
		}

		return inMessagePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.OutMessagePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutMessagePortItemProvider outMessagePortItemProvider;

	/**
	 * This creates an adapter for a {@link sa.OutMessagePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutMessagePortAdapter() {
		if (outMessagePortItemProvider == null) {
			outMessagePortItemProvider = new OutMessagePortItemProvider(this);
		}

		return outMessagePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.InternalController} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalControllerItemProvider internalControllerItemProvider;

	/**
	 * This creates an adapter for a {@link sa.InternalController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalControllerAdapter() {
		if (internalControllerItemProvider == null) {
			internalControllerItemProvider = new InternalControllerItemProvider(this);
		}

		return internalControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.InitialMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialModeItemProvider initialModeItemProvider;

	/**
	 * This creates an adapter for a {@link sa.InitialMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialModeAdapter() {
		if (initialModeItemProvider == null) {
			initialModeItemProvider = new InitialModeItemProvider(this);
		}

		return initialModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.ExternalMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalModeItemProvider externalModeItemProvider;

	/**
	 * This creates an adapter for a {@link sa.ExternalMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalModeAdapter() {
		if (externalModeItemProvider == null) {
			externalModeItemProvider = new ExternalModeItemProvider(this);
		}

		return externalModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.EnterMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterModeItemProvider enterModeItemProvider;

	/**
	 * This creates an adapter for a {@link sa.EnterMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnterModeAdapter() {
		if (enterModeItemProvider == null) {
			enterModeItemProvider = new EnterModeItemProvider(this);
		}

		return enterModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.ExitMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitModeItemProvider exitModeItemProvider;

	/**
	 * This creates an adapter for a {@link sa.ExitMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitModeAdapter() {
		if (exitModeItemProvider == null) {
			exitModeItemProvider = new ExitModeItemProvider(this);
		}

		return exitModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.CallAsyncService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallAsyncServiceItemProvider callAsyncServiceItemProvider;

	/**
	 * This creates an adapter for a {@link sa.CallAsyncService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallAsyncServiceAdapter() {
		if (callAsyncServiceItemProvider == null) {
			callAsyncServiceItemProvider = new CallAsyncServiceItemProvider(this);
		}

		return callAsyncServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.CallSyncService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallSyncServiceItemProvider callSyncServiceItemProvider;

	/**
	 * This creates an adapter for a {@link sa.CallSyncService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallSyncServiceAdapter() {
		if (callSyncServiceItemProvider == null) {
			callSyncServiceItemProvider = new CallSyncServiceItemProvider(this);
		}

		return callSyncServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StartTimer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTimerItemProvider startTimerItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StartTimer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartTimerAdapter() {
		if (startTimerItemProvider == null) {
			startTimerItemProvider = new StartTimerItemProvider(this);
		}

		return startTimerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StopTimer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopTimerItemProvider stopTimerItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StopTimer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStopTimerAdapter() {
		if (stopTimerItemProvider == null) {
			stopTimerItemProvider = new StopTimerItemProvider(this);
		}

		return stopTimerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StoreData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreDataItemProvider storeDataItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StoreData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreDataAdapter() {
		if (storeDataItemProvider == null) {
			storeDataItemProvider = new StoreDataItemProvider(this);
		}

		return storeDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.BroadcastSendMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastSendMessageItemProvider broadcastSendMessageItemProvider;

	/**
	 * This creates an adapter for a {@link sa.BroadcastSendMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBroadcastSendMessageAdapter() {
		if (broadcastSendMessageItemProvider == null) {
			broadcastSendMessageItemProvider = new BroadcastSendMessageItemProvider(this);
		}

		return broadcastSendMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.UnicastSendMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnicastSendMessageItemProvider unicastSendMessageItemProvider;

	/**
	 * This creates an adapter for a {@link sa.UnicastSendMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnicastSendMessageAdapter() {
		if (unicastSendMessageItemProvider == null) {
			unicastSendMessageItemProvider = new UnicastSendMessageItemProvider(this);
		}

		return unicastSendMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.MulticastSendMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticastSendMessageItemProvider multicastSendMessageItemProvider;

	/**
	 * This creates an adapter for a {@link sa.MulticastSendMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMulticastSendMessageAdapter() {
		if (multicastSendMessageItemProvider == null) {
			multicastSendMessageItemProvider = new MulticastSendMessageItemProvider(this);
		}

		return multicastSendMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Sense} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenseItemProvider senseItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Sense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSenseAdapter() {
		if (senseItemProvider == null) {
			senseItemProvider = new SenseItemProvider(this);
		}

		return senseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.SensePosition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensePositionItemProvider sensePositionItemProvider;

	/**
	 * This creates an adapter for a {@link sa.SensePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensePositionAdapter() {
		if (sensePositionItemProvider == null) {
			sensePositionItemProvider = new SensePositionItemProvider(this);
		}

		return sensePositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.SenseAccelerometer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenseAccelerometerItemProvider senseAccelerometerItemProvider;

	/**
	 * This creates an adapter for a {@link sa.SenseAccelerometer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSenseAccelerometerAdapter() {
		if (senseAccelerometerItemProvider == null) {
			senseAccelerometerItemProvider = new SenseAccelerometerItemProvider(this);
		}

		return senseAccelerometerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Actuate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuateItemProvider actuateItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Actuate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActuateAdapter() {
		if (actuateItemProvider == null) {
			actuateItemProvider = new ActuateItemProvider(this);
		}

		return actuateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Join} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinItemProvider joinItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Join}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinAdapter() {
		if (joinItemProvider == null) {
			joinItemProvider = new JoinItemProvider(this);
		}

		return joinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Fork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkItemProvider forkItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Fork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkAdapter() {
		if (forkItemProvider == null) {
			forkItemProvider = new ForkItemProvider(this);
		}

		return forkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Choice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceItemProvider choiceItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceAdapter() {
		if (choiceItemProvider == null) {
			choiceItemProvider = new ChoiceItemProvider(this);
		}

		return choiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.ServiceCallback} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCallbackItemProvider serviceCallbackItemProvider;

	/**
	 * This creates an adapter for a {@link sa.ServiceCallback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceCallbackAdapter() {
		if (serviceCallbackItemProvider == null) {
			serviceCallbackItemProvider = new ServiceCallbackItemProvider(this);
		}

		return serviceCallbackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.ServiceCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCallItemProvider serviceCallItemProvider;

	/**
	 * This creates an adapter for a {@link sa.ServiceCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceCallAdapter() {
		if (serviceCallItemProvider == null) {
			serviceCallItemProvider = new ServiceCallItemProvider(this);
		}

		return serviceCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.ReceiveMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveMessageItemProvider receiveMessageItemProvider;

	/**
	 * This creates an adapter for a {@link sa.ReceiveMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReceiveMessageAdapter() {
		if (receiveMessageItemProvider == null) {
			receiveMessageItemProvider = new ReceiveMessageItemProvider(this);
		}

		return receiveMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.TimerFired} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerFiredItemProvider timerFiredItemProvider;

	/**
	 * This creates an adapter for a {@link sa.TimerFired}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimerFiredAdapter() {
		if (timerFiredItemProvider == null) {
			timerFiredItemProvider = new TimerFiredItemProvider(this);
		}

		return timerFiredItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.PrimitiveDataDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveDataDeclarationItemProvider primitiveDataDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link sa.PrimitiveDataDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveDataDeclarationAdapter() {
		if (primitiveDataDeclarationItemProvider == null) {
			primitiveDataDeclarationItemProvider = new PrimitiveDataDeclarationItemProvider(this);
		}

		return primitiveDataDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StructuredDataDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredDataDeclarationItemProvider structuredDataDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StructuredDataDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredDataDeclarationAdapter() {
		if (structuredDataDeclarationItemProvider == null) {
			structuredDataDeclarationItemProvider = new StructuredDataDeclarationItemProvider(this);
		}

		return structuredDataDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link sa.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.IntegerConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerConstItemProvider integerConstItemProvider;

	/**
	 * This creates an adapter for a {@link sa.IntegerConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerConstAdapter() {
		if (integerConstItemProvider == null) {
			integerConstItemProvider = new IntegerConstItemProvider(this);
		}

		return integerConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.BooleanConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConstItemProvider booleanConstItemProvider;

	/**
	 * This creates an adapter for a {@link sa.BooleanConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanConstAdapter() {
		if (booleanConstItemProvider == null) {
			booleanConstItemProvider = new BooleanConstItemProvider(this);
		}

		return booleanConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.RealConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealConstItemProvider realConstItemProvider;

	/**
	 * This creates an adapter for a {@link sa.RealConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealConstAdapter() {
		if (realConstItemProvider == null) {
			realConstItemProvider = new RealConstItemProvider(this);
		}

		return realConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StringConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringConstItemProvider stringConstItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StringConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringConstAdapter() {
		if (stringConstItemProvider == null) {
			stringConstItemProvider = new StringConstItemProvider(this);
		}

		return stringConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.EnumConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstItemProvider enumConstItemProvider;

	/**
	 * This creates an adapter for a {@link sa.EnumConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumConstAdapter() {
		if (enumConstItemProvider == null) {
			enumConstItemProvider = new EnumConstItemProvider(this);
		}

		return enumConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StructureConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureConstItemProvider structureConstItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StructureConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureConstAdapter() {
		if (structureConstItemProvider == null) {
			structureConstItemProvider = new StructureConstItemProvider(this);
		}

		return structureConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StructureElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureElementItemProvider structureElementItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StructureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureElementAdapter() {
		if (structureElementItemProvider == null) {
			structureElementItemProvider = new StructureElementItemProvider(this);
		}

		return structureElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.NullExp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullExpItemProvider nullExpItemProvider;

	/**
	 * This creates an adapter for a {@link sa.NullExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNullExpAdapter() {
		if (nullExpItemProvider == null) {
			nullExpItemProvider = new NullExpItemProvider(this);
		}

		return nullExpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.DataRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRefItemProvider dataRefItemProvider;

	/**
	 * This creates an adapter for a {@link sa.DataRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataRefAdapter() {
		if (dataRefItemProvider == null) {
			dataRefItemProvider = new DataRefItemProvider(this);
		}

		return dataRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.StructureMemberRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMemberRefItemProvider structureMemberRefItemProvider;

	/**
	 * This creates an adapter for a {@link sa.StructureMemberRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureMemberRefAdapter() {
		if (structureMemberRefItemProvider == null) {
			structureMemberRefItemProvider = new StructureMemberRefItemProvider(this);
		}

		return structureMemberRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.ArithmeticExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExprItemProvider arithmeticExprItemProvider;

	/**
	 * This creates an adapter for a {@link sa.ArithmeticExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArithmeticExprAdapter() {
		if (arithmeticExprItemProvider == null) {
			arithmeticExprItemProvider = new ArithmeticExprItemProvider(this);
		}

		return arithmeticExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.BooleanExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExprItemProvider booleanExprItemProvider;

	/**
	 * This creates an adapter for a {@link sa.BooleanExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanExprAdapter() {
		if (booleanExprItemProvider == null) {
			booleanExprItemProvider = new BooleanExprItemProvider(this);
		}

		return booleanExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sa.RelationalExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalExprItemProvider relationalExprItemProvider;

	/**
	 * This creates an adapter for a {@link sa.RelationalExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationalExprAdapter() {
		if (relationalExprItemProvider == null) {
			relationalExprItemProvider = new RelationalExprItemProvider(this);
		}

		return relationalExprItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (softwareArchitectureItemProvider != null) softwareArchitectureItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (controllerItemProvider != null) controllerItemProvider.dispose();
		if (sensorControllerItemProvider != null) sensorControllerItemProvider.dispose();
		if (inMessagePortItemProvider != null) inMessagePortItemProvider.dispose();
		if (outMessagePortItemProvider != null) outMessagePortItemProvider.dispose();
		if (internalControllerItemProvider != null) internalControllerItemProvider.dispose();
		if (initialModeItemProvider != null) initialModeItemProvider.dispose();
		if (externalModeItemProvider != null) externalModeItemProvider.dispose();
		if (enterModeItemProvider != null) enterModeItemProvider.dispose();
		if (exitModeItemProvider != null) exitModeItemProvider.dispose();
		if (callAsyncServiceItemProvider != null) callAsyncServiceItemProvider.dispose();
		if (callSyncServiceItemProvider != null) callSyncServiceItemProvider.dispose();
		if (startTimerItemProvider != null) startTimerItemProvider.dispose();
		if (stopTimerItemProvider != null) stopTimerItemProvider.dispose();
		if (storeDataItemProvider != null) storeDataItemProvider.dispose();
		if (broadcastSendMessageItemProvider != null) broadcastSendMessageItemProvider.dispose();
		if (unicastSendMessageItemProvider != null) unicastSendMessageItemProvider.dispose();
		if (multicastSendMessageItemProvider != null) multicastSendMessageItemProvider.dispose();
		if (senseItemProvider != null) senseItemProvider.dispose();
		if (sensePositionItemProvider != null) sensePositionItemProvider.dispose();
		if (senseAccelerometerItemProvider != null) senseAccelerometerItemProvider.dispose();
		if (actuateItemProvider != null) actuateItemProvider.dispose();
		if (joinItemProvider != null) joinItemProvider.dispose();
		if (forkItemProvider != null) forkItemProvider.dispose();
		if (choiceItemProvider != null) choiceItemProvider.dispose();
		if (serviceCallbackItemProvider != null) serviceCallbackItemProvider.dispose();
		if (serviceCallItemProvider != null) serviceCallItemProvider.dispose();
		if (receiveMessageItemProvider != null) receiveMessageItemProvider.dispose();
		if (timerFiredItemProvider != null) timerFiredItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (primitiveDataDeclarationItemProvider != null) primitiveDataDeclarationItemProvider.dispose();
		if (structuredDataDeclarationItemProvider != null) structuredDataDeclarationItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (integerConstItemProvider != null) integerConstItemProvider.dispose();
		if (booleanConstItemProvider != null) booleanConstItemProvider.dispose();
		if (realConstItemProvider != null) realConstItemProvider.dispose();
		if (stringConstItemProvider != null) stringConstItemProvider.dispose();
		if (enumConstItemProvider != null) enumConstItemProvider.dispose();
		if (structureConstItemProvider != null) structureConstItemProvider.dispose();
		if (structureElementItemProvider != null) structureElementItemProvider.dispose();
		if (nullExpItemProvider != null) nullExpItemProvider.dispose();
		if (dataRefItemProvider != null) dataRefItemProvider.dispose();
		if (structureMemberRefItemProvider != null) structureMemberRefItemProvider.dispose();
		if (arithmeticExprItemProvider != null) arithmeticExprItemProvider.dispose();
		if (booleanExprItemProvider != null) booleanExprItemProvider.dispose();
		if (relationalExprItemProvider != null) relationalExprItemProvider.dispose();
	}

}
