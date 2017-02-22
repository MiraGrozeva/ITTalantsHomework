import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3-digit number");
		int numb = sc.nextInt(); // numb=abc

		if (numb >= 100 && numb <= 999) {

			int a = numb / 100;
			int b = (numb / 10) % 10;
			int c = numb % 10;

			if (a == b && b == c) {
				System.out.println("Digits are equal");
			} else if (a > b && b > c) {
				System.out.println("Diguts are ascending order");
			} else if (a < b && b < c) {
				System.out.println("Digits are descending order");
			} else {
				System.out.println("Digits are not ordering in these cases.");
			}

		}
		sc.close();

	}

}
