import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4-digit number: ");
		int number = sc.nextInt();

		if (number >= 1000 && number <= 9999) {

			int a = number / 1000;
			int b = (number / 100) % 10;
			int c = (number / 10) % 10;
			int d = number % 10;

			int newNum1 = a * 10 + d;
			int newNum2 = b * 10 + c;

			if (newNum1 > newNum2) {
				System.out.println("Larger: " + newNum1 + " > " + newNum2);

			} else if (newNum1 == newNum2) {
				System.out.println("Equal: " + newNum1 + " = " + newNum2);

			} else {
				System.out.println("Less: " + newNum1 + "<" + newNum2);
			}
		} else {
			System.out.println("The number is not 4-digit");
		}

	}

}
