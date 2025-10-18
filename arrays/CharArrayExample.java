package Array;

public class CharArrayExample {
	public static void main(String[] args) {
		char arr[] = new char[5];
		int i, j;
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		for (i = 0; i < 5; i++) {
			System.out.print(charArray[i]);

		}
		for (i = 4; i >=0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print(" "+ charArray[j]);
			}
			System.out.println("");
		}
	}
}