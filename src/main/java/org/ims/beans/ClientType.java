package org.ims.beans;

import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ClientType {
	
	@NotNull(message = "clientTypeId is required.")
	@Min(value=0,message="invalid clientTypeId")
	private int clientTypeId;
	@NotNull(message = "clientType is required.")
	@Size(min=0,max=25,message="invalid clientType")
	private String clientType;
	//@NotNull(message = "clientSet is required.")
	private Set<Client> ClientSet;
	
	public int getClientTypeId() {
		return clientTypeId;
	}

	public void setClientTypeId(int clientTypeId) {
		this.clientTypeId = clientTypeId;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public Set<Client> getClientSet() {
		return ClientSet;
	}

	public void setClientSet(Set<Client> clientSet) {
		ClientSet = clientSet;
	}

	public ClientType() {
		super();
	}

	public ClientType(int clientTypeId, String clientType, Set<Client> clientSet) {
		super();
		this.clientTypeId = clientTypeId;
		this.clientType = clientType;
		ClientSet = clientSet;
	}
}
