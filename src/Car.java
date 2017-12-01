import javax.security.auth.x500.X500Principal;

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
	int maxCapacity = 6;
	
	// All the above variables are called instance variables. Set to default currently.
	
	// This is where we add the constructor by convention (after the instance variables)
	
	public Car(){
		
	}
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
		
		if (numberOfPeopleInCar < maxCapacity){
			numberOfPeopleInCar += 1;
			System.out.println("Someone got in");
		}
			
		else
			System.out.println("Car is already full! "
					+ "Number of people in the car = " + numberOfPeopleInCar);
	}
	
	public void getOut() {
		
		if (numberOfPeopleInCar > 0){
			numberOfPeopleInCar--;
			System.out.println("Someone got out");
		}
		else
			System.out.println("Nobody in the car! "
					+ "No. of people in the car = " + numberOfPeopleInCar);
	}
	
	public double howManyMilesTillOutOfGas() {
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillUp() {
		return maxFuel * mpg;
	}
	
	public void turnCarOn() {
		if (!isTheCarOn){
			isTheCarOn = true;
		}
		else
			System.out.println("Car already on. isTheCarOn = " + isTheCarOn);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main function is where you make everything
		
		Car myCar = new Car();
		myCar.getOut();
		myCar.getOut();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.turnCarOn();
		myCar.turnCarOn();

	}

}
