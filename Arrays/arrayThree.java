//SUM, PRODUCT & Largest in an array

import java.util.Scanner;
public class arrayThree{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int [] scanArray = new int [x];

		int sum =0;
		int product =1;
		int largestNum = 0;

		for(int i=0; i< x; i++){
			scanArray[i] = sc.nextInt();
			sum += scanArray[i];
			product *= scanArray[i];

			if(scanArray[i] > scanArray[largestNum]){
				largestNum = i;
			}
		}
		largestNum = scanArray[largestNum];

		//print initial array
		System.out.print("The array you entered: ");
		for(int i=0; i< x; i++){
			System.out.print(scanArray[i]);
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Largest: " + largestNum);
	}
}