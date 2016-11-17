//Given two valid binary numbers, this code will add them together.
import java.util.Scanner;
public class BinaryAdd{
	public static void main(String [] args){
		System.out.println("Please enter 2 valid binary number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int x1 = 2;
		int pow =0;
		int ans1 =0;
		int ans2 = 0;

		//CONVERT FIRST NUMBER TO DECIMAL

		String num = String.valueOf(x);		//cast to a string 
		int length = num.length(); 			//get length of string/amount of digits
		int decFirst=0;

		for(int j = length-1; j>=0; j--){ 	//Loop backwards

			int len = length - j; 			//length of string - current position = power of 2 currently

			for(int i=0; i<len; i++){ 		//calculate power of 2
				pow *=x1;
				ans1 = pow;

				if(i==0){
					pow =1;
				}
			}
			decFirst += Integer.parseInt(Character.toString(num.charAt(j))) * pow;
		}

		x = sc.nextInt(); 				//scan in next value


		//CONVERT THE SECIND NUMBER TO DECIMAL

		num = String.valueOf(x);		
		length = num.length(); 			
		int decSecond=0;

		for(int j = length-1; j>=0; j--){ 	

			int len = length - j; 			

			for(int i=0; i<len; i++){ 		
				pow *=x1;
				ans1 = pow;

				if(i==0){
					pow =1;
				}
			}
			decSecond += Integer.parseInt(Character.toString(num.charAt(j))) * pow;
		}


		//ADD THE TWO NUMBERS TOGETHER AND CONVERT BACK TO BINARY

		int binAns = decSecond + decFirst;
		int y=0;
		String backwards ="";
		String forwards ="";

		while(binAns>0){
			y = binAns % 2;							//get the remainder
			binAns = binAns / 2; 					//reassign value
			backwards += Integer.toString(y);		//append remainders to string		
		}

		for(int i=backwards.length()-1; i>=0; i--){ //loop backwards
				forwards += backwards.charAt(i);
			}
			System.out.println("The binary of the addition of these numbers are: " + forwards);
	
	}
}