
public class GuessTheNumber {
	
	public static void howBigIsTheNumber(int x){
		if (x >= 0 && x <= 10) {
			System.out.println("Number pretty small");
		} else if (x >= 11 && x <= 100) {
			System.out.println("Number pretty big");
		} else {
			System.out.println("Number out of range");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		howBigIsTheNumber(0);
		howBigIsTheNumber(10);
		howBigIsTheNumber(11);
		howBigIsTheNumber(100);
		howBigIsTheNumber(5);
		howBigIsTheNumber(75);
		howBigIsTheNumber(-1);
		howBigIsTheNumber(105);
	}

}
