//Cast user input to strings to doubles & get 
//the highest + lowest pay. examples of inputs:
		// 13.34 is Louise’s rate of pay
		// 12.11 is Harry’s rate of pay
		// 14.41 is Emmet’s rate of pay
		// 14.12 is Laura’s rate of pay
		// 12.34 is Mick’s rate of pay
		
import java.util.Scanner;

public class Casting1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		

		String [] stringArray = new String [5];
		double [] doubleArray = new double [5];
		double highest = 0;
		int hPos =0;
		int lPos =0;
		double lowest = 0;

		for(int i=0; i< 5; i++){
			stringArray[i] = sc.nextLine();
		}
		for(int i=0; i< 5; i++){
			String one = stringArray[i];

			doubleArray[i] = Double.parseDouble(one.substring(0,5));
		}

		highest = doubleArray[0];
		lowest = doubleArray[0];

		for(int i=0; i< 5; i++){
			
			if(doubleArray[i] > highest){
				highest = doubleArray[i];
				hPos = i;
			}
			if(doubleArray[i] < lowest){
				lowest = doubleArray[i];
				lPos = i;
			}

		}

		System.out.println("Highest: " + highest);
		System.out.println("Lowest: " + lowest);

	}
}