package org.ims.beans;

import java.sql.Blob;
import java.util.Set;

public class Product {		

		private int productUPC;

		private String productName;

		private String productDescription;

		private String shortName;

		private double unitCost;

		private String packSize;

		private int reorderQuantity;
		private int retailPrice;
		private int productWeight;
		private Blob productImage;

		private Set<ProductCategory> categoriesForProduct;

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
		public int getRetailPrice() {
			return retailPrice;
		}
		public void setRetailPrice(int retailPrice) {
			this.retailPrice = retailPrice;
		}
		public int getProductWeight() {
			return productWeight;
		}
		public void setProductWeight(int productWeight) {
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
				String packSize, int reorderQuantity, int retailPrice, int productWeight, Blob productImage,
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
