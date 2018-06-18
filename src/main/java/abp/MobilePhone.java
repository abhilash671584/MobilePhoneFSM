package abp;

import java.util.Set;

import org.apache.commons.scxml.env.AbstractStateMachine;
import org.apache.commons.scxml.model.State;

public class MobilePhone extends AbstractStateMachine {


	private static final String SCXML_CONFIG_ATM_STATUS = "simple.scxml";


	public MobilePhone() {
        	super(MobilePhone.class.getClassLoader().getResource(SCXML_CONFIG_ATM_STATUS));
}
	
	public void fireEvents(String eventName) {
		System.out.println("Firing the event " + eventName);
		this.fireEvent(eventName);
	}
	
	public State getCurrentState() {
		Set<?> states = getEngine().getCurrentStatus().getStates();
		return (State) states.iterator().next();
	}
	
	public void idle() {
		System.out.println("System is in IDLE state now");
	}
	
	public void ringing() {
		System.out.println("System is in RINGING state now");
	}
	
	public void answered() {
		System.out.println("System is in ANSWERED state now");
	}
	
	public void disconnected() {
		System.out.println("System is in DISCONNECTED state now");
	}

}
