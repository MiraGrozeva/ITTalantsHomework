import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String firstW;
		String secondW;
		do{
			System.out.println("Enter first word:");
			firstW = sc.next();
			System.out.println("Enter second word:");
			secondW = sc.next();
		}while(firstW.length()>40 || secondW.length()>40 );
	
		System.out.println(firstW.toUpperCase()+" " + firstW.toLowerCase());
		System.out.println(secondW.toUpperCase()+" "+secondW.toLowerCase());
		sc.close();
	}

}
