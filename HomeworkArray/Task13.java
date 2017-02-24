import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int count = 0;
		int temp = n;
		while (temp > 0) {
			temp /= 2;
			count++;
		}
		// System.out.println(count);
		int[] arr = new int[count];
		do {
			arr[arr.length - 1 - (count - 1)] = n % 2;
			n /= 2;
			count--;
		} while (n > 0);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		sc.close();
	}

}
