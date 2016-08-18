package org.ims.beans;

public class POLine {

	private POLineComposite compositeKey;

	private double unitPrice;

	private int quantityOrdered;
	
	private Product product;

	private PurchaseOrder order;
	
	public POLineComposite getCompositeKey() {
		return compositeKey;
	}
	public void setCompositeKey(POLineComposite compositeKey) {
		this.compositeKey = compositeKey;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public PurchaseOrder getOrder() {
		return order;
	}
	public void setOrder(PurchaseOrder order) {
		this.order = order;
	}
	public POLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public POLine(POLineComposite compositeKey, double unitPrice, int quantityOrdered, Product product,
			PurchaseOrder order) {
		super();
		this.compositeKey = compositeKey;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.product = product;
		this.order = order;
	}
}
