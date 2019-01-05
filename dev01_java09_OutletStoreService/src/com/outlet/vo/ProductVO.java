package com.outlet.vo;

import com.outlet.util.MyDate;

public class ProductVO {
	
	private int price; //가격
	private int serialNumber; //물품 일련번호
	private String maker; //브랜드명
	private MyDate starDate; //입고시점
	
	
	
	public ProductVO(String maker, int price, MyDate starDate, int serialNumber) {
		super();
		this.price = price;
		this.serialNumber = serialNumber;
		this.maker = maker;
		this.starDate = starDate;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public MyDate getStarDate() {
		return starDate;
	}
	public void setStarDate(MyDate starDate) {
		this.starDate = starDate;
	}
	
	
	
	
}
