package day03.step01.goods.impl;

import day03.step01.goods.Book;

public class EBook extends Book {

	private boolean isNetwork;
	
	public EBook(String name, int price, boolean isNetwork){
		super(name, price);
		this.isNetwork = isNetwork;
	}
	

}
