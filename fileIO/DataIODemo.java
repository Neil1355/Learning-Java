package learning.fileio;

import java.io.*;

public class DataIODemo {
	public static void main(String[] args) {
	try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("test.txt"))) {
			dout.writeChars("Hello");
			dout.writeInt(1000);
			dout.writeBoolean(true);
			

		} catch (IOException e) {
			System.out.println("I/O Error: " + e);

		}

	try (DataInputStream din = new DataInputStream(new FileInputStream("test.txt"))) {
			short s = din.readShort();
			int i = din.readInt();
			boolean b = din.readBoolean();

			System.out.println("Here are the values: " + b + " " + i + " " + s);

		} catch (FileNotFoundException e) {
			System.out.println(" cannot open input file");
			

		} catch (IOException e) {
			System.out.println("error on IO: " + e);
		}
	}
}