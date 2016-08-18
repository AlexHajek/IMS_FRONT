package org.ims.beans;

public class Address {
	
	private int addressId;
	private String streetAddress1;
	private String streetAddress2;
	private String addressCity;
	private String addressZip;
	private StateAbbrv stateAbbrv;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressZip() {
		return addressZip;
	}
	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String streetAddress1, String streetAddress2, String addressCity,
			String addressZip, StateAbbrv stateAbbrv) {
		super();
		this.addressId = addressId;
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.addressCity = addressCity;
		this.addressZip = addressZip;
		this.stateAbbrv = stateAbbrv;
	}	
}
