import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the arrays: ");
		int m = sc.nextInt();
		int[] array = new int[m];

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 3;
			System.out.println(array[i]);
		}
		sc.close();
	}

}
