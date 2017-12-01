import java.util.Random;

public class coinToss {
	
	public String tossACoin() {
		Random random = new Random();
		/*Accessing the Math class. Here we are using a static method. 
		 We don't need to create an instance of accessing static methods, because they 
		 don't change with the instance.  */
		int toss = Math.abs(random.nextInt()) % 2;
		
		if (toss == 0)
			return "Head";
		else
			return "Tail";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coinToss game = new coinToss();
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
	}

}
