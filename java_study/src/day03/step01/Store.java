package day03.step01;

import day03.step01.goods.Book;
import day03.step01.goods.Toy;
import day03.step01.goods.impl.AirToy;
import day03.step01.goods.impl.EBook;
import day03.step01.goods.impl.GroundToy;
import day03.step01.goods.impl.PaperBook;

public class Store {
	private String name;
	private Book[] book; //아래 대신
//	private EBook[] ebook;
//	private PaperBook[] paperbook;
	private Toy[] toy; //아래 대신
//	private GroundToy[] gtoy;
//	private AirToy[] atoy;
	
	public Store(String name){
		this.name = name;
	}
	public void setToy(Toy[] toy) {
		this.toy = toy;
	}
	public void setBook(Book[] book) {
		this.book = book;
	}
//	public void setGroundToy(GroundToy[] gtoy) {
//		this.gtoy = gtoy;
//	}
//	
//	public void setAirToy(AirToy[] atoy) {
//		this.atoy = atoy;
//	}
	
//	public void setEBook(EBook[] ebook) {
//		this.ebook = ebook;
//	}
//	
//	public void setPaperBook(PaperBook[] paperbook) {
//		this.paperbook = paperbook;
//	}
	
	public String goodsInfo() {
		String result = "----------[" + name + "]-----------\n";
		result = result + book[0].getName() + " , " + book[0].getPrice() + "\n";
		result = result + book[1].getName() + " , " + book[1].getPrice() + "\n";
		result = result + book[2].getName() + " , " + book[2].getPrice() + "\n";
		result = result + book[3].getName() + " , " + book[3].getPrice() + "\n";
		result = result + book[4].getName() + " , " + book[4].getPrice() + "\n";
		result = result + "--------------------------";
//		result = result + ebook[0].getName() + " , " + ebook[0].getPrice() + "\n";
//		result = result + ebook[1].getName() + " , " + ebook[1].getPrice() + "\n";
//		result = result + paperbook[0].getName() + " , " + paperbook[0].getPrice() +"\n";
//		result = result + paperbook[1].getName() + " , " + paperbook[1].getPrice() +"\n";
//		result = result + paperbook[2].getName() + " , " + paperbook[2].getPrice() +"\n";
		
		return result;
	}
}
