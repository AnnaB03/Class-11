package syntax.class11;

public class Car {
	
	String make;
	String model;
	String color;
	int year;
	double mileage;
	
	void moveForward() {
		System.out.println("Moving forward ");
	}
	void applyBreaks () {
		System.out.println("Applying breaks");
	}


	public static void main(String[] args) {
		Car ayshasCar = new Car();
		ayshasCar.make = "Tesla";
		ayshasCar.model = "S";
		ayshasCar.color = "Black";
		System.out.println("Ayshas Car is "+ ayshasCar.make);
		System.out.println("Ayshas Car model is "+ ayshasCar.model);
		System.out.println("Ayshas Car color is "+ ayshasCar.color);
		ayshasCar.moveForward(); //calling the "move forward" behavior/method on AyshasCard object
		ayshasCar.applyBreaks();
	}

}
