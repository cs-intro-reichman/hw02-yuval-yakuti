/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String ABC = args[0];
		int length = ABC.length();
		String reverse = "";
		for(int i =length-1; i>=0; i--){
			char CBA = ABC.charAt(i);
			reverse+= CBA;
		}
		System.out.println(reverse);
		char print = ABC.charAt(length/2);
		System.out.println("The middle character is " +(print));
	}
}
