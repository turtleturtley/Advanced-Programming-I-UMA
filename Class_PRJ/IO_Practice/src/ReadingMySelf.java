import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingMySelf {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("./src/ReadingMySelf.java")); //지금 이 파일 경로 이름 쓰
		while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			
		}
	}

}
