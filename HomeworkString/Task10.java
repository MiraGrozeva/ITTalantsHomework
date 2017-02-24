import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = sc.next();
		char letters;
		for (int i = 0; i < word.length(); i++) {
			letters = (char)(word.charAt(i)+5);
			System.out.print(letters);
		}
		sc.close();
	}

}
