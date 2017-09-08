
public class PrintingStars{
	public static void main (String [] args){
		int x =9;
		printStars(x);
		printRows(x);
		printCols(x);
		printTriangle(x);


	}

/* The following method prints stars

	*****
	****
	***
	**
	*
*/
	public static void printStars(int x){
		for(int i=0; i<x; i++){
			for(int j=0; j<x-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

/* The following method prints row numbers in reverse + 1

	55555
	4444
	333
	22
	1
*/
	public static void printRows(int x){
		for(int i=0; i<x; i++){
			for(int j=0; j<x-i; j++){
				System.out.print(x-i);
			}
			System.out.println();
		}
	}
/* The following method prints the value of inner loop + 1

	12345
	1234
	123
	12
	1
*/
	public static void printCols(int x){
		for(int i=0; i<x; i++){
			for(int j=0; j<x-i; j++){
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

/* The following method prints the following for odd numbers

	   *
	  ***
	 *****
	*******

*/
	public static void printTriangle(int x){
		int temp=0;

		for(int i=0; i<x; i+=2){ 

			//calculate how much whitespace to print
			temp = (x-(i+1))/2;
			while(temp>0){
				System.out.print(" ");
				temp--;
			}

			//print stars
			for(int j=x-(i+1); j<x; j++){

					System.out.print("*");

			}

			System.out.println();
		}
	}
}