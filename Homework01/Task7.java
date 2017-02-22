import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do am I healthy:");
		boolean dIh = sc.nextBoolean();
		System.out.println("Hour: ");
		int hour = sc.nextInt();
		System.out.println("Money: ");
		float money = sc.nextFloat();

		if (dIh == true) {
			if (money > 0 && money < 10) {
				System.out.println("I am going to the coffee");
			} else {
				System.out.println("I am going to the cinema");

			}
		} else {
			System.out.println("I don't go out");
			if (money > 0) {
				System.out.println("I buy a pils");
			} else {
				System.out.println("I am staying at home and drink tea");
			}
		}

	}
}
