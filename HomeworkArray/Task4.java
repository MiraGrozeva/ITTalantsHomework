import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the arrays: ");
		int m = sc.nextInt();

		int[] arr1 = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr [" + i + "]=");
			arr1[i] = sc.nextInt();
		}
		boolean symetric = true;
		for (int i = 0; i < arr1.length / 2; i++) {
			if (arr1[i] != arr1[m - i - 1]) {
				symetric = false;
			}
		}
		if (symetric) {
			System.out.println("The arrays is reflex");
		} else {
			System.out.println("The array is not reflex");
		}
		sc.close();
		// int[] arr2= new int[arr1.length];
		// for(int j = arr1.length-1;j>=0;j--){
		// arr2[j]=arr1[j];
		//// System.out.print(arr2[j] + " ");
		// }
		//
		// for (int i=0;i<arr1.length;i++){
		// if (arr1[i]==arr2[i]){
		// System.out.println("Arrays are equal");
		// break;
		// }else{
		// System.out.println("Arrays are not equal");
		// }
		// }
	}

}
