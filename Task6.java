import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number1: ");
		int numb1 = sc.nextInt();
		System.out.println("Number2: ");
		int numb2 = sc.nextInt();
		System.out.println("Number3: ");
		int numb3 = sc.nextInt();
		int c = numb1;
		numb1 = numb2;
		int d = numb2;
		numb2 = numb3;
		numb3 = c;
		System.out.println(numb1 + "\t" + numb2 + "\t" + numb3);

	}
}
