import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 999:");
		int x = sc.nextInt();

		int count = 0;
		int i = x + 1;
		while (count != 10) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				count++;
				System.out.print(count + ":" + i + " ");
			}
			i++;
		}

		// for (int i = x + 1; i <= 3 * x; i++) {
		// if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
		// count++;
		// System.out.print(count + " : " + i + '\t');
		//
		// }
		// }
		sc.close();

	}

}
