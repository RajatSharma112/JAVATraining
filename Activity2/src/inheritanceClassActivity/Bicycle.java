package inheritanceClassActivity;

	class Bicycle implements BicycleParts, bicycleOperations {

	    public int gears;
	    public int currentSpeed;
	    public Bicycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }
	    public void applyBrake(int decrement) {
	        currentSpeed -= decrement;
	        System.out.println("Decreased Current speed: " + currentSpeed);
	    }
	    public void speedUp(int increment) {
	        currentSpeed += increment;
	        System.out.println("Increased Current speed: " + currentSpeed);
	    }
	    public String bicycleDesc() {
	        return("No of gears are " + this.gears + "\nSpeed of bicycle is " + this.currentSpeed);
	    }
	}
