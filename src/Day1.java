import java.util.Scanner;

/*
 * Task 
Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. 
You must:
1. Declare  variables: one of type int, one of type double, and one of type String.
2. Read  lines of input from stdin (according to the sequence given in the Input Format section below) and 
initialize your  variables.
3. Use the  operator to perform the following operations: 
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.
 */


public class Day1 {
	
	
		public static void main(String []args){
			
		        int i = 4;
		        double d = 4.0;
		        String s = "HackerRank ";
		        Scanner scan = new Scanner(System.in);
		        
		        /* Declare second integer, double, and String variables. */

		        int ii; 
		        double dd;
		        String ss;

		        /* Read and save an integer, double, and String to your variables.*/
		        ii = scan.nextInt();
		        dd = scan.nextDouble();
		        scan.nextLine(); // required. See the paragraph below
		        
		        /*
		        Scanner has next, nextLine, hasNext, and hasNextLine methods. 
		        Scanner also has readNext and hasNext methods for different data types, which is very 
		        helpful when you know exactly what type of input you'll be reading. 
		        The next methods scan for tokens (you can think of this as a word), and the nextLine methods 
		        reads from the Scanner's current location until the beginning of the next line. For example, 
		        nextInt() will scan the next token of input as an int, and nextDouble() will scan the next 
		        token of input as a double. You should only ever use  scanner object for your entire program. 
				Each line of multi-line input contains an invisible separator indicating that the end of a 
				line of input has been reached. When you use Scanner functions that read tokens 
				(e.g.: next(), nextInt(), etc.), the Scanner reads and returns the next token. 
				When you read an entire line (i.e.: readLine()), it reads from the current position until 
				the beginning of the next line. Because of this, a call to nextLine() may return an empty 
				string if there are no characters between the end of the last read and the beginning of the next line.*/
		        
		        ss = scan.nextLine();
		        
		        /* Print the sum of both integer variables on a new line. */
		        System.out.println(i + ii);

		        /* Print the sum of the double variables on a new line. */
				System.out.println(d + dd);

		        /* Concatenate and print the String variables on a new line; 
		        	the 's' variable above should be printed first. */
		        System.out.println(s + ss);
		}
}
