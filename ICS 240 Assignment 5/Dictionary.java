/**
 * 
 * Invariants:
 * 1 - The language of the dictionary is stored in an instance variable called language.
 * 2 - The number of definitions in the dictionary is stored in an instance variable called numDefinitions.
 *
 */
public class Dictionary extends Book {
	private String language;
	private int numDefinitions;
	
	/**
	 * A constructor for a subclass of [Book] that includes language and number of definitions.
	 * @param code - the code associated with the sale item.
	 * @param price - the price associated with the sale item.
	 * @param quantity - the quantity of the item.
	 * @param author - the name of the author of the book item.
	 * @param numPages - the number of pages of the book item.
	 * @param language - the language of the Dictionary.
	 * @param numDefinitions - the number of definitions in the book.
	 */
	public Dictionary(int code, double price, int quantity, String author, int numPages, String language, int numDefinitions) {
		super(code, price, quantity, author, numPages);
		this.language = language;
		this.numDefinitions = numDefinitions;
	}
	
	/**
	 * Accessor method to get the language.
	 * @return a String representation of the language.
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * Accessor method to get the number of definitions.
	 * @return an integer representation of the number of definitions.
	 */
	public int getNumDefinitions() {
		return numDefinitions;
	}
	
	/**
	 * Modifier method to set the language of the [Dictionary].
	 * @param language - a String representation of the language.
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/**
	 * Modifier method to set the numDefinitions of the [Dictionary].
	 * @param numDefinitions - a integer representation of the number of definitions.
	 */
	public void setNumDefinitions(int numDefinitions) {
		this.numDefinitions = numDefinitions;
	}
	
	/**
	 * toString override method that includes language
	 * and numDefinitions.
	 * @return a String representation of the [Dictionary] item.
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
		output += getAuthor();
		output += "\t";
		output += "numPages:";
		output += getNumPages();
		output += "\t";
		output += "language: ";
		output += language;
		output += "\t";
		output += "numDefinitions: ";
		output += numDefinitions;
		return output;
	}
	
	/**
	 * A method to determine the average number of definitions for each page 
	 * in the dictionary by dividing the number of definitions by the number 
	 * of pages.
	 * @return an integer representing the average number of definitions for each page.
	 */
	public int getRatio() {
		return numDefinitions/getNumPages();
	}

}
