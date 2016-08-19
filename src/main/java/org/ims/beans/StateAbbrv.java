package org.ims.beans;

import java.util.Set;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StateAbbrv {

	@NotNull(message = "arrvId is required.")
	@Min(value=0,message="Invalid id")
	private int arrvId;
	@NotNull(message = "stateName is required")
	@Size(min=0,max=15,message="invalid size for stateName")
	private String stateName;
	@NotNull(message = "stateAbbrv is required")
	@Size(min=2,max=2,message="stateAbbrv not of size 2!")
	private String stateAbbrv;
	@NotNull(message="address set is required")
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
	public Set<Address> getStateAddressSet() {
		return stateAddressSet;
	}
	public void setStateAddressSet(Set<Address> stateAddressSet) {
		this.stateAddressSet = stateAddressSet;
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
