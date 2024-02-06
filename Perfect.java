/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int N = Integer.parseInt(args[0]);
		String cal = " = 1";
		int sum = 0;
		for (int i = 1 ; i < N ; i++) {
			if (N % i == 0) {
			sum = sum + i;
			if (i != 1){
			cal = (cal + " + " + i);
			}
			}
		}
		{
		if (N == sum) {
			System.out.println( N + " is a perfect number since " + N + cal);
		} else{
					System.out.println(	N + " is not a perfect number");
		}
	}		
	}	
}