package MainStructure;

import java.time.LocalDate;  
import java.time.temporal.ChronoUnit;
/**
 * Finer abstraction of the Products class
 * Considering the project requirements, there was no need
 * for this class to be abstract as Food and Beverages classes
 * are unnecessary. Although it seemed that there is a clear distinction between
 * those two products, and they could be treated differently in the future.
 * 
 * **/
public abstract class Perishables extends Products {

	protected LocalDate expirationDate;
	
	public Perishables(String name, String brand, double basePrice,LocalDate expirationDate) {
		super(name, brand, basePrice);
		this.expirationDate = expirationDate;
	}
	
	
	/**
	 * Discounts price by:
	 * 	- 70% if product expires on the date of purchase
	 * 	- 30% if product expires within 5 days of the purchase date
	 *  - 0% in all other cases
	 * **/
	@Override
	public double getDiscountedPrice(LocalDate date) {
		
		int dayDifference = (int)ChronoUnit.DAYS.between(date, expirationDate); 
		if(dayDifference == 0) {
			return basePrice - basePrice * 0.7;
		}
		else if(dayDifference <=5) {
			return basePrice - basePrice * 0.3;		
		}
		else {
			return basePrice;		
		} 
	}

}
