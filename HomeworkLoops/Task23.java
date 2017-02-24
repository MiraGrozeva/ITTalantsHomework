
public class Task23 {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;

		while (a <= 9) {
			while (b <= 9) {
				System.out.print(a + "*" + b + " = " + a * b + " , ");
				b += 1;
			}
			System.out.println();
			b = a + 1;
			a++;
		}

	}

}
