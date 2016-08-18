package org.ims.beans;

import java.sql.Blob;
import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product {		
	@NotNull(message="UPC is required")
	@Min(value=0,message="Invalid UPC")
	private int productUPC;
	@NotNull(message="Name is required")
	@Size(max=150,message="Too Long")
	private String productName;
	@NotNull(message="Description is required")
	@Size(max=150,message="Too Long")
	private String productDescription;
	@NotNull(message="Abbreviation is required")
	@Size(max=5,message="Too Long")
	private String shortName;
	@NotNull(message="Cost is required")
	@Min(value=0,message="Invalid Price")
	private double unitCost;
	@NotNull(message="Size is required")
	@Size(max=10,message="Too Long")
	private String packSize;
	@NotNull(message="Reorder Minimum is required")
	@Min(value=0,message="Invalid Quantity")
	private int reorderQuantity;
	@NotNull(message="Price is required")
	@Min(value=0,message="Invalid Price")
	private double retailPrice;
	@Min(value=0,message="Invalid Weight")
	private double productWeight;
	private Blob productImage;
	@NotNull(message="Category is required")
	private Set<ProductCategory> categoriesForProduct;
	@NotNull(message="Line is required")
	private Set<POLine> linesForProduct;

	
	public int getProductUPC() {
		return productUPC;
	}
	public void setProductUPC(int productUPC) {
		this.productUPC = productUPC;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public String getPackSize() {
		return packSize;
	}
	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}
	public int getReorderQuantity() {
		return reorderQuantity;
	}
	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public double getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}
	public Blob getProductImage() {
		return productImage;
	}
	public void setProductImage(Blob productImage) {
		this.productImage = productImage;
	}
	public Set<ProductCategory> getCategoriesForProduct() {
		return categoriesForProduct;
	}
	public void setCategoriesForProduct(Set<ProductCategory> categoriesForProduct) {
		this.categoriesForProduct = categoriesForProduct;
	}

	public Set<POLine> getLinesForProduct() {
		return linesForProduct;
	}
	public void setLinesForProduct(Set<POLine> linesForProduct) {
		this.linesForProduct = linesForProduct;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productUPC, String productName, String productDescription, String shortName, double unitCost,
			String packSize, int reorderQuantity, double retailPrice, double productWeight, Blob productImage,
			Set<ProductCategory> categoriesForProduct, Set<POLine> linesForProduct) {
		super();
		this.productUPC = productUPC;
		this.productName = productName;
		this.productDescription = productDescription;
		this.shortName = shortName;
		this.unitCost = unitCost;
		this.packSize = packSize;
		this.reorderQuantity = reorderQuantity;
		this.retailPrice = retailPrice;
		this.productWeight = productWeight;
		this.productImage = productImage;
		this.categoriesForProduct = categoriesForProduct;
		this.linesForProduct = linesForProduct;
	}
}