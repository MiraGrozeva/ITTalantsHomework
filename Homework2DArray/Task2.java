import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length:");
		int n=sc.nextInt();
		while(n<2){
			System.out.println("Please enter a number bigger then 1 and positive:");
			n=sc.nextInt();
		}
		int[][] arr2= new int [n][n];
		for (int rows = 0; rows < arr2.length; rows++) {
			for (int cols = 0; cols < arr2[rows].length; cols++) {
				System.out.print("Enter element [" + rows + "]["+cols+"]=");
				arr2[rows][cols]=sc.nextInt();
			}
		}
		for (int rows = 0; rows < arr2.length; rows++) {
			for (int cols = 0; cols < arr2[rows].length; cols++) {
				if(rows==cols){
					System.out.print(arr2[rows][cols] + " ");
				}
			}
		}
		System.out.println();
		for (int rows = 0; rows < arr2.length; rows++) {
			for (int cols = 0; cols < arr2[rows].length; cols++) {
				if(rows+cols==arr2.length-1){
					System.out.print( arr2[rows][cols] + " ");
				}
			}
		}
		sc.close();
	}

}
