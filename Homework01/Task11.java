import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3-digit number: ");
		int numb = sc.nextInt();

		if (numb < 100 || numb > 999) {
			System.out.println(" The number is not 3-digit");

		} else {
			int a = numb / 100;
			int b = (numb / 10) % 10;
			int c = numb % 10;
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
			if (a == 0 || b == 0 || c == 0) {
				System.out.println("The number has zero values");

			} else if (numb % a == 0 && numb % b == 0 && numb % c == 0) {
				System.out.println("The number is divided for each of its digits");

			} else {
				System.out.println("The number don't divide for each of its digits");
			}
		}
	}

}
