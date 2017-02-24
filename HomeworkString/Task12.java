import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		printArray(n);
		sc.close();
	}
	static void printArray(int num){
		
		int[]arr = new int[num];
		int n =1;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=n;
			n++;
			System.out.print(arr[i] + " ");
		}
		
	}

}
