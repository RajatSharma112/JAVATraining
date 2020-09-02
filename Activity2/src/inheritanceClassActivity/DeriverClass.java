package inheritanceClassActivity;

public class DeriverClass {
	public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(50);
        mb.applyBrake(8);
    }
}
