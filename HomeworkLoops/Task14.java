import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();

		if (n >= 10 && n <= 200) {
			for (int i = n; i >= 10; i--) {
				if (i % 7 == 0) {
					System.out.print(i + ", ");
				} else {
					continue;
				}

			}
		} else {
			System.out.println("The number is not in the interval!");
		}

		sc.close();
	}
}
