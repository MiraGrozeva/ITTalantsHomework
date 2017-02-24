import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstW;
		String secondW;
		do{
			System.out.println("Enter first word:");
			firstW = sc.next();
			
		}while(firstW.length()>10 || firstW.length()<5 );
		do{
			
			System.out.println("Enter second word:");
			secondW = sc.next();
		}while(secondW.length()>10 || secondW.length()<5 );
		
		StringBuilder helpWord=new StringBuilder();
		
		if(firstW.length()>secondW.length()){
		
			helpWord=new StringBuilder(secondW.substring(0, 5));
			helpWord.append(firstW.substring(5));
			System.out.println(firstW.length() + " " + helpWord);
		}else{
			
			helpWord=new StringBuilder(firstW.substring(0, 5));
			helpWord.append(secondW.substring(5));
			System.out.println(secondW.length() + " " + helpWord);
		}
		sc.close();
	}

}
