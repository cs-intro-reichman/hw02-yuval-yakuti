/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int allsum = 0;
		for(int i = 0; i<n; i++){
		boolean child = true;
		int sum = 0;
		double x = Math.random();
		if (x<0.5) 
		{
			sum++;
		} else {
			sum++;
			child = false;
		       } 
		boolean kid = child;
		while (kid==child) {
			x = Math.random();
			if (x<0.5) 
		{
				sum++;
				kid = true;
		} else {
			sum++;
			kid = false;
		       } 
		}
		if ( sum == 2) {
			sum2++;
		} else if (sum == 3) {
			sum3++;
		} else {
			sum4++;
		}	
		allsum=allsum+sum;
		}
		double avg=(double)allsum/n;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + sum2);
		System.out.println("Number of families with 3 children: " + sum3);
		System.out.println("Number of families with 4 or more children: " + sum4);

		if (sum2>sum3&&sum2>sum4) {
			System.out.println("The most common number of children is 2.");
		}
		else if (sum3>sum4&&sum3>sum2) {
			System.out.println("The most common number of children is 3.");
		}
		else {
			System.out.println("The most common number of children is 4.");
		}
	}
}