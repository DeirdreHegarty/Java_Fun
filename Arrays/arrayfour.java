// create an array of size 10 and into it put the first 10 even numbers
// greater than the given user input. Accept user input and print out that 
// array value at that position to the screen.

import java.util.Scanner;
public class arrayFour{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int [] scanArray = new int [10];
		int base = sc.nextInt(); 
		
		if(base %2==0){//if even
			base = base +2;
		}else{ //if odd
			base++;
		}

		for(int i=0; i< 10; i++){
			scanArray[i] = base;
			base = base +2;
		}

		//print initial array
		System.out.print("The array you entered: ");
		for(int i=0; i< 10; i++){
			System.out.print(scanArray[i] + " ");
		}
		System.out.println();

//keep taking input from the user until they enter -1 -> then break
    int input;
    do {
      input = sc.nextInt();
      if (input >= 0 && input < 10) {
        System.out.println("Position " + input + ": " + scanArray[input]);
      }
      else if (input == -1) {
        break;
      }
      else {
        System.out.println("Position " + input + ": No such index!");
      }
    } while (input != -1);
  
	}
}