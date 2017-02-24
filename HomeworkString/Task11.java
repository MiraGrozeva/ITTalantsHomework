
public class Task11 {

	public static void main(String[] args) {

		int[] arr = {11,12,13,1,4,5,6,8,9,5,2};
		printArray(arr);
	}
	static void printArray(int[]array){
		for (int i = 0; i < array.length; i++) {
			if(i==array.length-1){
				System.out.print(array[i]);
			}else{
				System.out.print(array[i] + ", ");
			}
		}
	}

}
