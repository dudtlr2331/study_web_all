package day03.step01.Test;

import day03.step01.Store;
import day03.step01.goods.Book;
import day03.step01.goods.Toy;
import day03.step01.goods.impl.AirToy;
import day03.step01.goods.impl.EBook;
import day03.step01.goods.impl.GroundToy;
import day03.step01.goods.impl.PaperBook;

public class AppTest {

	public static void main(String[] args) {
//	1. 상점이 생긴다.
		Store store = new Store("상점");
// 	2. E-Book 2개 생긴다.
//		EBook ebook01 = new EBook("어린왕자", 10000, true);
//		EBook ebook02 = new EBook("노인과바다", 8000, true);
		Book ebook01 = new EBook("어린왕자", 10000, true);
		Book ebook02 = new EBook("노인과바다", 8000, true);
//	3. PaperBook 3개 생긴다.
//		PaperBook pbook01 = new PaperBook("서블릿", 25000, 100);
//		PaperBook pbook02 = new PaperBook("자바의정석", 30000, 100);
//		PaperBook pbook03 = new PaperBook("토비의스프링", 50000, 100);
		Book pbook01 = new PaperBook("서블릿", 25000, 100);
		Book pbook02 = new PaperBook("자바의정석", 30000, 100);
		Book pbook03 = new PaperBook("토비의스프링", 50000, 100);
//	4. E-Book, PaperBook -> Store에 포함된다. (상점에서 책들을 입고)
//		store.setEBook(new EBook[]{ ebook01, ebook02});
//		PaperBook[] arrayPaperBook = new PaperBook[]{ pbook01, pbook02, pbook03};
//		store.setPaperBook(arrayPaperBook);
		store.setBook(new Book[]{ebook01,ebook02,pbook01,pbook02,pbook03});
//	5. store가 갖고있는 물건들을 출력.
	System.out.println(store.goodsInfo());

// 6. 아래와 같은 물품들을 상점에 입고.
	/* 
	 	로봇 1개(name, price, xPos, yPos)
	 		1. 토르 , 10000, X좌표 0 , Y좌표 0
	 	
	 	드론 2개(name, price, xPos, yPos, zPos)
	 		1. AD0001,300000, X좌표 0 , Y좌표 0 , Z좌표 0
	 		2. AD0002,400000, X좌표 0 , Y좌표 0 , Z좌표 0
	 */
	
		/*
		 * 폴리몰피즘 (polymorphism)
		 */
		Toy toy01 = new GroundToy("토르", 10000, 0, 0);
		
		Toy toy02 = new AirToy("ad0001", 300000, 0, 0, 0);
		Toy toy03 = new AirToy("ad0002", 400000, 0, 0, 0);
			
//		store.setGroundToy(new GroundToy[]{toy01});
//		store.setAirToy(new AirToy[]{toy02,toy03});
	
		store.setToy(new Toy[]{toy01, toy02, toy03});
	
	
	}
}
