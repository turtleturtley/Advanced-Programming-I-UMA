/**
 * Objective: Read space-separated numbers from a text file (./src/Numbers.txt),
 * calculate their total sum, and display the result on the screen.
 */

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

/* * [Method 1] Calculate the sum using Scanner
 */
//public class AddingNumbers {
//	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(new File("./src/Numbers.txt"));
//		
//		int sum = 0;
//		
//		while (sc.hasNextLine()) {
//			String line = sc.nextLine();
//			String[] numbers = line.split(" ");
//			
//			for(int i = 0; i < numbers.length; i++) {
//				sum += Integer.parseInt(numbers[i]);
//			}
//		}
//		
//		System.out.println("sum : " + sum);
//		
//		sc.close();
//	}
//}

/* * [Method 2] Calculate the sum using BufferedReader
 */
public class AddingNumbers {
	public static void main(String[] args) {
		
		int sum = 0;
		
		try (BufferedReader br = Files.newBufferedReader(Path.of("./src/Numbers.txt"))) {
			String line = br.readLine();
		
			while(line!= null) {
				String[] numbers = line.split("[ ]+");
			
				for(int i = 0; i < numbers.length; i++) {
					sum += Integer.parseInt(numbers[i]);
				}
				line = br.readLine();
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR: the file name must be given");
		}
		catch (IOException e) {
			System.out.println("ERROR: the file cannot be read");
		}
		System.out.println("sum : " + sum);
	


/* *[Method 3] Save the result using PrintWriter
 */
		try (PrintWriter pw = new PrintWriter(new File("Result.txt"))) {
	        pw.println("sum : " + sum);
	    } catch (IOException e) {
	        System.out.println("ERROR: Could not save the file.");
	    }
	}
}





