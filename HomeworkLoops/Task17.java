import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Length square: ");
		int l = sc.nextInt();
		System.out.print("Symbol: ");
		char s = sc.next().charAt(0);

		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= l; j++) {
				if (j == 1 || j == l || i == 1 || i == l) {
					System.out.print("*");
				} else {
					System.out.print(s);
				}

			}
			System.out.println();
		}
		sc.close();

	}
}
