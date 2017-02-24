import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text;
		do{
			System.out.println("Enter words with space between them: ");
			text = sc.nextLine();
		}while(!(text.contains(" ")));

		int wordCount = 1;
		int longWord = 0;
		int countWordL = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				wordCount++;
			}
		}
		String[] words=text.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				countWordL++;
			}
			if (longWord < countWordL) {
				longWord = countWordL;
			}
			countWordL = 0;
		
		}
		System.out.println(wordCount + " words.The long word have: " +longWord + " letters");
		sc.close();
	}

}
