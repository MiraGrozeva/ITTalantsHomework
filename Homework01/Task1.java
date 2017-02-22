import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A: ");
		double a = sc.nextDouble();

		System.out.println("Enter number B: ");
		double b = sc.nextDouble();
		System.out.println("Enter number C: ");
		double c = sc.nextDouble();

		boolean result = (a < c) && (c < b);
		if (result) {
			System.out.println("Числото " + c + " е между " + a + " и " + b);

		} else {
			System.out.println('\n');

		}
		sc.close();
	}

}
