import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int ost;
		int sum = 0;
		int temp;
		temp = n;
		if (n >= 10 && n <= 30000) {
			while (n > 0) {
				ost = n % 10;
				sum = sum * 10 + ost;
				n = n / 10;
			}

			if (temp == sum) {
				System.out.println("Palindrom");
			} else {
				System.out.println("It's not palindrom");
			}
		} else {
			System.out.println("Invalid number");
		}
		sc.close();
	}
}
