package MainStructure;

import java.time.LocalDate; 

/**
 * Specialization of the products class
 * Defines an enumeration for clothe size
 * 
 * **/
public class Clothing extends Products {

	public enum Size{XS, S, M, L, XL};
	
	private Size size;
	private String color;
	
	public Clothing(String name, String brand, double basePrice, Size size, String color) {
		super(name, brand, basePrice);
		this.size = size;
		this.color = color;
	}

	
	/**
	 * Discounts price by:
	 * 	- 10% if product is bought between Tuesday and Saturday (inclusive)
	 *  - 0% in all other cases
	 * **/
	@Override
	public double getDiscountedPrice(LocalDate date) {
		if(date.getDayOfWeek().getValue() >= 2 && date.getDayOfWeek().getValue() <= 6) {
			return basePrice - basePrice *0.1;
		}
		else {
			return basePrice;
		} 
	}

	@Override
	public String toString() {
		String output = "";
		output += name + " " + brand + " " + size.name() + " " + color + System.lineSeparator(); 
		
		return output;
	}
}
