/**
 * 
 * 1 - The label associated with the CD is stored in an instance variable called label.
 * 2 - The length of playing time of the CD is stored in an instance variable called playingTime.
 *
 */
public class AudioCD extends SalesItem {
	private String label;
	private int playingTime;
	
	/**
	 * A constructor for a subclass of [SalesItem] for Audio CD that 
	 * includes label and playing time.
	 * @param code - the code associated with the sale item.
	 * @param price - the price associated with the sale item.
	 * @param quantity - the quantity of the item.
	 * @param label - the label of the CD.
	 * @param playingTime - the playing time of the CD.
	 */
	public AudioCD(int code, double price, int quantity, String label, int playingTime) {
		super(code, price, quantity);
		this.label = label;
		this.playingTime = playingTime;
	}
	
	/**
	 * Accessor method to the get label of the CD.
	 * @return a String representation of the CD label.
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Accessor method to get the playing time of the CD.
	 * @return an integer representation of the playing time of the CD.
	 */
	public int getPlayingTime() {
		return playingTime;
	}
	
	/**
	 * Modifier method to set the label of the [AudioCD].
	 * @param label - a String representation of the label.
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	/**
	 * Modifier method to set the playing time of the [AudioCD].
	 * @param playingTime - an integer representation of the playing time.
	 */
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	
	/**
	 * An implementation of the monthlyPromo abstract method to determine
	 * the price after a 5% price reduction applied each month.
	 * @return the price after the promo is applied.
	 */
	@Override
	public double monthlyPromo() {
		double cost = getPrice();
		double discount = cost * .05;
		return cost - discount;
	}
	
	/**
	 * toString override method that includes the label and playing time.
	 * @return a String representation of the [AudioCD] item.
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
		output += "label: ";
		output += label;
		output += "\t";
		output += "playingTime:";
		output += playingTime;
		return output;
	}

}
