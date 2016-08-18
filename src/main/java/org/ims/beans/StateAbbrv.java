package org.ims.beans;

import java.util.Set;

public class StateAbbrv {

	private int arrvId;
	private String stateName;
	private String stateAbbrv;
	private Set<Address> stateAddressSet;
	
	public int getArrvId() {
		return arrvId;
	}
	public void setArrvId(int arrvId) {
		this.arrvId = arrvId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateAbbrv() {
		return stateAbbrv;
	}
	public void setStateAbbrv(String stateAbbrv) {
		this.stateAbbrv = stateAbbrv;
	}
	public StateAbbrv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StateAbbrv(int arrvId, String stateName, String stateAbbrv, Set<Address> stateAddressSet) {
		super();
		this.arrvId = arrvId;
		this.stateName = stateName;
		this.stateAbbrv = stateAbbrv;
		this.stateAddressSet = stateAddressSet;
	}
}
