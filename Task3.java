import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number x: ");
		int x = sc.nextInt();
		System.out.println("Enter number y: ");
		int y = sc.nextInt();
		int c = x;
		x = y;
		y = c;
		System.out.println("x = " + x + " y = " + y);
		sc.close();
	}
}