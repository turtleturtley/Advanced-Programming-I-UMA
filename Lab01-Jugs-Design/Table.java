package jugs;

public class Table {
	private Jug jugLeft;
    private Jug jugRight;
    
    public Table(Jug j1, Jug j2) {
        if (j1 == j2) {
            throw new RuntimeException("The two jugs cannot be the same object!");
        }
        
        this.jugLeft = j1;
        this.jugRight = j2;
    }
    
    public int getCapacity(Position pos) {
        int result; 

        if (pos == Position.LEFT) {
            result = this.jugLeft.capacity();
        } else {
            result = this.jugRight.capacity();
        }

        return result; 
    }
    
    public void fill(Position pos) {
    	if (pos == Position.LEFT) {
            this.jugLeft.fill();
        } else {
            this.jugRight.fill();
        }
    }
    
    public void empty(Position pos) {
    	if (pos == Position.LEFT) {
            this.jugLeft.empty();
        } else {
            this.jugRight.empty();
        }
    }

   public void pourFrom(Position pos) {
    	if (pos == Position.LEFT) {
            this.jugLeft.pourFrom(this.jugRight);
        } else {
            this.jugRight.pourFrom(this.jugLeft);
        }
    }
   
   @Override //T(J(7, 0), J(5, 5))
   public String toString() {
       return "T(J(" + this.jugLeft.capacity() + ", " + this.jugLeft.content() +
       "), J(" + this.jugRight.capacity() + ", " + this.jugRight.content() + "))";
   }
}
