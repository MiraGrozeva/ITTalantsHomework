import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element arr[" + i + "]=");
			arr[i] = sc.nextDouble();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		int index = 1;
		double m = 41.25;
		double[] arr2 = new double[10];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < -0.231) {
				arr2[i] = m + index * index;
			} else {
				arr2[i] = arr[i] * index;
			}
			index++;
			if (i == arr.length - 1) {
				System.out.print(arr2[i]);
			} else {
				System.out.print(arr2[i] + ", ");
			}
		}
		sc.close();
	}

}
