import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int n = sc.nextInt();

		boolean nisPrime = true;

		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				nisPrime = false;
				break;
			}
		}
		if (nisPrime) {
			System.out.println("Number is prime");
		} else {
			System.out.println("The number is not prime");
		}

		sc.close();

	}

}
