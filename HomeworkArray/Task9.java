import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the array1: ");
		int l = sc.nextInt();
		int[] arr = new int[l];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
			// System.out.println("arr[" + i + "]=" + arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		sc.close();
	}

}
