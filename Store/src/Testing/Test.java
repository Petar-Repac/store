package Testing;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import MainStructure.*;
import MainStructure.Clothing.Size;


public class Test {

	public static void main(String[] args) {
		
		 
		Cart cart = new Cart();
		Cashier cashier = new Cashier();
		
		//Parsing dates within Product constructor adds visual clutter, so the dates are parsed here
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDate date1 = LocalDate.parse("2021-06-14", dateFormat);
		LocalDate date2 = LocalDate.parse("2022-02-02", dateFormat);
		LocalDate date3 = LocalDate.parse("2021-03-03", dateFormat);
		LocalDateTime dateTime1 = LocalDateTime.parse("2021-06-14 12:34:56", dateTimeFormat);
		
		//Test from the Moodle page	
		cart.addProducts(new Food("apples", "BrandA", 1.5, date1 ), 2.45);
		cart.addProducts(new Beverages("milk", "BrandM", 0.99, date2), 3);
		cart.addProducts(new Clothing("T-shirt", "BrandT", 15.99, Size.M, "violet"), 2);
		cart.addProducts(new Appliances("laptop", "BrandL", 2345, "ModelL", date3 , 1.125), 1);
		
		
		cashier.printReceipt(cart, dateTime1);
		
		
	}

}
