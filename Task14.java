import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first coordinats on first field: ");
		int x1 = sc.nextInt();
		System.out.print("Enter second coordinats on first field: ");
		int y1 = sc.nextInt();
		System.out.print("Enter first coordinats on second field: ");
		int x2 = sc.nextInt();
		System.out.print("Enter second coordinats on second field: ");
		int y2 = sc.nextInt();

		int sum1 = x1 + y1;
		int sum2 = x2 + y2;

		if (sum1 % 2 == 0 && sum2 % 2 != 0 || sum1 % 2 != 0 && sum2 % 2 == 0) {
			System.out.println("The positions are not in the same color.");

		} else {
			System.out.println("The positions are in the same color.");
		}

		sc.close();

	}

}
