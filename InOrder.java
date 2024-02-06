/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here}
		int random = (int)(Math.random()*10);
		int random1 = random; 
		while (random<=random1) {
			System.out.print(random1 + " ");
			random = random1;
			random1 = (int)(Math.random()*10);
		}
	}
}
