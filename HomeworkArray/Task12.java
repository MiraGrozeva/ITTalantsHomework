import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Please enter element arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		// temp
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		// +
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		// *
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		sc.close();
	}

}
