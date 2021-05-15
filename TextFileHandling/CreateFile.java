package TextFileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\M1064478\\Desktop\\FileHandling\\FileOne.txt");
			if (file.createNewFile()) {
				System.out.println("File is created successfully" + file.getName());
			} else {
				System.out.println("File is already exists");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
