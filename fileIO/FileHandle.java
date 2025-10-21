package learning.fileio;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class FileHandle {
	public static void main(String[] args) throws IOException {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		File f1 = new File("test.txt");

		try (FileOutputStream fos = new FileOutputStream(f1)) {
			while (i == 0) {
				System.out.println("Enter the data: ");
				String s = sc.next();
				byte b[] = s.getBytes();
				fos.write(b);
				System.out.println("continue? press 1 for no.");
				i = sc.nextInt();
			}
		}

		System.out.println("-");
		try (FileInputStream fis = new FileInputStream(f1)) {
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		}

	}
}
