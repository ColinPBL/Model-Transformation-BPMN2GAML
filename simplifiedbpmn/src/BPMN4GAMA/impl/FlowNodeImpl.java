/**
 */
package BPMN4GAMA.impl;

import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.FlowNode;
import BPMN4GAMA.SequenceFlow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.impl.FlowNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN4GAMA.impl.FlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link BPMN4GAMA.impl.FlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowNodeImpl extends FlowElementImpl implements FlowNode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN4GAMAPackage.Literals.FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.FLOW_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceFlow> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this, BPMN4GAMAPackage.FLOW_NODE__INCOMING, BPMN4GAMAPackage.SEQUENCE_FLOW__TARGET_REF);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceFlow> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this, BPMN4GAMAPackage.FLOW_NODE__OUTGOING, BPMN4GAMAPackage.SEQUENCE_FLOW__SOURCE_REF);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN4GAMAPackage.FLOW_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case BPMN4GAMAPackage.FLOW_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN4GAMAPackage.FLOW_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case BPMN4GAMAPackage.FLOW_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN4GAMAPackage.FLOW_NODE__NAME:
				return getName();
			case BPMN4GAMAPackage.FLOW_NODE__INCOMING:
				return getIncoming();
			case BPMN4GAMAPackage.FLOW_NODE__OUTGOING:
				return getOutgoing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN4GAMAPackage.FLOW_NODE__NAME:
				setName((String)newValue);
				return;
			case BPMN4GAMAPackage.FLOW_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
			case BPMN4GAMAPackage.FLOW_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BPMN4GAMAPackage.FLOW_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN4GAMAPackage.FLOW_NODE__INCOMING:
				getIncoming().clear();
				return;
			case BPMN4GAMAPackage.FLOW_NODE__OUTGOING:
				getOutgoing().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BPMN4GAMAPackage.FLOW_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN4GAMAPackage.FLOW_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case BPMN4GAMAPackage.FLOW_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FlowNodeImpl
