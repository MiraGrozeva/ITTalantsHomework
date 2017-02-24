import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("NUMBER:");
		int n = sc.nextInt();

		int sum = 0;
		if (n >= 1 && n <= 27) {
			for (int i = 100; i <= 999; i++) {

				int a = i / 100;
				int b = (i / 10) % 10;
				int c = i % 10;
				sum = a + b + c;
				if (sum == n) {
					System.out.print(i + ", ");

				}
			}
		} else {
			System.out.println("The number is not found!");
		}
		sc.close();
	}

}
