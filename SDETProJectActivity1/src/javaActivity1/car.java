package javaActivity1;

public class car {
	static String color;
	static String transmission;
	static int make;
	int tyres;
	int doors;
	//Use of Constructor
    car() {
	tyres = 4;
	doors = 4;
    }
	public void DisplayCharacterstics(){
		System.out.println("Color of the Car: " +  color);
		System.out.println("Type of Transmission: " +  transmission);
		System.out.println("Make of the Car: " +  make);
		System.out.println("Number of Tyres: " +  tyres);
		System.out.println("Number of Doors: " +  doors);
}
	public void accelerate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
}