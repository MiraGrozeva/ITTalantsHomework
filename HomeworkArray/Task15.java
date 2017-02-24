import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int l = sc.nextInt();

		double[] arr = new double[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element arr[" + i + "]=");
			arr[i] = sc.nextDouble();
		}
		double maxNum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum1 < (arr[i] < 0 ? 0 - arr[i] : arr[i])) {
				maxNum1 = arr[i];
			}
		}
		System.out.print(maxNum1);
		double maxNum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum2 < (arr[i] < 0 ? 0 - arr[i] : arr[i]) && arr[i] != maxNum1) {
				maxNum2 = arr[i];
			}
		}
		System.out.print("," + maxNum2);
		double maxNum3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum3 < (arr[i] < 0 ? 0 - arr[i] : arr[i]) && arr[i] != maxNum1 && arr[i] != maxNum2) {
				maxNum3 = arr[i];
			}
		}
		System.out.println("," + maxNum3);
		sc.close();
	}

}
