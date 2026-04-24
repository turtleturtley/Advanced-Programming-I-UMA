package bookStore;

import java.util.ArrayList;

public class BookStore {
	private ArrayList<Book> books;
	
	public BookStore() {
		books = new ArrayList<>();
	}
	
	public void addBook(String author, String title, double basePrice) {
		addBook(new Book(author, title, basePrice));
	}
	
	public void deleteBook(String author, String title) {
		int i = seekBook(author, title);
		if(i >= 0) {
			books.remove(i);
			return;
		}
		throw new RuntimeException("Book not found (" + author + ", " + title + ")");
	}
	
	public double getBasePrice(String author, String title) {
		int i = seekBook(author, title);
		if(i >= 0) {
			return books.get(i).getBasePrice();
		}
		throw new RuntimeException("Book not found (" + author + ", " + title + ")");
	}
	
	public double getFinalPrice(String author, String title) {
		int i = seekBook(author, title);
		if(i >= 0) {
			return books.get(i).getFinalPrice();
		}
		throw new RuntimeException("Book not found (" + author + ", " + title + ")");
	}
	
	@Override
	public String toString() {
		String str = "";
		if (books.size() > 0) {
			str += books.get(0).toString();
			for (int i = 1; i < books.size(); ++i) {
				str += ",\n " + books.get(i).toString();
			}
		}
		return "[" + str + "]";
	}
	
	protected void addBook(Book b) {
		int i = seekBook(b.getAuthor(), b.getTitle());
		if (i >= 0) {
			books.set(i, b);
		} else {
			books.add(b);
		}
	}
	
	private int seekBook(String author, String title) {
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getAuthor().equalsIgnoreCase(author) &&
					books.get(i).getTitle().equalsIgnoreCase(title)) {
				return i;
			}
		}
		return -1;
	}
}
