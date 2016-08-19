package org.ims.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class POLineComposite{
	@NotNull(message="Order Number is required")
	private PurchaseOrder orderNumber;
	@NotNull(message="Line Number is required")
	@Min(value=0,message="Invalid Line")
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
