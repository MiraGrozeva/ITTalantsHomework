import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the arrays: ");
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr [" + i + "]=");
			arr1[i] = sc.nextInt();
		}
		if (m % 2 != 0) {
			m--;
			System.out.println("m= " + m);
		}
		int[] arr2 = new int[m];
		for (int i = 0; i < arr1.length / 2; i++) {
			arr2[i] = arr1[i];
		}
		for (int j = arr1.length / 2 - 1; j >= 0; j--) {
			arr2[arr2.length - 1 - j] = arr1[j];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		sc.close();
	}

}
