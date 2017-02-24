import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array1: ");
		int l1 = sc.nextInt();
		int[] arr1 = new int[l1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Please enter element arr[" + i + "]=");
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter length of the array2: ");
		int l2 = sc.nextInt();
		int[] arr2 = new int[l2];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("Please enter element arr[" + i + "]=");
			arr2[i] = sc.nextInt();
		}
		int l3 = 0;
		if (l1 < l2) {
			l3 = l1;
		} else {
			l3 = l2;
		}
		int[] arr3 = new int[l3];
		for (int i = 0; i < arr3.length; i++) {
			if (arr1[i] <= arr2[i]) {
				arr3[i] = arr2[i];
			} else {
				arr3[i] = arr1[i];
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			if (i == arr3.length - 1) {
				System.out.print(arr3[i]);
			} else {
				System.out.print(arr3[i] + ", ");
			}
		}
		sc.close();
	}

}
