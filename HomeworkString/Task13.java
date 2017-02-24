import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

			int[]arr1=getArray();
			int[]arr2=getArray();
			printArray(getNewArray(arr1, arr2));
			
	}
		static int[]getArray(){
			int n;
			Scanner sc =new Scanner(System.in);
			do{
				System.out.println("Enter lenght of the array: ");
				n =sc.nextInt();
			}while(n<1);
			int[]array=new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.print("array["+i+"]=");
				array[i]=sc.nextInt();
			}
			return array;
		}
		static int [] getNewArray(int[]array1,int[]array2){
			int l =array1.length+array2.length;
			int[] nArray=new int[l];
			int i=0;
			for ( i = 0; i < array1.length; i++) {
				nArray[i]=array1[i];
			}
			for (int j = 0; j < array2.length; j++) {
				nArray[i+j]=array2[j];
			}
			return nArray;
		}
		static void printArray(int[]array){
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+ " ");
			}
		}

}
