import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Value A: ");
		double a = sc.nextDouble();
		System.out.print("Value B: ");
		double b = sc.nextDouble();

		double c = a + b;
		double d = a - b;
		double e = a % b;
		double f = a / b;
		System.out.println("Сума: " + c);
		System.out.println("Разлика: " + d);
		System.out.println("Деление с остатък: " + e);
		System.out.println("Целочислено деление: " + f);
		sc.close();
	}

}
