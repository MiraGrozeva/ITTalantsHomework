import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int l = sc.nextInt();

		int[] arr = new int[l];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Please enter element arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				count++;
				System.out.print(arr[i] + " -" + count + " число;");
			}
		}
		sc.close();
	}
}
