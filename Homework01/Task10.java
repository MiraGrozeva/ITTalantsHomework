import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the volume:");
		int number = sc.nextInt();

		if (number >= 10 && number <= 9999) {

			int x = number % 5;
			System.out.println("x = " + x);
			int fiveLitres = number / 5;
			if (x == 0) {
				System.out.println(fiveLitres + " 2l buckets and " + fiveLitres + " 3l buckets");
			} else if (x == 4) {
				System.out.println(fiveLitres + " 2l buckets and " + fiveLitres + " 3l buckets");
				System.out.println(" + 2 2l buckets");
			} else if (x == 3) {
				System.out.println(fiveLitres + " 2l buckets and " + fiveLitres + " 3l buckets");
				System.out.println(" + 1 3l bucket");
			} else if (x == 2) {
				System.out.println(fiveLitres + " 2l buckets and " + fiveLitres + " 3l buckets");
				System.out.println(" + 1 2l bucket");
			} else if (x == 1) {
				int y = number % 2;
				System.out.println("y = " + y);
				int Litres = (number - 6) / 5;
				if (y == 1 || y == 0) {
					System.out.println(Litres + " 2l buckets and " + Litres + " 3l buckets");
					System.out.println(" + 3 3l buckets or 3 2l buckets");
				}
			}
		} else {
			System.out.println("The number is not in the interval");

		}
		sc.close();
	}

}
