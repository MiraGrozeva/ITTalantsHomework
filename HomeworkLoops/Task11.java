import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();
		int space = n - 1;
		int star = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= star; z++) {
				System.out.print("*");

			}

			System.out.println();
			space--;
			star += 2;
		}
		sc.close();
	}

}
