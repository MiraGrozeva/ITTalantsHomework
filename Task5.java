import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number1=a: ");
		int a = sc.nextInt();
		System.out.println("Enter Number2=b: ");
		int b = sc.nextInt();
		System.out.println("Enter Number3=c: ");
		int c = sc.nextInt();
		if ((a > b) && (a > c)) {
			System.out.println(a);
			if (b > c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else if (b > c && b > a) {
			System.out.print(b);
			if (c > a) {
				System.out.println(c);
				System.out.println(a);

			} else {
				System.out.println(a);
				System.out.println(c);
			}

		} else if (c > b && c > a) {
			System.out.print(c);
			if (b > a) {
				System.out.println(b);
				System.out.println(a);
			} else {
				System.out.println(a);
				System.out.println(b);
			}
		}

	}

}
