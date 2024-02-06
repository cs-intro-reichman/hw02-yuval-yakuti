
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean child = true;
		int sum = 0;
		double x = Math.random();
		if (x<0.5) 
		{
			System.out.print("g ");
			sum++;
		} else {
			System.out.print("b ");
			sum++;
			child = false;
		       } 
		boolean kid = child;
		while (kid==child) {
			x = Math.random();
			if (x<0.5) 
		{
				System.out.print("g ");
				sum++;
				kid = true;
		} else {
			System.out.print("b ");
			sum++;
			kid = false;
		       } 
		}
		System.out.println("You made it... and you now have "+sum+" children.");
	}
}