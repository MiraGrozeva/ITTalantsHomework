import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		String firW, secW;
		do{
			System.out.println("Enter first word: ");
			firW=sc.nextLine();
			System.out.println("Enter second word: ");
			secW=sc.nextLine();
		}while(firW.contains(" ")||secW.contains(" "));
		if(firW.length()==secW.length()){
			System.out.println("Length of the word is equal");
		}else{
			System.out.println(firW.length()<secW.length()?"Second word is bigger":"First word is bigger");
		}
		for (int i = 0; i < (firW.length()<secW.length()?firW.length():secW.length()); i++) {
			if(firW.charAt(i)!=secW.charAt(i)){
				System.out.println(i+ " " + firW.charAt(i) + "-"+secW.charAt(i));
			}
		}
		sc.close();
	}

}
