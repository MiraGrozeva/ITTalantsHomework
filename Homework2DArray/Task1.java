
public class Task1 {

	public static void main(String[] args) {

		int[][]arr = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
		};
		int min = arr[0][0];
		int max = arr[0][0];
		for (int rows = 0; rows < arr.length; rows++) {
			for (int cols = 0; cols < arr[rows].length; cols++) {
				if(arr[rows][cols]<min){
					min=arr[rows][cols];
				}
				if(arr[rows][cols]>max){
					max=arr[rows][cols];
				}
			}
		}
		System.out.println("Least: " + min);
		System.out.println("Biggest: " + max);

	}

}
