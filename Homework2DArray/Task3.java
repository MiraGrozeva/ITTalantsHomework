import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number for rows:");
		int rows =sc.nextInt();
		while (rows<1){
			System.out.println("Enter positiv number for rows and bigger then 1:");
			rows=sc.nextInt();
		}
		System.out.println("Enter number for colomns:");
		int cols=sc.nextInt();
		while (cols<1) {
			System.out.println("Enter positiv number for colomns and bigger then 1:");
			rows=sc.nextInt();
		}
		int[][]arr=new int[rows][cols];
		double sum=0;
		for (rows = 0; rows < arr.length; rows++) {
			for (cols = 0; cols < arr[rows].length; cols++) {
				System.out.print("Enter element [" + rows + "]["+cols+"]=");
				arr[rows][cols]=sc.nextInt();
				sum+=arr[rows][cols];
			}
		}
		double avg = sum/(rows*cols);
		System.out.println("Sum of the element in the array:" + sum);
		System.out.println("The average of the elements in the array is:" + avg);
		sc.close();
	}

}
