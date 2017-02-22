import java.util.Scanner;

public class Task13Temperature {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature: ");
		int temp = sc.nextInt();

		if (temp >= -100 && temp <= 100) {
			if (temp < -20) {
				System.out.println("Ledeno studeno");
			} else if (temp <= 0) {
				System.out.println("Studeno");
			} else if (temp <= 15) {
				System.out.println("Hladno");
			} else if (temp <= 25) {
				System.out.println("Toplo");
			} else {
				System.out.println("Goreshto");
			}
		} else {
			System.out.println("Invalided temperature!!!");
		}
		sc.close();

	}

}
