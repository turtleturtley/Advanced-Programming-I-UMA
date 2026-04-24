import bookStore.BookStore;

public class BookStoreTest {
	public static void main(String[] args) {
		BookStore myStore = new BookStore();
		
		myStore.addBook("george orwell", "1984", 8.20);
		myStore.addBook("Philip K. Dick", "Do Androids Dream of Electric Sheep?", 3.50);
		myStore.addBook("Isaac Asimov", "Foundation and Empire", 9.40);
		myStore.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
		myStore.addBook("Aldous Huxley", "A Brave New World", 6.50);
		myStore.addBook("Isaac Asimov", "Foundation", 7.30);
		myStore.addBook("William Gibson", "Neuromancer", 8.30);
		myStore.addBook("Isaac Asimov", "Second Foundation", 8.10);
		myStore.addBook("Isaac Newton", "arithmetica universalis", 7.50);
		myStore.addBook("George Orwell", "1984", 6.20);
		myStore.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);
		
		System.out.println(myStore.toString());
		
		myStore.deleteBook("George Orwell", "1984");
		myStore.deleteBook("Aldous Huxley", "A Brave New World");
		myStore.deleteBook("Isaac Newton", "Arithmetica Universalis");
		
		System.out.println(myStore.toString());
		
		myStore.getFinalPrice("Philip K. Dick", "Do Androids Dream of Electric Sheep?");
		myStore.getFinalPrice("isaac asimov", "foundation and empire");
		myStore.getFinalPrice("Ray Bradbury", "Fahrenheit 451");
		myStore.getFinalPrice("Isaac Asimov", "Foundation");
		myStore.getFinalPrice("william gibson", "neuromancer");
		myStore.getFinalPrice("Isaac Asimov", "Second Foundation");
		myStore.getFinalPrice("Isaac Newton", "Arithmetica Universalis");
		
	}
}
