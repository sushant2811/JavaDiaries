
public class Car {
	
	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079;
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Honda";
	/*In Java char with single quotes, String with double quotes*/
	
	
	// public: scope of the function
	// void: return type of the 
	public void printVariables() {
		System.out.println("Max speed = " + maxSpeed);
		// println tells to print this out and then print the next thing 
		// on the next line
		System.out.println("Min speed = " + minSpeed);
		System.out.println("Weight = " + weight);
		System.out.println("Is the car on = " + isTheCarOn);
		System.out.println("Condition of the car = " + condition);
		System.out.println("Name of the car = " + nameOfCar);
	}

	public void wreckCar() {
		condition = 'C';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car familyCar = new Car();
		
		familyCar.printVariables();
		
		Car aliceCar = familyCar; // here we are equating a reference of familyCar to aliceCar
		
		aliceCar.wreckCar();
		
		System.out.println("Family car after the wreck");
		familyCar.printVariables();
		
		System.out.println("Alice's car after the wreck");
		aliceCar.printVariables();

	}

}
