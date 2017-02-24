import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String sentance;
		do{
			System.out.println("Enter sentance: ");
			sentance=sc.nextLine();
		}while(!sentance.contains(" "));
		
		for (int i = 0; i < sentance.length(); i++) {
			if(i==0 ||sentance.charAt(i-1)==' '){
				System.out.print(sentance.toUpperCase().charAt(i));
				continue;
			}
			if(sentance.charAt(i)==' '){
				System.out.print(" ");
				continue;
			}
			if((int) sentance.charAt(i)>=97){
				System.out.print(sentance.charAt(i));
				continue;
			}
			if((int) sentance.charAt(i)<=90){
				System.out.print(sentance.toLowerCase().charAt(i));
			}
		}
		sc.close();
	}

}
