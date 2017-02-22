import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first 2-digit number:");
		int number1 = sc.nextInt();
		System.out.println("Enter second 2-digit number:");
		int number2 = sc.nextInt();

		if (number1 >= 10 && number1 <= 99) {
			if (number2 >= 10 && number2 <= 99) {
				int c = number1 * number2;
				int d = c % 10;
				if (d % 2 == 0) {
					System.out.println(d + " is even");
				} else {
					System.out.println(d + " is odd");
				}
			} else {
				System.out.println("The second number is not 2-digits");
			}
		} else {
			System.out.println("The first number is not 2-digits ");

		}
		sc.close();

	}

}
