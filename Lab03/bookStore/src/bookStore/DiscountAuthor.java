package bookStore;

public class DiscountAuthor implements FlexDiscount {
	
	private double discountPerc;
	private String[] arrayOfAuthors;	
	
	public DiscountAuthor(double discountPerc, String[] arrayOfAuthors) {
		this.discountPerc = discountPerc;
		this.arrayOfAuthors = arrayOfAuthors;
	}
	
	@Override
	public double getDiscount(Book book) {
		for(int i = 0; i < arrayOfAuthors.length; i++){
			if(arrayOfAuthors[i].equalsIgnoreCase(book.getAuthor())) {
				return discountPerc;
			}
		}
		return 0.0;
	}
	
	@Override
	public String toString() {
		return discountPerc + "%" + java.util.Arrays.toString(arrayOfAuthors);
	}
}
