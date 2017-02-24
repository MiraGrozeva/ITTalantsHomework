import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum = 0;

		do {
			sum += n;
			n--;
		} while (n >= 1);
		System.out.println("Sum:" + sum);

		sc.close();
	}

}
