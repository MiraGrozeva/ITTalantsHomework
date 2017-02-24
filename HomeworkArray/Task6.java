import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		System.out.print("Enter length of the array1: ");
		int l1 = sc.nextInt();
		int[]arr1= new int [l1];
		for (int i =0;i<arr1.length;i++){
			System.out.print("arr [" + i + "]=");
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter length of the array2: ");
		int l2 = sc.nextInt();
		int[] arr2 = new int[l2];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("arr [" + i + "]=");
			arr2[i]=sc.nextInt();
		}
		
		if(arr1.length!=arr2.length){
			System.out.println("Arrays are not equal!");
		}else {
			int i;
			for (i = 0; i < arr1.length; i++) {
				if (arr1[i]!=arr2[i]) {
					System.out.println("Arrays are not equal");
					break;
				}
			}
			if (i==arr1.length){
				System.out.println("Arrays are equal!");
			}
		}
		sc.close();
	}

}
