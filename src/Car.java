
public class Car {
	
	int maxSpeed;
	int minSpeed = 0;
	
	double weight = 4079;
	
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Honda";
	/*In Java char with single quotes, String with double quotes*/
	
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numberOfPeopleInCar = 1;
	
	// All the above variables are called instance variables. Set to default currently.
	
	// This is where we add the constructor by convention (after the instance variables)
	// Below we use constructor to change default values. We can use all or subset of instance 
	// variables as parameters for constructors. 
	public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
		
	}
	
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
		// Main function is where you make everything
		
		Car birthdayCar = new Car(200, 5000.54, true);
		birthdayCar.printVariables();
	}

}
