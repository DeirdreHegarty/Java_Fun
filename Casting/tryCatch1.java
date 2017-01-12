//try catch to catch the error 
import java.util.Scanner;
public class tryCatch1{
	public static void main(String [] args){
	Scanner sc = new Scanner (System.in);
	int [] array = new int [5];
	int sum = 0;
	int product =1;

	for(int i=0; i<array.length; i++){
		array[i] = sc.nextInt();
	}
		sc.close();

	for(int i=0; i<=array.length; i++){
		try {
			product = product*array[i];
			sum = sum+array[i];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An error has occurred.");
		}
	}

		System.out.println("product: " + product);
		System.out.println("sum: " + sum);

	}
}