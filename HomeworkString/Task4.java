import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String twoNames;
		String firstName = "";
		String secName="";
		do{
			System.out.println("Enter two names with ',' between them:");
			twoNames = sc.nextLine();
		}while(!(twoNames.contains(",")));
		
		
		for (int i = 0; i < twoNames.length(); i++) {
			if(twoNames.charAt(i)==','){
				firstName =twoNames.substring(0, i);
				secName = twoNames.substring(i+1);
			}
		}
		int sumFirst= 0;
		int sumSec = 0;
		for (int i = 0; i < firstName.length(); i++) {
			sumFirst +=firstName.charAt(i);
		}
		for (int i = 0; i < firstName.length(); i++) {
			sumFirst +=firstName.charAt(i);
		}
		if(sumFirst>sumSec){
			System.out.println(firstName);
		}else{
			System.out.println(secName);
		}
//		System.out.println(sumFirst);
//		System.out.println(firstName);
//		System.out.println(secName);
		sc.close();
	}

}
