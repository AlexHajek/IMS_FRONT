package org.ims.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Client {
	
	@NotNull(message = "id is required.")
	@Min(value=0,message="invalid id")
	private int id;
	@NotNull(message = "name is required.")
	@Size(min=0,max=100,message="invalid name")
	private String name;
	@NotNull(message = "email is required.")
	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message="invalid email")
	private String email;
	@NotNull(message = "pocname is required.")
	@Size(min=0,max=250,message="invalid pocname")
	private String pocn;
	@NotNull(message = "phone is required.")
	@Size(min=0,max=15,message="invalid phone")
	private String phone;
	@NotNull(message = "fax is required.")
	@Size(min=0,max=15,message="invalid fax")
	private String fax;
	@NotNull(message = "address is required.")
	private Address address;
	@NotNull(message = "clientType is required.")
	private ClientType clientType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPocn() {
		return pocn;
	}
	public void setPocn(String pocn) {
		this.pocn = pocn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ClientType getClientType() {
		return clientType;
	}
	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}
	public Client() {
		super();
	}
	public Client(int id, String name, String email, String pocn, String phone, String fax, Address address,
	    ClientType clientType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pocn = pocn;
		this.phone = phone;
		this.fax = fax;
		this.address = address;
		this.clientType = clientType;
	}
}

