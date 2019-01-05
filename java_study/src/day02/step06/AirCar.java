package day02.step06;

public class AirCar extends Car{

	private String fual;

	public String getFual() {
		return fual;
	}

	public void setFual(String fual) {
		this.fual = fual;
	}
	/*
	 * super
	 * 
	 * this, this()
	 * super, super()
	 */
	@Override
	public String toString() {
		return "AirCar [fual=" + fual +"]";
	}
	
}
