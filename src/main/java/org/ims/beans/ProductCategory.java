package org.ims.beans;

import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductCategory {

	@NotNull(message="Id is required")
	@Min(value=0,message="Invalid ID")
	private int categoryId;
	@NotNull(message="Description is required")
	@Size(max=50,message="Too Long")
	private String categoryDescription;
	@NotNull(message="Products are required")
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

