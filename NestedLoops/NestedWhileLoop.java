public class NestedWhileLoop{
	public static void main (String [] args){
		int x = 0;
		int y = 1;
		while(y <= 5){
			x = y;
			while(x > 0){
				System.out.print("#");
				x--;
			}
			y++;
			System.out.println();
		}
	}
}