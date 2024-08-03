/**
 * 
 * Invariants:
 * 1 - the number of [SalesItems] contained in the cart is stored in an instance variable called numItems.
 * 2 - the cart entries are stored in an instance array variable called itemsList, from position itemsList[0]
 * to position itemsList[maxItems-1].
 *
 */

public class Cart {
	private SalesItem[] itemsList;
	private int numItems;
	
	/**
	 * Constructor for [Cart] collection class of [SalesItem].
	 * @param maxItems - the maximum number of items that can be placed in the cart.
	 */
	public Cart(int maxItems) {
		this.itemsList = new SalesItem[maxItems];
		this.numItems = 0;
	}
	
	/**
	 * Adds inputed item to the itemsList array. If the array is already full,
	 * the cart capacity is doubled.
	 * @param item - the item to be added to the cart.
	 */
	public void add(SalesItem item) {
		
		//if the array is full
		//create an array twice the size
		if(this.numItems == this.itemsList.length) {
			int currentCapacity = this.itemsList.length;
			int newCapacity = currentCapacity * 2;
			SalesItem[] newItemsList = new SalesItem[newCapacity];
			
			for(int i = 0; i < this.itemsList.length; i++) {
				newItemsList[i] = this.itemsList[i];
			}
			this.itemsList = newItemsList;
		}
		
		this.itemsList[this.numItems]= item;
		this.numItems++;
	}
	
	/**
	 * The capacity of the array of items.
	 * @return an integer representation of the size of the array.
	 */
	public int capacity() {
		return this.itemsList.length;
	}
	
	/**
	 * The number of items in the cart.
	 * @return in integer representation of the number of items in the cart.
	 */
	public int size() {
		return this.numItems;
	}
	
	/**
	 * The total cost of all items in the cart.
	 * @return a double representation of all the items in the cart.
	 */
	public double cartTotalCost() {
		double total = 0;
		for(int i = 0; i < this.itemsList.length; i++) {
			total += itemsList[i].getPrice();
		}
		return total;
	}
	
	/**
	 * Returns the item at a specific index.
	 * @param index - the index of the item to return.
	 * @return the item specified at the index entered.
	 */
	public SalesItem getAtIndex(int index) {
		if(index > this.size() || index < 0) {
			return null;
		}
		return itemsList[index];
	}
	
	/**
	 * Counts how many if a particular item are in the cart.
	 * @param index - an integer that represents the type of item:
	 * 1 = Book, 2 = Dictionary, 3 = AudioCD.
	 * @return an integer representation of the quantity of items in the cart matching the
	 * input type.
	 */
	public int countType(int type) {
		if(type < 1 || type > 3) {
			return 0;
		}
		int count = 0; 
		int bookCount = 0;
		int dictionaryCount = 0;
		int AudioCDCount = 0;
			
		for(int i = 0; i < this.itemsList.length; i++) {
			if(itemsList[i] instanceof Book	) {
				bookCount += itemsList[i].getQuantity();
			}
			if(itemsList[i] instanceof Dictionary) {
				dictionaryCount += itemsList[i].getQuantity();	
			}
			if(itemsList[i] instanceof AudioCD) {
				AudioCDCount += itemsList[i].getQuantity();
			}
		}
		
		switch(type) {
		case 1:
			count = bookCount;
			break;
		case 2:
			count = dictionaryCount;
			break;
		case 3:
			count = AudioCDCount;
			break;
		}
		return count;
	}
	
	/**
	 * toString override method.
	 * @return a String representation of the cart.
	 */
	@Override
	public String toString() {
		String output = "";
		for(int i = 0; i < this.numItems; i++) {
			output = output + this.itemsList[i].toString() + "\n";
		}
		return output;
	}

}
