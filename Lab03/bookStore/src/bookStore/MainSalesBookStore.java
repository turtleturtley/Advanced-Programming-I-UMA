package bookStore;

public class MainSalesBookStore {

	public static void main(String[] args) {
		
		String[] saleAuthors = {"George Orwell", "Isaac Asimov"};
		
		SalesBookStore myStore = new SalesBookStore(20.0, saleAuthors);
		
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
        
        System.out.println(myStore);
        System.out.println();
        
        myStore.deleteBook("george orwell", "1984");
        myStore.deleteBook("Aldous Huxley", "A Brave New World");
        myStore.deleteBook("Isaac Newton", "Arithmetica Universalis");
        
        System.out.println(myStore);
        System.out.println();
        
        System.out.println("FinalPrice(\"Philip K. Dick\", \"Do Androids Dream of Electric Sheep?\"): " 
                + myStore.getFinalPrice("Philip K. Dick", "Do Androids Dream of Electric Sheep?"));

        System.out.println("FinalPrice(\"isaac asimov\", \"foundation and empire\"): " 
                + myStore.getFinalPrice("isaac asimov", "foundation and empire"));

        System.out.println("FinalPrice(\"Ray Bradbury\", \"Fahrenheit 451\"): " 
                + myStore.getFinalPrice("Ray Bradbury", "Fahrenheit 451"));

        System.out.println("FinalPrice(\"Isaac Asimov\", \"Foundation\"): " 
                + myStore.getFinalPrice("Isaac Asimov", "Foundation"));

        System.out.println("FinalPrice(\"william gibson\", \"neuromancer\"): " 
                + myStore.getFinalPrice("william gibson", "neuromancer"));

        System.out.println("FinalPrice(\"Isaac Asimov\", \"Second Foundation\"): " 
                + myStore.getFinalPrice("Isaac Asimov", "Second Foundation"));

        System.out.println("FinalPrice(\"Isaac Newton\", \"Arithmetica Universalis\"): " 
                + myStore.getFinalPrice("Isaac Newton", "Arithmetica Universalis"));
	}

}
