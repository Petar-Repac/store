package MainStructure;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Class that is tasked with printing the receipt
 * based on cart and date provided.
 * Depends on implementation of class Cart (see UML diagram)
 * 
 **/
public class Cashier {
	
	/* Converts floating point values to
	 * two decimal point strings.
	 * And whole-number floating point values to
	 * integer strings
	 * Used for neat value printing
	 * 
	 * */
	private String format(double num) {
		if(num == (long) num)
			return String.format("%d", (long)num);
		else 
			return String.format("%.2f", num);
	}

	/** Prints receipt into console as per project requirements **/
	public void printReceipt(Cart cart, LocalDateTime date) {
		ArrayList<ProductQuantity> items = cart.getProducts();
		double subtotal = 0;
		double discount = 0;
		
		System.out.println("Date and time of purchase:");
		System.out.println(date.toString());
		System.out.println("--- Products ---");
		
		
		for(ProductQuantity item : items) {
			
			//Printing item specifics (name, brand ..)
			System.out.print(item.product.toString());
			
			//Getting base price and quantity
			double price = item.product.getBasePrice() * item.quantity;
			
			subtotal += price;
			System.out.println(format(item.quantity) + " x $" + item.product.getBasePrice()
							    + " = $" + format(price));
			
			
			//Getting discounted price and discount percent
			double discountedPrice = item.product.getDiscountedPrice(date.toLocalDate()) * item.quantity;
			

			if(price != discountedPrice) {
				
				discount += price - discountedPrice;
				//Discount percent is usually an integer
				int discountPercent = 100 - (int)Math.round(discountedPrice / price * 100);
				
				System.out.println("#discount " + discountPercent + "% -$" 
									+ format(price - discountedPrice));
			}
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("SUBTOTAL: $" + format(subtotal));
		System.out.println("DISCOUNT: -" + format(discount));
		System.out.println("TOTAL: $" + format(subtotal - discount));
	}
}
