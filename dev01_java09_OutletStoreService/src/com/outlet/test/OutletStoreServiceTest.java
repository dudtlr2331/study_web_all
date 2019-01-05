package com.outlet.test;

import com.outlet.service.OutletStoreService;
import com.outlet.util.MyDate;
import com.outlet.vo.CustomerVO;
import com.outlet.vo.ProductVO;

public class OutletStoreServiceTest {
	public static void main(String[] args) {
		//고객 생성.
		CustomerVO[] cust = { 
			new CustomerVO("111", "이나영", "방배동", 123),
			new CustomerVO("222", "원빈", "방배동", 321) 
		};

		//상품 구매 리스트1
		ProductVO[] pros1 = {
			new ProductVO("진라면", 3000, new MyDate(2015, 4, 13), 123),
			new ProductVO("치토스", 1500, new MyDate(2015, 2, 10), 143),
			new ProductVO("구구콘", 1000, new MyDate(2015, 1, 13), 321),
			new ProductVO("빵", 1000, new MyDate(2015, 2, 21), 432) 
		};
		
		//상품 구매 리스트2
		ProductVO[] pros2 = {
			new ProductVO("처음처럼", 1500, new MyDate(2015, 4, 2), 113),
			new ProductVO("경기미", 110000, new MyDate(2015, 5, 13), 432)
		};
		
		
		OutletStoreService service = new OutletStoreService();
		
		// 특정 고객이 상품을 구매함..
		cust[0].buyProduct(pros1);
		cust[1].buyProduct(pros2);
		
		//모든 회원의 리스트 호출.
		/* 결과값은 아래와 같다.
		 ===== 다음은 고객들의 정보입니다 =====
		 이나영 방배동
		 원빈 방배동
		 */
		service.printAllCustomers(cust);
		
		//cust[1] 고객의 모든 상품 리스트 표시.
		/* 결과값은 아래와 같다.
		 ==== 이나영고객이 구매하신 상품 목록=====
		 진라면 
		 치토스 
		 구구콘 
		 빵 
		 
		 ==== 원빈고객이 구매하신 상품 목록=====
		 처음처럼 
		 경기미 
		 */
		service.printAllProductMaker(cust[0]);  
		service.printAllProductMaker(cust[1]);  
		
		//cust[1] 고객의 10만원 이상의 물품 출력
		/* 결과값은 아래와 같다.
		 ==== 10만원 이상의 고가 상품들 입니다 ====
		 원빈님께서 구입하신 물건 중에서 고가 상품은...
		 경기미 110000
		 */
		service.getExpensiveProduct(cust[1]);

		//최고가 표시.
		/* 결과값은 아래와 같다.
		 ==== 고객님이 구입한 상품중 가장 고가 상품입니다 ====
		 이나영 님이 구입하신 물건중 가장 고가는3000입니다
		 ==== 고객님이 구입한 상품중 가장 고가 상품입니다 ====
		 이나영 님이 구입하신 물건중 가장 고가는11000입니다
		 */
		int max = service.maxPriceProduct(cust[0]);
		System.out.println(cust[0].getName() + " 님이 구입하신 물건중 가장 고가는"+ max+ "입니다");
		max = service.maxPriceProduct(cust[1]);
		System.out.println(cust[1].getName() + " 님이 구입하신 물건중 가장 고가는"+ max+ "입니다");

	}

}
