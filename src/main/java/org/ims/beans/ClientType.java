package org.ims.beans;

import java.util.Set;

public class ClientType {
	
	private int clientTypeId;
	private String clientType;
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
