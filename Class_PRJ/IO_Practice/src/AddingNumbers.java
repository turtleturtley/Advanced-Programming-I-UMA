import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddingNumbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (new File("./src/Numbers.txt"))){
			
			int sum = 0;
			while(sc.hasNext()) {
				int newInt = Integer.parseInt(sc.next());
				sum += newInt;
			}
			
		/*while(sc.hasNextLine())을 썼을 때에 대한 것도 설명해주셨음
			{
				string line = sc.nextLine();
				String [] numbers = line.split("[ ]+")
				for (String newInt : numbers)
				...
			}
		*/
			sc.close(); //외부파일 반
			System.out.println("sum :" + sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

// try{} : 에러가 발생할 수 있는 코드, catch{} : 에러가 발생할 때 실핼할 코드 
