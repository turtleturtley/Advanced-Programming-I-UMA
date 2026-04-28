package bookStore;

public class FlexSalesBookStore extends BookStore{
	
	private FlexDiscount discount;
	
	public FlexSalesBookStore(FlexDiscount f) {
		this.discount = f;
	}
	
	public void setDiscount(FlexDiscount d) {
		discount = d;
	}
	
	public FlexDiscount getDiscount() {
		return discount;
	}
	
	@Override
	public void addBook(String author, String title, double basePrice) {
		Book book = new Book(author, title, basePrice);
		double dPerc = discount.getDiscount(book);
		
		Book bookFinal;
		
		if(dPerc > 0) {
			bookFinal = new BookOnSale(author, title, basePrice, dPerc);
		}
		else {
			bookFinal = book;
		}
		
		super.addBook(bookFinal);
	}
	
	@Override
	public String toString() {
		return discount.toString() + "\n" + super.toString();
	}
}
