import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		factoriel(n);
		sc.close();
	}
	static int factoriel(int num){
		int fact=1;
		do{
			fact*=num;
			num--;
			
		} while(num>=1);
		System.out.println(fact);
		return fact;
		
	}
}
