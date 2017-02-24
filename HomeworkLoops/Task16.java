import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N:");
		int n = sc.nextInt();
		System.out.print("Enter M:");
		int m = sc.nextInt();

		int min = n;
		int max = m;
		if (n > m) {
			min = m;
			max = n;
		}

		if (min >= 10 && max <= 5555) {
			for (int i = max; i >= min; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ",");
				}
			}
		} else {
			System.out.println("Invalide values");
		}

		sc.close();
		

	}

}
