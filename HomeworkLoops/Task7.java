import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		for (int i = 3; i <= n; i += 3) {
			System.out.print(i + ", ");
		}

		sc.close();

	}

}
