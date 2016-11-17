//Given a valid hexidecimal, this code will convert that number to decimal.

import java.util.Scanner;
public class HexToDec{
	public static void main(String [] args){
		System.out.println("Please enter a valid Hexidecimal");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int y=0;
		String temp = "";
		String backwards ="";
		String forwards ="";

		while(x>0){
			
			y = x % 16;							//get the remainder
			x = x / 16; 						//reassign value

			//cast int remainer to a string type
			temp = Integer.toString(y);

			//check for specific remainder values 10 - 15 (now cast to a string)
			if(temp.equals("10")){
				temp = "A";
			}
			else if(temp.equals("11")){
				temp = "B";
			}
			else if(temp.equals("12")){
				temp = "C";
			}
			else if(temp.equals("13")){
				temp = "D";

			}
			else if(temp.equals("14")){
				temp = "E";

			}
			else if(temp.equals("15")){
				temp = "F";

			}

			backwards += temp;	//append remainders to string(now cast to a string)		
		}

		for(int i=backwards.length()-1; i>=0; i--){ //loop backwards
				forwards += backwards.charAt(i);
			}
			System.out.println("The Decimal of that number is: " + forwards);
	}
}