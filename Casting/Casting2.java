//Prints to the screen the character equivalence of an 
//inputted decimal value, until ASCII value for esc is entered.
//Doesn't include esc.

import java.util.Scanner;
public class Casting2{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int num = 0;
		String ans = " ";

		while(sc.hasNext()){
			num = sc.nextInt();
			if(num ==27){
				break;
			}
			ans += ((char)num + " ");

		}
		System.out.println("The ASCII value of that number(s): " + ans);
	}
}