package bookStore;

public class MainFlexSalesBookStore {
	public static void main(String[] args) {
		
		String[] authors = {"George Orwell", "Isaac Asimov"};
		
		FlexDiscount authorDiscount = new DiscountAuthor(20.0, authors);
		FlexSalesBookStore store = new FlexSalesBookStore(authorDiscount);
		
		store.addBook("george orwell", "1984", 8.20);
		store.addBook("Philip K. Dick", "Do Androids Dream of Electric Sheep?", 3.50);
		store.addBook("Isaac Asimov", "Foundation and Empire", 9.40);
		store.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
		store.addBook("Aldous Huxley", "A Brave New World", 6.50);
		store.addBook("Isaac Asimov", "Foundation", 7.30);
		store.addBook("William Gibson", "Neuromancer", 8.30);
		store.addBook("Isaac Asimov", "Second Foundation", 8.10);
		store.addBook("Isaac Newton", "arithmetica universalis", 7.50);
		store.addBook("George Orwell", "1984", 6.20);
		store.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);
		
		System.out.println(store);
		System.out.println();
		
		store.deleteBook("George Orwell", "1984");
		store.deleteBook("Aldous Huxley", "A Brave New World");
		store.deleteBook("Isaac Newton", "Arithmetica Universalis");
		
		System.out.println(store);
		System.out.println();
		
		System.out.println("FinalPrice(\"Philip K. Dick\", \"Do Androids Dream of Electric Sheep?\"):"
				+ store.getFinalPrice("Philip K. Dick", "Do Androids Dream of Electric Sheep?"));
		System.out.println("FinalPrice(\"isaac asimov\", \"foundation and empire\"):"
				+ store.getFinalPrice("isaac asimov", "foundation and empire"));
		System.out.println("FinalPrice(\"Ray Bradbury\", \"Fahrenheit 451\"):"
				+ store.getFinalPrice("Ray Bradbury", "Fahrenheit 451"));
		System.out.println("FinalPrice(\"Isaac Asimov\", \"Foundation\"):"
				+ store.getFinalPrice("Isaac Asimov", "Foundation"));
		System.out.println("FinalPrice(\"william gibson\", \"neuromancer\"):"
				+ store.getFinalPrice("william gibson", "neuromancer"));
		System.out.println("FinalPrice(\"Isaac Asimov\", \"Second Foundation\"):"
				+ store.getFinalPrice("Isaac Asimov", "Second Foundation"));
		System.out.println("FinalPrice(\"Isaac Newton\", \"Arithmetica Universalis\"):"
				+ store.getFinalPrice("Isaac Newton", "Arithmetica Universalis"));


	}
}
