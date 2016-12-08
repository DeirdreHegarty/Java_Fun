import java.util.Scanner;
public class ArraySumOdd{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int [][] userArray = new int [rows][cols];
		int sumOdd =0;
		int countOdd =0;

		for(int i =0; i<rows; i++){
			for(int j=0; j< cols; j++){
				userArray[i][j] = sc.nextInt();
			}
		}

		for(int i =0; i<rows; i++){
			for(int j=0; j< cols; j++){

				if(userArray[i][j] % 2 !=0){
					countOdd++;
					sumOdd += userArray[i][j];
				}
			}
		}
		System.out.println("count: " + countOdd);
		System.out.println("sum: " + sumOdd);

	}
}