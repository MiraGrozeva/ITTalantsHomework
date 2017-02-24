import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the array: ");
		int n = sc.nextInt();
		int nextEl = 1;
		int pred = 1;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				nextEl++;
			} else {
				if (pred < nextEl) {
					pred = nextEl;
				}
				nextEl = 1;
			}
		}
		System.out.println("Nai-dylgata poredica: " + pred);
		sc.close();
	}

}
