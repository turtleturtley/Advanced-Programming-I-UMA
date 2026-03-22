package jugs;

public class Jug {
	private int capacity; // Maximum capacity of the jug
	private int content;  // Current amount of water in the jug

	public Jug(int capacity) {
		if (capacity <= 0) {
            throw new RuntimeException("Capacity must be positive");
        }  
        this.capacity = capacity; 
        this.content = 0;
	}

    public int capacity() {
        return this.capacity;
    }

    public int content() {
        return this.content;
    }
    
    public void fill() {
        this.content = this.capacity;
    }

    public void empty() {
        this.content = 0;
    }

    public void pourFrom(Jug j) {
    	if (this == j) {
            throw new RuntimeException("Same object!"); 
        }
    	
    	int availableSpace = this.capacity - this.content;
    	int amountToPour = Math.min(j.content, availableSpace);

    	this.content += amountToPour;
    	j.content -= amountToPour;
    }
    
    @Override
    public String toString() {
        return "Jug(capacity=" + this.capacity + ", content=" + this.content + ")";
    }
}