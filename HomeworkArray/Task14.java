import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int l = sc.nextInt();

		double[] arr = new double[l];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element arr[" + i + "]=");
			arr[i] = sc.nextDouble();
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				count++;
			}
		}
		double[] arr2 = new double[count];
		int arr2Index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				arr2[arr2Index] = arr[i];
				System.out.println("arr2[" + arr2Index + "]=" + arr2[arr2Index]);
				arr2Index++;
			}
		}
		sc.close();
	}

}
