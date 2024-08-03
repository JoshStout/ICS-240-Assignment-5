/**
 * 
 * Invariants:
 * 1 - The author of the book is stored in an instance variable called author.
 * 2 - the number of pages for the book is stored in an instance variable called numPages.
 *
 */
public class Book extends SalesItem {
	private String author;
	private int numPages;
	
	/**
	 * Constructor for [book] object, which is an child class of [SaleItem].
	 * @param code - the code associated with the sale item.
	 * @param price - the price associated with the sale item.
	 * @param quantity - the quantity of the item.
	 * @param author - the name of the author of the book item.
	 * @param numPages - the number of pages of the book item.
	 */
	public Book(int code, double price, int quantity, String author, int numPages) {
		super(code, price, quantity);
		this.author = author;
		this.numPages = numPages;
	}
	
	/**
	 * Accessor method to get the author.
	 * @return a String representation of the author.
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Accessor method to get the number of pages of the [Book].
	 * @return an integer representation of the number of pages.
	 */
	public int getNumPages() {
		return numPages;
	}
	
	/**
	 * Modifier method to set the author of the [Book].
	 * @param author - a String representation of the author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Modifier method to set the number of pages of the [Book].
	 * @param numPages - an integer representation of the number of pages.
	 */
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	
	/**
	 * An implementation of the monthlyPromo abstract method to determine
	 * the price after a 3% price reduction applied each month.
	 * @return the price after the promo is applied.
	 */
	@Override
	public double monthlyPromo() {
		double cost = getPrice();
		double discount = cost * .03;
		return cost - discount;
	}
	
	/**
	 * toString override method that includes the author
	 * and the numPages.
	 * @return a String representation of the [Book] item.
	 */
	@Override
	public String toString() {
		String output = "";
		output += "code: ";
		output += getCode();
		output += "\t";
		output += "price: ";
		output += getPrice();
		output += "\t";
		output += "quantity: ";
		output += getQuantity();
		output += "\t";
		output += "author: ";
		output += author;
		output += "\t";
		output += "numPages:";
		output += numPages;
		return output;
	}

}
