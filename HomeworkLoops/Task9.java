import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {

			if (i % 3 != 0) {
				int stepen = i * i;
				sum += stepen;
				if (sum <= 200) {
					System.out.print(stepen + ", ");
				} else {
					System.out.println("The first number is indefine in the interval!");// a=200;
					break;
				}
			} else {
				System.out.print("Skip" + i + ", ");

			}

		}
		sc.close();
	}
}
