import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();
		
		int fact=1;
		do{
			fact*=n;
			n--;
			
		} while(n>=1);
			System.out.println("Factoriel:" + fact);
			sc.close();
	}

}
