import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the array1: ");
		int l = sc.nextInt();

		int[] arr1 = new int[l];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr1[i] = sc.nextInt();
		}

		int[] arr2 = new int[l];
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0 || i == l - 1) {
				arr2[i] = arr1[i];
			}
			if (i >= 1 && i < arr1.length - 1) {
				arr2[i] = arr1[i - 1] + arr1[i + 1];
			}
			System.out.println("arr2[" + i + "]= " + arr2[i]);
		}
		sc.close();
	}

}
