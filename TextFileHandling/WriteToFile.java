package TextFileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("C:\\Users\\M1064478\\Desktop\\FileHandling\\FileOne.txt");

			file.write("Goo morning minds how was the long weekend");
			file.close();

			System.out.println("Successfully writen in a file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
