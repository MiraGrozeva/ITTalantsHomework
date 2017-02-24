import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the array: ");
		int l = sc.nextInt();
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		boolean zigZag = true;
		for (int i = 1; i < arr.length - 1; i += 2) {
			if (!(arr[i] > arr[i - 1] && arr[i] > arr[i + 1])) {
				zigZag = false;
				break;
			}
		}
		if (zigZag) {
			System.out.println("Otgovoarq");
		} else {
			System.out.println("NE");
		}

		sc.close();
	}

}
