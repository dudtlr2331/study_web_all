package step04.ship;

public class Cruise extends Ship{

	public Cruise(){}
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}
	
	public void sail(int dist) {
//		super.fuelTank -= dist * 13;
		super.setFuelTank(super.getFuelTank() - 13);
	}
	public void refuel(int fuel) {
		super.fuelTank += fuel * 8;
	}

}
