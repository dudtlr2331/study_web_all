package day03.step01.goods.impl;
import day03.step01.goods.Toy;

public class AirToy extends Toy{
	private int zPos;
	
	public AirToy(String name, int price, int xPos, int yPos, int zPos) {
		super(name, price, xPos, yPos);
		this.zPos = zPos;
	}
}
