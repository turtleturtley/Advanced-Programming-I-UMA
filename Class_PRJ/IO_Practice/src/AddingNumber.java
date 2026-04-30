/*텍스트 파일(./src/Numbers.txt) 안에 공백으로 구분된 숫자들을 하나씩 읽어서,
그 숫자들의 총합(sum)을 구한 뒤 화면에 출력하라*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddingNumber {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("./src/Numbers.txt"));
		
		int sum = 0;
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] numbers = line.split(" ");
			
			for(int i = 0; i < numbers.length; i++) {
				sum += Integer.parseInt(numbers[i]);
			}
		}
		
		System.out.println("sum : " + sum);
		
		sc.close();
	}
}
