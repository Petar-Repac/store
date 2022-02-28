package MainStructure;

import java.time.LocalDate; 
/**
 * Abstraction of all products
 * Declares an abstract method for calculating discounted prices
 * Implementation is left to the child classes
 * 
 * Getters and setters for all fields should probbably be added, but
 * they werent needed considering the project requirements
 * **/


public abstract class Products {
	protected String name;
	protected String brand;
	protected double basePrice; 
	
	public Products(String name, String brand, double basePrice) {
		this.name = name;
		this.brand = brand;
		this.basePrice = basePrice; 
	}
	
	public double getBasePrice() {
		return basePrice;
	}
	/**Different implementation for each product type**/
	public abstract double getDiscountedPrice(LocalDate date);
	
	@Override
	public String toString() {
		String output = "";
		output += name + " " + brand + System.lineSeparator(); 
		
		return output;
	}

}
