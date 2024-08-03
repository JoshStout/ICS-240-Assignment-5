
/**
 * 
 * Invariants:
 * 1 - an integer value that represent the discount percent is stored in an instance variable called discount.
 * For example, discount of 10 means 10% discount.
 * 2 - an integer value that represents the required quantity in order for the item to be qualified for a discount 
 * is stored in an instance variable called qualifiedQuantity.
 *
 */
public class ItemDiscount {
	private int discount;
	private int qualifiedQuantity;
	
	/**
	 * Constructor for [ItemDiscount] class.
	 * @param discount - an integer value representing the discount percent.
	 * @param qualifiedQuantity - an integer value representing the required quantity in order
	 * for the item to be qualified for a discount.
	 */
	public ItemDiscount(int discount, int qualifiedQuantity) {
		this.discount = discount;
		this.qualifiedQuantity = qualifiedQuantity;
	}
	
	/**
	 * Determines the amount of money to be deducted from the item.
	 * @param item - the item of [SalesItem] to be determine its discount.
	 * @return - the amount of money to be deducted.
	 */
	public double calculateDiscount(SalesItem item) {
		double percent = 0;
		if(item.getQuantity() >= this.qualifiedQuantity) {
			percent = (double)this.discount * .01;
		}
		return item.getPrice() * percent;
	}
	
}
