package com.outlet.service;

import java.util.Arrays;

import com.outlet.vo.CustomerVO;

public class OutletStoreService {
	public void printAllCustomers(CustomerVO[] cust) {
		System.out.println("===== 다음은 고객들의 정보입니다 =====");
		for(CustomerVO c : cust) {
			System.out.print(c.getName() + " ");
			System.out.println(c.getAddr());
		}
		
	}

	public void printAllProductMaker(CustomerVO cust) {
		System.out.println("==== "+ cust.getName() +"고객이 구매하신 상품 목록=====");
		for(int i = 0; i <cust.getProducts().length; i++ )
		System.out.println("maker : " + cust.getProducts()[i].getMaker());
	}

	public void getExpensiveProduct(CustomerVO cust) {
		System.out.println("==== 10만원 이상의 고가 상품들 입니다 ====");
		System.out.println(cust.getName() +"님께서 구입하신 물건 중에서 고가 상품은...");
		
		for(int i = 0; i <cust.getProducts().length; i++ ) {
			if(cust.getProducts()[i].getPrice() > 100000) {
				System.out.print(cust.getProducts()[i].getMaker() + " ");	
				System.out.println(cust.getProducts()[i].getPrice());
			}
		}
	}

	public int maxPriceProduct(CustomerVO cust) {
		int max = cust.getProducts()[0].getPrice();
	
		for(int i = 0; i <cust.getProducts().length; i++ ) {
			if(cust.getProducts()[i].getPrice() > max) {
				max = cust.getProducts()[i].getPrice();
			}		
		}
		
		return max;
	}
	
}
