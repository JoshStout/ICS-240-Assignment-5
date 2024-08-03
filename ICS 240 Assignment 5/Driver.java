
public class Driver {

	public static void main(String[] args) {
		Cart c = new Cart(5);
		
		c.add(new Book(123, 12, 13, "Biff", 200));
		c.add(new Dictionary(456, 13.5, 2, "Marty", 300, "English", 1000));
		c.add(new AudioCD(789, 2.75, 1, "George", 60));
		c.add(new Book(101, 3, 6, "Doc", 100));
		c.add(new AudioCD(112, 4, 10, "Lorraine", 30));
		
		ItemDiscount d = new ItemDiscount(15, 10);
		
		double totalDiscount = 0;
		double total = 0;
		for(int i = 0; i < c.size(); i++) {
			double discounted = 0;
			double quantityDiscount = 0;
			
			SalesItem item = c.getAtIndex(i);
			System.out.print("Item " + (i+1) + "\n");
			
			total += item.itemTotalCost();
			
			System.out.println(item.toString());
			
			discounted = item.monthlyPromo();
			System.out.println("Price per item after monthly promo discount applied = $" + discounted);
			for(int j = 0; j < item.getQuantity(); j++) {
				totalDiscount += item.getPrice() - discounted;
			}
			
			item.setPrice(discounted);
			quantityDiscount = d.calculateDiscount(item);
			System.out.println("Quantity discount per item after monthly promo applied to the original price = $" + quantityDiscount);
			for(int k = 0; k < item.getQuantity(); k++) {
				totalDiscount += quantityDiscount;
			}
			System.out.println();
		}
		
		System.out.printf("Total discount = %8.2f%n" , totalDiscount);
		System.out.printf("Total before discount = %8.2f%n" , total);
		System.out.printf("Total after discount = %8.2f%n" , total - totalDiscount);
		
		
		System.out.println();
		System.out.println("Testing the rest of the methods not used in the homework instructions...");
		System.out.println();
		
		SalesItem dictionary = c.getAtIndex(1);
		int ratio = ((Dictionary) dictionary).getRatio();
		System.out.println(((Dictionary) dictionary).toString());
		System.out.println("getRatio(): " + ratio);
		
		System.out.println();
		System.out.println("Number of Dictionary items in cart: " + c.countType(2));
		
	}

}
