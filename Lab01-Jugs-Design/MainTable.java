package jugs;

public class MainTable {
	public static void main(String[] args) {
		
		Jug j7 = new Jug(7); 
		Jug j5 = new Jug(5); 
		
		Table table = new Table(j7, j5);
		
		table.fill(Position.RIGHT);
		System.out.println(table);
		
		table.pourFrom(Position.LEFT);
		System.out.println(table);
		
		table.fill(Position.RIGHT);
		System.out.println(table);
		
		table.pourFrom(Position.LEFT);
		System.out.println(table);
		
		table.empty(Position.LEFT);
		System.out.println(table);
		
		table.pourFrom(Position.LEFT);
		System.out.println(table);
		
		table.fill(Position.RIGHT);
		System.out.println(table);
		
		table.pourFrom(Position.LEFT);
		System.out.println(table);
		
	}
}
