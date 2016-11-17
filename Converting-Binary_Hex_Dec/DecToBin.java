//Given a valid decimal, this code will convert that number to binary

import java.util.Scanner;
public class DecToBin{
	public static void main(String [] args){
		System.out.println("Please enter a valid decimal");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int y=0;
		String backwards ="";
		String forwards ="";

		while(x>0){
			y = x % 2;							//get the remainder
			x = x / 2; 							//reassign value
			backwards += Integer.toString(y);	//append remainders to string		
		}

		for(int i=backwards.length()-1; i>=0; i--){ //loop backwards
				forwards += backwards.charAt(i);
			}
			System.out.println("The binary of that number is: " + forwards);
	}
}