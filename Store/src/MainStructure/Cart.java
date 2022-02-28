package MainStructure;

import java.util.ArrayList; 
/**
 * Manages addition of products
 * Removal should also be coded, but wasnt required per
 * project specifications
 * **/
public class Cart {
	private ArrayList<ProductQuantity> products;
	
	public Cart() {
		products = new ArrayList<ProductQuantity>();
	}
	
	public ArrayList<ProductQuantity> getProducts(){
		return products;
	}
	
	public void addProducts(ProductQuantity product) {
		products.add(product);
	}
	
	public void addProducts(Products product, double quantity) {
		products.add(new ProductQuantity(product, quantity));
	}
}
