import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class StringNumber {
	Arrays str[];
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (new File("./src/Numbers.txt"))){
			int sum = 0;
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				try (Scanner scLine = new Scanner(line)) {
					while (scLine.hasNextInt()) {
						sum += scLine.nextInt();
					}
				}
			}
			sc.close();
			System.out.println("sum :" + sum);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}