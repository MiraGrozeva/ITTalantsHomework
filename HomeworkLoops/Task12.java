
public class Task12 {

	public static void main(String[] args) {

		for (int i = 102; i <= 987; i++) {

			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;
			if (a != b && b != c) {
				System.out.print(i + ", ");
			}

		}

	}

}
