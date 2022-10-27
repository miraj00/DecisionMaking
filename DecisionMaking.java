import java.io.*;
import java.util.Scanner;

public class DecisionMaking {

	
	
	public static void main (String[] args) {
		
		int num;          
				
		Scanner sc = new Scanner(System.in);
				
				
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();		
				
				
		System.out.println("Enter a number between 1 and 100:");
		num = sc.nextInt();
		
	if ((num >=1) && (num <=100)) { 
		
		if (num %2 != 0) {
			System.out.println( num + " and Odd " );                // If the integer entered is odd, print the number entered and “Odd.” (i.e. “3 and Odd”)
		}	

		if ( (num%2==0) && (num >2) && (num <25)) {					// If the integer entered is even and in the inclusive range of 2 to 25, print “Even and less than 25.”
			System.out.println( "Even and less than 25" );
		}

 		if ( (num%2==0) && (num >26) && (num <60)) {				// If the integer entered is even and in the inclusive range of 26 to 60, print “Even.”
			System.out.println( "Even" );
		}

 		if ( (num%2==0) && (num >60)) {		          				// If the integer entered is even and greater than 60, print the number entered and “Even.” (i.e. “62 and Even”)
			System.out.println( num + " and Even" );
		}

 		if ( (num%2!=0) && (num >60)) {		          				// If the integer entered is odd and greater than 60, print the number entered and “Odd and over 60.”
			System.out.println( num + " Odd and over 60" );
		}
	
	} else {
	  	System.out.println( name + ", you have an Error !!! Number must be between 1 to 100");
	}
	
	    System.out.print( name + ", do you want to continue ? (Y/N) : "); 
        String var= sc.next();
   
        if(var.equalsIgnoreCase("Y")){                      // Matches "Y" or "y"
     		main(null);                                     // if input is Y then call main method again to repeat questionaire. 
        } else {
			System.out.println("Bye !");
		}
	}

}		





/*   **************************************  Requirements  *********************************************************


Decision Making
Conditionals
Task: Use conditional statements to automate the decision-making process.

What will the application do?
The application prompts the user to enter an integer between 1 and 100.
Display the associated result based on the integer range entered.  

Build Specifications
Use if/else statements to take different actions depending on user input.  
Given an integer entered by a user, perform the following conditional actions:
If the integer entered is odd, print the number entered and “Odd.” (i.e. “3 and Odd”)
If the integer entered is even and in the inclusive range of 2 to 25, print “Even and less than 25.”
If the integer entered is even and in the inclusive range of 26 to 60, print “Even.”
If the integer entered is even and greater than 60, print the number entered and “Even.” (i.e. “62 and Even”)
If the integer entered is odd and greater than 60, print the number entered and “Odd and over 60.”

Hints:
ZyBook Chapters 2 and 3.


Extra Challenges:
Ask for user information (ex. name) at the beginning of the application, and use it to refer to the user throughout the application.
Add validation to guarantee that a user enters a positive integer between 1 and 100.


continued on next page.

Console Preview: 

Enter a number between 1 and 100: {user input here, for example: 3}


Output: {output here, 3 and Odd }

Continue? (y/n): {user input here, for example: Y}


Enter a number between 1 and 100: {user input here, for example: 24}

Output: {output here, Even and less than 25 }

Continue? (y/n): {user input here, for example: Y}


Enter a number between 1 and 100: {user input here, for example: 75}

Output: {output here, Odd and over 60}

Continue? (y/n): {user input here, for example: N}

Bye! 

*/