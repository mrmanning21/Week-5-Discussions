//Bringing in all the I/O tools.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class userStrings {
	
   public static void main (String args[]) {
	   
       Scanner scn = new Scanner (System.in);
       
       FileOutputStream out = null;
       
       String text;
       System.out.println("Tell me a string to input and I'll write them up for you: "
       		+ "\n(Alternatively you can say 'Done.' to exit.)");
       
       try {
           out = new FileOutputStream("userStrings.txt");
           
           while (true) {
               text = scn.nextLine();
               
               if(text.equalsIgnoreCase("Done.")){
                   break;
               }
               
               else{
                   for(int x = 0; x < text.length(); x++){
                	   
                       try {
                           out.write(text.charAt(x));
                       }
                   
                        catch (IOException ex) {
                           ex.printStackTrace();
                       }
                   }
                   
                   try {
                       out.write('\n');
                   } 
                   catch (IOException ex) {
                       ex.printStackTrace();
                   }
               }
         }
}
       
       catch (FileNotFoundException ex) {
           ex.printStackTrace();
       }
   }
}