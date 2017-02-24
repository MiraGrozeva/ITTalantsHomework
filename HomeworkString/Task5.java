import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first characters:");
		char[] array = sc.next().toCharArray();
		System.out.println("Enter second characters:");
		char[] array2 = sc.next().toCharArray();
		int count = 0;
		int indexOne = 0;
		int indexTwo = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array2[j] == array[i]) {
					indexOne = i;
					indexTwo = j;
					count++;
					break;
				}
			}
			if (count > 0) {
				break;
			}
		}
		if (count == 0) {
			System.out.println("This is the words without crossing");
		} else {

			for (int i = 0; i < indexOne; i++) {

				for (int j = 0; j < indexTwo; j++) {
					System.out.print(" ");
				}
				System.out.println(array[i]);
			}
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i]);
			}
			System.out.println();
			for (int i = indexOne + 1; i < array.length; i++) {

				for (int j = 0; j < indexTwo; j++) {
					System.out.print(" ");
				}
				System.out.println(array[i]);
			}
		}
		sc.close();
	}
}
