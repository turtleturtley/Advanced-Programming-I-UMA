package bookStore;

public class DiscountPrice implements FlexDiscount {

	private double discountPerc;
	private double priceThreshold;

	public DiscountPrice(double discountPerc, double priceThreshold) {
		this.discountPerc = discountPerc;
		this.priceThreshold = priceThreshold;
	}
	
	@Override
	public double getDiscount(Book book) {
		if (book.getBasePrice() >= priceThreshold) { 
	        return discountPerc; 
	    } else {
	        return 0.0; 
	    }
	}
	
	@Override
	public String toString() {
		return discountPerc + "%(" + priceThreshold + ")";
	}
	
}
