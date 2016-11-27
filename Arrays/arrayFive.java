//add every number entered to the previous number entered (DOUBLE)
// and round to two decimal places

import java.util.Scanner;
public class arrayFive{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		double [] scanArray = new double [5];

		//read in users array
		for(int i=0; i< 5; i++){ 
			scanArray[i] = sc.nextDouble();
		}

		//loop through array and add values in groups of two
		for(int i=0; i< 5; i++){
			double num2= 0.0;
			if(i==0){
				num2= (double)Math.round((scanArray[i]+scanArray[i+1]) * 100) / 100; 
				System.out.println(scanArray[i+1] + "+" + scanArray[i] + "=" + num2);
			}else{
				num2= (double)Math.round((scanArray[i]+scanArray[i-1]) * 100) / 100; 
			System.out.println(scanArray[i-1] + "+" + scanArray[i] + "=" + num2);
			}
		}
		System.out.println();
  
	}
}