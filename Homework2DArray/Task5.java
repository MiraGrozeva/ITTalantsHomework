
public class Task5 {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } 
		};
		int sumR;
		int sumC;
		int maxR=0;
		int	maxC=0;
		for (int i = 0; i < arr.length; i++) {
			sumR=0;
			sumC=0;
			for (int j = 0; j < arr[i].length; j++) {
				sumR+=arr[i][j];
				sumC+=arr[j][i];
				if(maxR<sumR){
					maxR=sumR;
				}
				if(maxC<sumC){
					maxC=sumC;
				}
			}
		}
		System.out.println("Max sum of the rows: " +maxR);
		System.out.println("Max sum of the colomns: " + maxC);
		if(maxR>maxC){
			System.out.println("Max sum of the rows > Max sum of the colomns");
		}else{
			System.out.println("Max sum of the rows < Max sum of the colomns");
		}
		System.out.println((maxR>maxC?maxR:maxC) +">"+ (maxC<maxR?maxC:maxR) );

	}

}
