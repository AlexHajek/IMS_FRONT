package org.ims.beans;

import java.util.Set;

public class ProductCategory {


	private int categoryId;

	private String categoryDescription;
	
	private Set<Product> productsForCategory; 
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public Set<Product> getProductsForCategory() {
		return productsForCategory;
	}
	public void setProductsForCategory(Set<Product> productsForCategory) {
		this.productsForCategory = productsForCategory;
	}
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCategory(int categoryId, String categoryDescription, Set<Product> productsForCategory) {
		super();
		this.categoryId = categoryId;
		this.categoryDescription = categoryDescription;
		this.productsForCategory = productsForCategory;
	}
}

