import java.util.Scanner;
public class LargestRow{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int rows = sc.nextInt();
		int [][] userArray = new int [rows][rows];
		int counting =0;
		int largestRow =0;
		int largestRowCount =0;


		for(int i =0; i<rows; i++){
			for(int j=0; j< rows; j++){
				userArray[i][j] = sc.nextInt();
			}
		}
		for(int i =0; i<rows; i++){
			for(int j=0; j< rows; j++){
				System.out.print(userArray[i][j] + " ");
			}
			System.out.println();
		}

		for(int i =0; i<rows; i++){
			counting =0;
			for(int j=0; j< rows; j++){

				counting += userArray[i][j];

				if(counting> largestRowCount){
					largestRow = i+1;
				}
				
			}
		}
		System.out.println("R"+largestRow);
	}
}