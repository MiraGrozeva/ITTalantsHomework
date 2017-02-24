import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number from 10 to 99:");
		int n = sc.nextInt();

		int prNum = n - 1;

		if (n >= 10 && n <= 99) {
			if (prNum % 2 != 0) {
				for (int i = n; i >= 1; i--) {
					System.out.print((3 * i + 1) + " ");
				}
			} else {
				for (int j = n; j >= 1; j--)
					System.out.print(0.5 * j + " ");

			}
		} else {
			System.out.println("The number is not in the interval");
		}
		sc.close();
	}

}
