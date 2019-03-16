package step04.ship;

public class Boat extends Ship{
	
	public Boat(){}
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}
	
	public void sail(int dist) {
		super.fuelTank -= dist * 10;
	}
	public void refuel(int fuel) {
		super.fuelTank += fuel * 10;
	}
}
