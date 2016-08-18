package org.ims.beans;

public class Client {
	
		private int id;
		private String name;
		private String email;
		private String pocn;
		private String phone;
		private String fax;
		private Address address;
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

}
