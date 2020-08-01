//Bringing in my tools.
import java.util.Scanner;
import java.io.*;


public class InputReader {

	public static void main (String[] args) {

		
		String csvLine = "";
		
		//Using the try method.
		 try {
		   File fileFun = new File ("C:\\Program Files (x86)\\input.txt");
		   
		   //int for counting lines.
		   int counter = 1;
		   
		   Scanner scn = new Scanner (fileFun);
		   while (scn.hasNextLine()) {
			   
		          csvLine = scn.nextLine (); 
		          
		          int values = 0;
		          
            	  String[] arr = null;
		          System.out.println("Maximum values");
		          
		          //Split up array values.
		     	  arr = csvLine.split (",");
		     	  
        			for (int x = 0; x < arr.length; x++) {
        				
							if(Integer.parseInt (arr [x]) > values)
								 values = Integer.parseInt(arr [x]);
				
			        }
			
			      System.out.println ("ROW " + counter + " : " + values);
			      counter++;
		      }
		 }
		 catch(FileNotFoundException exc){
		    System.out.println("File not found...");
		 } //catch here.
	}
}
