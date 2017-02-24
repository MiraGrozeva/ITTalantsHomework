import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length ot the array");
		int l = sc.nextInt();

		int[] arr = new int[l];
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Please enter element arr[" + i + "]=");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double average = sum / l;
		System.out.println("The average of the element in the array is: " + average);

		double[] arrNew = new double[arr.length];

		for (int i = 0; i < arrNew.length; i++) {
			double razl = arr[i] - average;
			double absValue = (razl < 0) ? 0 - razl : razl;
			arrNew[i] = absValue;
		}
		double min = arrNew[0];
		int arrNewIndex = 0;
		for (int i = 1; i < arrNew.length; i++) {
			if (min > arrNew[i]) {
				min = arrNew[i];
				arrNewIndex = i;
			}
		}
		System.out.println("The element close to average is: " + arr[arrNewIndex]);
		sc.close();
	}

}
