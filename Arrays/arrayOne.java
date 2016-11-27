//create an array of size 5. Take in user input & 
//swaps the first and last elements.

import java.util.Scanner;
public class arrayOne{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int [] scanArray = new int [5];

		for(int i=0; i< 5; i++){
			scanArray[i] = sc.nextInt();
		}
		System.out.print("The array you entered: ");
		for(int i=0; i< 5; i++){
			System.out.print(scanArray[i]);
		}
		System.out.println();

		int temp = scanArray[0];
		scanArray[0] = scanArray[scanArray.length -1];
		scanArray[scanArray.length -1] = temp;


		System.out.print("The array with elements swapped: ");
		for(int i=0; i< 5; i++){
			System.out.print(scanArray[i]);
		}
		System.out.println();
	}
}