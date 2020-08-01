//Importing Scanner.
import java.util.Scanner;

public class DivisorCalc {

   public static void main(String[] args) {
	   
       //Input receiving.
       Scanner scn = new Scanner(System.in);
       
       //Variables.
       int num1, num2;

       // Getting the inputs entered by the user
       System.out.println ("Please enter the first number: ");
       num1 = scn.nextInt ();

       System.out.println ("Great choice. Please enter the second number: ");
       num2 = scn.nextInt ();

       //Method running.
       int gcMethod = gcd (num1, num2);
       System.out.println ("Okay. GCD of " + num1 + " and " + num2 + " is "+ gcMethod);
   }

   //Recursion static method.
   private static int gcd (int num1, int num2) {
	   
       if (num2 == 0) {
           return num1;
       }
       return gcd (num2, num1 % num2);

   }

}