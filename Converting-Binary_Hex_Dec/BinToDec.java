// Given a valid binary number, the code below will convert the number to decimal.

import java.util.Scanner;

public class BinToDec{
	public static void main (String [] args){
		System.out.println("Please enter a valid binary number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int x1 = 2;
		int pow =0;
		int ans1 =0;

		String num = String.valueOf(x);		//cast to a string 
		int length = num.length(); 			//get length of string/amount of digits
		int ans=0;

		for(int j = length-1; j>=0; j--){ 	//Loop backwards

			int len = length - j; 			//length of string - current position = power of 2 currently

			for(int i=0; i<len; i++){ 		//calculate power of 2
				pow *=x1;
				ans1 = pow;

				if(i==0){
					pow =1;
				}
			}
			ans += Integer.parseInt(Character.toString(num.charAt(j))) * pow;
		}
		System.out.println("This number converted to decimal is: " + ans);
	}
}