import java.util.Scanner;

public class Day0 {
	
	public static void main(String []args){
		
		Scanner scanInput = new Scanner(System.in); // Use scanner class to read from stdin
		
		String s = scanInput.nextLine(); // read the input line
		
		scanInput.close();
		
		System.out.println("Hello, World!");
		
		System.out.println(s);
		
	}
}
