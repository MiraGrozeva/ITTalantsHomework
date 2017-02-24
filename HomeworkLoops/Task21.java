import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number from 1 to 52: ");
		int n = sc.nextInt();
		int cardColor;
		int cardCase;

		for (int i = n; i <= 52; i++) {
			cardColor = i % 4;
			cardCase = (i - 1) / 4 + 1;
			switch (cardCase) {
			case 1:
				System.out.print("2");
				break;
			case 2:
				System.out.print("3");
				break;
			case 3:
				System.out.print("4");
				break;
			case 4:
				System.out.print("5");
				break;
			case 5:
				System.out.print("6");
				break;
			case 6:
				System.out.print("7");
				break;
			case 7:
				System.out.print("8");
				break;
			case 8:
				System.out.print("9");
				break;
			case 9:
				System.out.println("10");
			case 10:
				System.out.print("J");
				break;
			case 11:
				System.out.print("Q");
				break;
			case 12:
				System.out.print("K");
				break;
			case 13:
				System.out.print("A");
				break;
			}
			System.out.print(" ");
			switch (cardColor) {
			case 0:
				System.out.println(" Pika");
				break;
			case 1:
				System.out.println(" Spatia");
				break;
			case 2:
				System.out.println(" Karo");
				break;
			case 3:
				System.out.println(" Kupa");
				break;
			}
		}
		sc.close();

	}

}
