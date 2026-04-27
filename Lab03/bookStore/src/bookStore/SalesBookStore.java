package bookStore;

import java.util.Arrays;

public class SalesBookStore extends BookStore {
	private double discount;
	private String[] saleAuthors;
	
	public SalesBookStore(double discount, String[] authors) {
		super();
		this.discount = discount;
		this.saleAuthors = authors;
	}
	
	public String[] getSale() {
		return saleAuthors;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	@Override
	public void addBook(String author, String title, double basePrice) {
		boolean found = false;
	    
	    for (String sAuthor : saleAuthors) {
	        if (sAuthor.equalsIgnoreCase(author)) {
	            found = true;
	            break;
	        }
	    }

	    if (found) {
	        super.addBook(new BookOnSale(author, title, basePrice, this.discount));
	    } else {
	        super.addBook(new Book(author, title, basePrice));
	    }
	}
	
	@Override
	public String toString() {
		String str = getDiscount() + "%" + Arrays.toString(saleAuthors);
		return str + "\n" + super.toString();
	}
}
