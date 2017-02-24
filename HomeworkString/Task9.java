import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");//asd-12sdf45-56asdf100
		String text = sc.next() ;
		int sum = 0;
		int j = 0;
		int index=0;
		for (int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) >= '0' && text.charAt(i) <= '9'||text.charAt(i)==45)) {
				if(text.charAt(i)==45){
					index=1;
				}
				j=i+1;
				if (j > text.length()-1) {
					break;
				}
				while ((text.charAt(j) >= '0' && text.charAt(j) <= '9')) {
					j++;
					if (j > text.length()-1) {
						break;
					}
				}
				System.out.println(text.substring(i, j));
				if(index==0){
					sum +=Integer.parseInt(text.substring(i, j));
					i=j-1;
				}else{
					sum +=Integer.parseInt(text.substring(i, j));
					i=j-1;
				}
			}
		}
		System.out.println("Sum is:" + sum);
		sc.close();
	}
}
