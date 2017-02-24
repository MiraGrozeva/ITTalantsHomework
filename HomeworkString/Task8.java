import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter word:");
		String word = sc.next();
		
		boolean palindrom = true;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)){
				palindrom=false;
			}
		}
		System.out.println(palindrom?"Yes":"No");
		sc.close();
	}

}
