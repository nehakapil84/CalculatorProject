import java.util.Scanner;
/** This is my <code> Calculator </code> Program
 * @author: "Neha Kapil"
 * @date: 8/29/2017
 * @version 1.0.0
 **/
	public  class CheckParseable {
		/**
		 * This method returns with the String in the main page.
		 * @author: "Neha Kapil"
		 * @date: 8/29/2017
		 * @version 1.0.0
		 * @param String to parse as double
		 * @boolean to checkparseable result if true or false 
		 */
			public static boolean checkParseable(String fstStr) {
					
				//declaring first and second number as double
				 double fstNum = 0, scnNum = 0;
				 boolean parseable = false;
			      
				 	// CheckParseable if true
			        try {
			        	//passing string as double
				       	fstNum = Double.parseDouble(fstStr);
				       	parseable = true;
				       	    	        	
				       } catch (Exception e) { 
				       	parseable = false;  
				       } 
			      
			           // CheckParseable if false
				       while (parseable == false) {
				    	   
				       //prompt for valid input
				       System.out.println("Please enter a VALID first number or exit : ");
				       
				       //scanning for valid input
				       Scanner fstNumber = new Scanner(System.in);
				       fstStr  = fstNumber.next().toLowerCase().trim();
				      
					        try {
					        	
					        	//passing string as double
					        	fstNum = Double.parseDouble(fstStr);
					        	parseable = true;
					        } catch (Exception e) { 
					        	parseable = false; 
					        } 
					       
				       }   
				   
				   //return the value as parseable
			       return parseable;
			       
		  }
}
