package MainStructure;
/**
 * Simple container class for a product and its quantity
 * Quantity isnt stored in the Products class because objects of that
 * class dont reprezent the individual products, but rather a group of those
 * products with the same properties.
 * 
 * **/
public class ProductQuantity {

	public Products product;
	public double quantity;
	
	public ProductQuantity(Products product, double quantity) {
		this.product = product;
		
		//Only food can have a floating point value for quantity
		if(product.getClass() == Food.class)
			this.quantity = quantity;
		else this.quantity = (int)quantity;
	}
	
}
