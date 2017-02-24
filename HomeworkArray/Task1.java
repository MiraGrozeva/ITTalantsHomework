import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr [" + i + "]=");
			arr[i] = sc.nextInt();
			if (arr[i] % 3 == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Nqma element kraten na 3");
		} else {
			int[] arrNew = new int[count];
			int index = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 3 == 0) {
					arrNew[index] = arr[i];
					index++;
				}
			}
			int min = arrNew[0];
			for (int i = 1; i < arrNew.length; i++) {
				if (min > arrNew[i]) {
					min = arrNew[i];
				}
			}
			System.out.println("Nai-malkoto chislo kratno na 3 v masiva e: " + min);
		}
		sc.close();
	}

}
