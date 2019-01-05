package day03.step01.goods.impl;

import day03.step01.goods.Book;

public class PaperBook extends Book {

	private int durable;
	
	public PaperBook(String name, int price, int durable){
		super(name, price);
		this.durable = durable;
	}

	
}
