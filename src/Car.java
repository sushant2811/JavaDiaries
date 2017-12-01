
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
	// Following are the examples of instance methods, they work on your instance fields/ variables. 
	public void printVariables() {
		System.out.println("Max speed = " + maxSpeed);
		// println tells to print this out and then print the next thing 
		// on the next line
		System.out.println("Min speed = " + minSpeed);
		System.out.println("Weight = " + weight);
		System.out.println("Is the car on = " + isTheCarOn);
		System.out.println("Condition of the car = " + condition);
		System.out.println("Name of the car = " + nameOfCar);
		System.out.println("Name of people in the Car = " + numberOfPeopleInCar);
	}

	public void wreckCar() {
		condition = 'C';
	}
	
	public void getIn() {
		numberOfPeopleInCar += 1;
	}
	
	public void getOut() {
		numberOfPeopleInCar--;
	}
	
	public double howManyMilesTillOutOfGas() {
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillUp() {
		return maxFuel * mpg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main function is where you make everything
		
		Car birthdayCar = new Car(200, 5000.54, true);
		System.out.println("Birthday Car v1");
		birthdayCar.printVariables();
		birthdayCar.getIn();
		birthdayCar.getIn();
		birthdayCar.getIn();
		System.out.println("Miles till out of gas = " + birthdayCar.howManyMilesTillOutOfGas());
		System.out.println("Max miles per fill up = " + birthdayCar.maxMilesPerFillUp());
		System.out.println(" ");
		System.out.println("Birthday Car v2");
		birthdayCar.printVariables();
		
		System.out.println(" ");
		birthdayCar.getOut();
		System.out.println("Birthday Car v3");
		birthdayCar.printVariables();
		
//		System.out.println("Chirstmas Car");
//		Car christmasCar = new Car(500,  2000, false);
//		christmasCar.printVariables();
	}

}
