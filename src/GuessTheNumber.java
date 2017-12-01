import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	int theNumber;
	int max;
	Scanner scan = new Scanner(System.in);
	
	// constructor
	public GuessTheNumber(){
		max = 100;
		Random random = new Random();
		theNumber = Math.abs(random.nextInt()) % (max + 1);
	}
	
	public void play() {
		while (true) {
			int guess = scan.nextInt();
			if (guess > theNumber){
				System.out.println("Guess too big. Guess again!");
			} else if (guess < theNumber){
				System.out.println("Guess too small. Guess again!");
			} else {
				System.out.println("Correct guess!");
				break;
			}
		}
		
		
	}
	
	public static void howBigIsTheNumber(int x){
		if (x >= 0 && x <= 10) {
			System.out.println("Number pretty small.");
		} else if (x >= 11 && x <= 100) {
			System.out.println("Number pretty big");
		} else {
			System.out.println("Number out of range");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GuessTheNumber guessGame = new GuessTheNumber();
		System.out.println("Make a guess between 0 and " + guessGame.max + " inclusive.");
		guessGame.play();
	}

}
