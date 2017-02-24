import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int numb1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int numb2 = sc.nextInt();

		// while (numb1 < numb2) {
		// System.out.print(numb1 + " ");
		// numb1++;
		// }
		// while (numb1 > numb2) {
		// System.out.print(numb2 + " ");
		// numb2++;

		// }

		for (int i = ((numb1 < numb2) ? numb1 : numb2); i <= ((numb1 < numb2) ? numb2 : numb1); i++) {
			System.out.println(i);
		}

		// System.out.print(numb2);
		sc.close();
	}

}
