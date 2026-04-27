package bookStore;

public class BookOnSale extends Book{
	private double discountPercentage;

	public BookOnSale(String author, String title, double basePrice, double discountPercentage) {
		super(author, title, basePrice);
		this.discountPercentage = discountPercentage;
	}
	
	public double getDiscount() {
		return discountPercentage;
	}
	
	@Override
	protected double getTaxBasePrice() {
		return super.getTaxBasePrice() - super.getTaxBasePrice() * discountPercentage / 100;
	}
	
	@Override
	public String toString() {
		return "(" + getAuthor() + "; " + getTitle() + "; " + getBasePrice() + "; " +
				discountPercentage + "%; " + getTaxBasePrice() + "; " + getVAT() + "%; " + getFinalPrice() + ")";
	}
}
