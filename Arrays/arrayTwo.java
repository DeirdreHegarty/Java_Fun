//create an array of user input size. It fills the array with 
// random numbers between 0 - 100 & arranges 
// the elements so the smallest is at the start and the largest 
// is at the end of the array.

import java.util.*;
public class arrayTwo{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Random randomno = new Random();
		int low =0;
		int high = 100;


		int x = sc.nextInt();
		int [] scanArray = new int [x];

		//generate random numbers
		for(int i=0; i< x; i++){
			scanArray[i] = randomno.nextInt(high-low) + low;
		}

			//print what is in the array
		System.out.print("The initial array: ");
		for(int i=0; i< x ; i++){
			System.out.print(scanArray[i]+ " ");
		}
		// initialise default min & max
		int min = 0;
		int max = 0;

		for(int i=0; i< x; i++){
			if(scanArray[i] < scanArray[min]){
				min = i;
			}
			if(scanArray[i] > scanArray[max]){
				max = i;
			}
		}
		System.out.println();

		// swap the values (smallest to start and largest to end of array)
		int temp1 = scanArray[0]; 
		scanArray[0] = scanArray[min];
		scanArray[min] = temp1;

		int temp2 = scanArray[x-1];
		scanArray[x-1] = scanArray[max];
		scanArray[max] = temp2;

		//print what is in the array
		System.out.print("The array with elements swapped: ");
		for(int i=0; i< x ; i++){
			System.out.print(scanArray[i]+ " ");
		}
		System.out.println();
	}
}