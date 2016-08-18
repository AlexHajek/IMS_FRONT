package org.ims.beans;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PurchaseOrder {
	@NotNull(message="Order Number is required")
	@Min(value=0,message="Invalid Price")
	private int orderNum;
	@NotNull(message="Subtotal is required")
	@Min(value=0,message="Invalid Price")
	private double subtotal;
	@NotNull(message="Date is required")
	private Date purchaseDate;
	@NotNull(message="Tax is required")
	@Min(value=0,message="Invalid Price")
	private double taxAmount;
	@NotNull(message="Total is required")
	@Min(value=0,message="Invalid Price")
	private double poTotal;

	private Client client;
	
	private Set<POLine> orderLines;

	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public double getPoTotal() {
		return poTotal;
	}
	public void setPoTotal(double poTotal) {
		this.poTotal = poTotal;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public PurchaseOrder() {
		super();
	}
	public Set<POLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(Set<POLine> orderLines) {
		this.orderLines = orderLines;
	}
	public PurchaseOrder(int orderNum, double subtotal, Date purchaseDate, double taxAmount, double poTotal,
			 Client client,Set<POLine> orderLines) {
		super();
		this.orderNum = orderNum;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.client = client;
		this.orderLines = orderLines;
	}
}
