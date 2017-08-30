import java.lang.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/** This is my <code> Calculator </code> Program
 * @author: "Neha Kapil"
 * @date: 8/29/2017
 * @version 1.0.0
 **/

	class Calculator {
			/**
			 * This method returns with the String in the main page.
			 * @String to return as main 
			 * @param args
			 * @Scanner to scan for inputs
			 * @fstNum for firstnumber
			 * @scnNum for second number
			 * @mtdSgn for method sign
			 * @exit to exit the program
			 * @parseable to check if double value is parseable as string and be called from anothe class CheckParseable 
			 * @param next().toLowerCase().trim() scanned input to be trimmed, lower caseing and moved to next step to minimise program error 
			 */
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//Printing initial greetings
				System.out.println("Hello, welcome to my calculator");
				
				//scanning if user typed help or exit
			    Scanner scan = new Scanner(System.in);
			    //Prompt for input
			    System.out.println("If you need help please type \"help\""); 
			    System.out.println("If at anytime you want to leave, type \"exit\"");
			    System.out.println("To continue, hit enter.");

			    //response to user help or exit request
			    String s1 = scan.nextLine().toLowerCase().trim();
			    if (s1.equals("help")){
			        System.out.println(" ");
			        System.out.println("Method signs are:");
			        System.out.println("Addition: '+' (Ex: 'a + b' )");
			        System.out.println("Subtraction: '-' (Ex: 'a - b' )");
			        System.out.println("Multiplication: '*' (Ex: 'a * b' ) ");
			        System.out.println("Division: '/' (Ex: 'a / b' )");
			        System.out.println("Equal to: '=' (Ex: 'a = b' )");
			        System.out.println("To the power: '^' (Ex: 'a raise to the power b' )");
			        System.out.println("Modulo division: '%' (Ex: 'a % b') ");
			        System.out.println("Square root: 'sqrt' (Ex: 'square root of a' )  ");
			        System.out.println("Log: 'log' (Ex: 'log of a' )");
			    }  else if (s1.equals("exit")) {
			        System.out.println("Thanks for using my programe!!");
		            System.exit(0);
			    }
			    
			    
			    //declaring input types for calculation purposes
			    Scanner input = new Scanner(System.in);
			    double fstNum = 0, scnNum = 0;
			    String mtdSgn = "";
			    double result=0;
			    boolean exit = false;
			    boolean parseable = false;
			    GenericStack<Double> stack1 = new GenericStack<Double>();

			    //if user responsed not to exit then first number input request pops up
			    while(exit==false) {
			    
			    		//scanning if user typed number, pi or exit
		            	System.out.println("Please enter the first number or pi or exit : ");
		    	        Scanner fstNumber = new Scanner(System.in);
		    	        String fstStr  = fstNumber.next().toLowerCase().trim();
		    	        
		    	        //user can exit if responded with exit input 
		    	        if (fstStr.equals("exit")){
	    	     	        System.out.println("Thanks for using my programe!!");
	    	                 System.exit(0);
	    	     		}
		    	        
		    	        //user will have pi value if responded with pi input also passing String for first number	    	        
		    	        if (fstStr.equals("pi")){
		    	        	fstStr = String.valueOf(Math.PI);
		    	        }
		    	        
		    	        //calling parseable method from CheckParseable class for first number input
		    	        parseable = CheckParseable.checkParseable(fstStr);
		    	        
		    	        //promt for method sign input
		    	        System.out.println("Please enter method sign (+, -, *, /, =, ^, %, ('sqrt' and 'log' for first number) or exit  : ");
		    	        
		    	        //scanning for user input; if sqrt, log then it will result for first number; if exit then end of program
		    	        Scanner methodSign = new Scanner(System.in);
		    	        mtdSgn = methodSign.next().toLowerCase().trim();
		    	        
		    	        //it will return square root value for first number input also passing String for first number
		    	        if (mtdSgn.equals("sqrt")){
		    	        	fstNum = Double.parseDouble(fstStr);
		    	    		System.out.println("Your answer is : " + Math.sqrt(fstNum));
		    	    		result = Math.sqrt(fstNum);
	    	    		}
		    	        
		    	        //it will return log value for first number also passing String for first number
		    	        else if(mtdSgn.equals("log")){
		    	        	fstNum = Double.parseDouble(fstStr);
		    	     		System.out.println("Your answer log for the first number is: " + Math.log(fstNum));
		    	     		result = Math.log(fstNum);
		    	        } else if ( mtdSgn.equals("exit")){ //user can exit if responded with exit input
			     	        System.out.println("Thanks for using my programe!!");
			                 System.exit(0);
		     		    }
		    	    	 	
		    	        //scanning for user input; if +, -, /, *, =, ^, % then prompts for second number
		    	        else {
		    	    	
		    	        	//Prompt for input
		    	        	System.out.println("Please enter the second number or pi or exit  : ");
		    	        	
		    	        	//scanning if user typed number, pi or exit for second number input
			    	        Scanner secondNumber = new Scanner(System.in);
			    	        String scnStr = secondNumber.next().toLowerCase().trim();
			    	        
			    	        //user can exit if responded with exit input
			    	        if (scnStr.equals("exit")){
		    	     	        System.out.println("Thanks for using my programe!!");
		    	                System.exit(0);
		    	     		}
			    	        
			    	        //user will get pi value if responded with pi input also passing String for second number
			    	        if (scnStr.equals("pi")){
			    	        	scnStr = String.valueOf(Math.PI);
			    	        }
			    	        
			    	        //calling parseable method from CheckParseable class for second number input
			    	        parseable = CheckParseable.checkParseable(scnStr); 
			    	        
			    	   	    //it will return "a+b" value also passing String for first and second number   
			    	        if(mtdSgn.equals("+")){
			    	        	fstNum = Double.parseDouble(fstStr);
			    	        	scnNum = Double.parseDouble(scnStr);
				                System.out.println("Your answer is : " + (fstNum + scnNum));
				                result = (fstNum + scnNum);
				            }
		
			    	        //it will return "a-b" value also passing String for first and second number
				        	else if(mtdSgn.equals("-")){
				        		fstNum = Double.parseDouble(fstStr);
			    	        	scnNum = Double.parseDouble(scnStr);
				                System.out.println("Your answer is : " + (fstNum - scnNum));
				                result = (fstNum - scnNum);
				            }
				        	
			    	        //it will return "a/b" value also passing String for first and second number
				            else if(mtdSgn.equals("/")){
				            	fstNum = Double.parseDouble(fstStr);
			    	        	scnNum = Double.parseDouble(scnStr);
				            	System.out.println("Your answer is : " + (fstNum / scnNum));
				            	result = (fstNum / scnNum);
				            }
				        	
			    	        //it will return "a*b" value also passing String for first and second number
				            else if(mtdSgn.equals("*")){
				            	fstNum = Double.parseDouble(fstStr);
			    	        	scnNum = Double.parseDouble(scnStr);
					        	System.out.println("Your answer is : " + (fstNum * scnNum));
					        	result = (fstNum * scnNum);
					        }
				        
			    	        //it will return "a^b" value also passing String for first and second number
				            else if(mtdSgn.equals("^")){
				            	fstNum = Double.parseDouble(fstStr);
			    	        	scnNum = Double.parseDouble(scnStr);
					        	System.out.println("Your answer for first number to the power second number is: " + Math.pow(fstNum,scnNum));
					        	result = Math.pow(fstNum,scnNum);
					        }
				        
			    	        //it will return "a%b" value also passing String for first and second number
				            else if(mtdSgn.equals("%")){
				            	fstNum = Double.parseDouble(fstStr);
			    	        	scnNum = Double.parseDouble(scnStr);
					        	System.out.println("Your answer for first number modulo division to second number is: " + (fstNum % scnNum));
					        	result = (fstNum % scnNum);
					        }
		        	    	
			    	        //it will return if ("a=b" if true or not) value also passing String for first and second number
				            else if(mtdSgn.equals("=")){
				            	fstNum = Double.parseDouble(fstStr);
			    	        	scnNum = Double.parseDouble(scnStr);
					        	if (fstNum == scnNum) {
				            	System.out.println("Your answer is : " + "First number is equal to second number" );
				            	}
					        	
						        if (fstNum != scnNum) {
						            	System.out.println("Your answer is : " + "First number is not equal to second number" );
							    }
				            }
		        	    	
			    	        //error for unmatched method signs 
				            else {
				            	System.out.println("Error! method sign is not correct");
				            }
		    	    
			    	    } 
		    	        
		    	        //prompt for saving the result 
		    	        System.out.println("Do you want to save your result (Y/N)?");
			        	
		    	        //scanning for response to save the result or not
		    	        Scanner willSave = new Scanner(System.in);
			        	String response1 = willSave.next().toLowerCase().trim();
			        	if (response1.equals("y")) {
			        		stack1.push(result);
		    			
			        		//prompt for viewing the result
			    			System.out.println("Do you want to view your saved results (Y/N)?");
			    			
			    			//scanning for response to view the result or not
			    			Scanner willShow = new Scanner(System.in);
				        	String response2 = willShow.next().toLowerCase().trim();
					        	if (response2.equals("y")) {
				    			
				    			System.out.println(stack1.toString());
					        	}
			        	}

			        	//prompt for continue the program
			        	System.out.println("Do you want to continue (Y/N)?");
			        	
			        	//scanning for response to continue the program or not
			        	Scanner willQuit = new Scanner(System.in);
			        	String response = willQuit.next().toLowerCase().trim();
			        		
			        		//exit with thanks note
			        		if (!response.equals("y")) {
			        			System.out.println("Thanks for using my programe!!");
			        			exit = true;
			        		}
			    }
			        
		}	
	}

