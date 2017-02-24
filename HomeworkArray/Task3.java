import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();

		int[] arr = new int[10];
		for (int i = 0; i <= (arr.length - 1) / 3 - 2; i++) {
			arr[i] = n;
		}

		for (int j = 2; j < arr.length; j++) {
			arr[j] = arr[j - 1] + arr[j - 2];// arr[j]=arr[(arr.length-1)/3-j] +
												// arr[(arr.length-1)/3-(j+1)];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
