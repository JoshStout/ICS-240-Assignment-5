/**
 * 
 * Invariants: 
 * 1 - The code associated with the sale item is stored in an instance variable called code.
 * 2 - The price for the item is stored in an instance variable called price.
 * 3 - The quantity of the sale item is stored in an instance variable called quantity.
 */

public abstract class SalesItem {
	
	private int code;
	private double price;
	private int quantity;
	
	/**
	 * Constructor for [SalesItem] abstract class.
	 * @param code - the code associated with the sale item.
	 * @param price - the price associated with the sale item.
	 * @param quantity - the quantity of the item.
	 */
	public SalesItem(int code, double price, int quantity) {
		this.code = code;
		this.price = price;
		this.quantity = quantity;
	}
	
	/**
	 * Accessor method to get the item code.
	 * @return an integer representation of the item code.
	 */
	public int getCode() {
		return code;
	}
	
	/**
	 * Accessor method to get the price of the item.
	 * @return a double representation of the sale item price.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 *  Accessor method to get the quantity of the sale item.
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Modifier method to set the item code;
	 * @param code - the code associated with the item.
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	 * Modifier method to set the price of the item.
	 * @param price - the price associated with the item.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Modifier method to set the quantity of items.
	 * @param quantity - the quantity associated with the item.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Method determines the total cost by multiplying the quantity by the price.
	 * @return a double that represents the total cost of the item.
	 */
	public double itemTotalCost() {
		return quantity * price;
	}
	
	/**
	 * an abstract method that is used to change the price of an item by applying
	 * a monthly discount to the item where the discount is dependent on the
	 * type of the item.
	 */
	public abstract double monthlyPromo();
	
	/**
	 * toString override method.
	 * @return a String representation of the sale item.
	 */
	@Override
	public String toString() {
		String output = "";
		output += "code: ";
		output += code;
		output += "\t";
		output += "price: ";
		output += price;
		output += "\t";
		output += "quantity: ";
		output += quantity;
		return output;
	}

}
