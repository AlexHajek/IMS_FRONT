package org.ims.beans;

import java.io.Serializable;

public class POLineComposite{
	
	private PurchaseOrder orderNumber;
	private int lineNumber;
	public PurchaseOrder getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(PurchaseOrder orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
}
