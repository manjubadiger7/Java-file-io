package TextFileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\M1064478\\Desktop\\FileHandling\\NewFile.txt");

		try {
			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNext()) {
				String data = fileReader.nextLine();
				System.out.println(data);
				break;
			}
			fileReader.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
