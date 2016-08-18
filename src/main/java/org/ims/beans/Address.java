package org.ims.beans;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {
	
	@NotNull(message = "arrvId is required.")
	@Min(value=0,message="invalid id")
	private int addressId;
	@NotNull(message = "streetAddress1 is required.")
	@Size(min=0,max=250,message="invalid address size")
	private String streetAddress1;
	@NotNull(message = "streetAddress2 is required.")
	@Size(min=0,max=50,message="invalid address size")
	private String streetAddress2;
	@NotNull(message = "addressCity is required.")
	@Size(min=0,max=35,message="invalid address city")
	private String addressCity;
	@NotNull(message = "addressZip is required.")
	@Digits(integer=10, fraction=0, message="invalid zip")
	private String addressZip;
	@NotNull(message = "stateAbbrv is required.")
	@Size(min=2,max=2,message="invalid state abbrv")
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
