package MainStructure;

import java.time.LocalDate; 
/**
 * Specialization of the Perishables class which is a further
 *  specialization of the Products class
 * **/
public class Beverages extends Perishables {

	public Beverages(String name, String brand, double basePrice, LocalDate expirationDate) {
		super(name, brand, basePrice, expirationDate); 
	}
	
}
