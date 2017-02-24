
public class Task7 {

	public static void main(String[] args) {

		int[][]arr={
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		int sum=0;
		int allSum=0;

		for (int i = 0; i < arr.length;i++) {
			if(i==0||i==2||i==4){
				
				sum+=arr[i][0];
				sum+=arr[i][2];
				sum+=arr[i][4];
				System.out.print(arr[i][0] +" "+arr[i][2]+" "+arr[i][4]+"-"+sum);
			}else{
				sum+=arr[i][1];
				sum+=arr[i][3];
				sum+=arr[i][5];
				System.out.print(arr[i][1]+" "+arr[i][3]+" "+arr[i][5]+"-"+sum);
			}
			allSum+=sum;
			sum=0;
			System.out.println();
		}
		System.out.println("Sum of the elements:" + allSum);
	}

}
