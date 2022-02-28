package MainStructure;

import java.time.LocalDate;
/**
 * Specialization of the products class
 * Production date and weight werent needed, but are left
 * because of the project requirements
 * 
 * **/
public class Appliances extends Products {

	private String model;
	private LocalDate productionDate;
	private double weight;
	
	public Appliances(String name, String brand, double basePrice, String model, LocalDate productionDate, double weight) {
		super(name, brand, basePrice);
		this.model = model;
		this.productionDate = productionDate;
		this.weight = weight; 
	}

	
	/**
	 * Discounts price by:
	 * 	- 7% if product is bought on the weekends and has a price bigger than $999 
	 *  - 0% in all other cases
	 * **/
	@Override
	public double getDiscountedPrice(LocalDate date) {
		if(date.getDayOfWeek().getValue() >= 6 && date.getDayOfWeek().getValue() <= 7 && basePrice > 999) {
			return basePrice - basePrice *0.07;
		}
		else {
			return basePrice;
		} 
	}
	
	@Override
	public String toString() {
		String output = "";
		output += name + " " + brand + " " + model + System.lineSeparator(); 
		
		return output;
	}

}
