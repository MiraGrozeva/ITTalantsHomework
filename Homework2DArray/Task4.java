
public class Task4 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

//		for (int cols = 0; cols < arr.length; cols++) {
//			for (int rows = arr.length - 1; rows >= 0; rows--) {
//				System.out.print("["+rows+"]["+cols+"]="+ arr[rows][cols] + " ");
//			}
//			System.out.println();
//		}
//		 int[][] arr2 = new int[4][4];
//		 for (int i = 0; i < arr2.length; i++) {
//		 for (int j = 0; j < arr2[i].length; j++) {
//		 arr2[i][j] = arr[arr.length - 1 - j][i];
//		 System.out.print("arr2[" + i + "][" + j + "]=" + arr2[i][j] + " ");
//		 }
//		 System.out.println();
//		 }
		 for (int i = 0; i < arr.length; i++) {
		 for (int j = 0; j < arr[0].length; j++) {
		 System.out.print( arr[arr.length - 1 - j][i] + " ");
		 }
		 System.out.println();
		 }
	}

}
