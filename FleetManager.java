public class FleetManager {
	public static void main(String[] args) {
		
		System.out.println();

		Truck[] fleetTrucks = new Truck[2];

		fleetTrucks[0] = new FullSize();
		fleetTrucks[1] = new CabOver();


		for (Truck truck : fleetTrucks) {
			truck.displayBranding();
		}

		System.out.println();

	}
}

interface Truck {
	void displayBranding();
}

class FullSize implements Truck {

	FullSize(){}

	@Override
	public void displayBranding() {
		System.out.print("[ FullSize, ");
		System.out.println("Inherited and Overridden. ]");
	}
}

class CabOver implements Truck {

	CabOver(){}

	@Override
	public void displayBranding() {
		System.out.print("[ CabOver, ");
		System.out.println("Inherited and Overridden. ]");
	}
}