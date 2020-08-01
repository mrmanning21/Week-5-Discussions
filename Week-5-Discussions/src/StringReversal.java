//Importing utilities.
import java.util.Scanner;

	public class StringReversal {

		public static void main (String[] args) {
			
			//Bringing in the scanner for input.
			Scanner scn = new Scanner (System.in);   

			System.out.println ("Tell me something I don't know: ");

			//Declaring Strings from the input.
			String s = scn.nextLine ();
			String revS = reverseString (s);

			System.out.println ("Okay, here it is backwards: " + revS);
}
		//Recursion static method.
		public static String reverseString (String s) {

			if (s.isEmpty())
				return s;

			return reverseString(s.substring(1))+s.charAt(0);
		}

}