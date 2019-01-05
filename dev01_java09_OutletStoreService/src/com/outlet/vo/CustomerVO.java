package com.outlet.vo;

public class CustomerVO {
	private int tel;
	private String ssn;
	private String name; 
	private String addr;
	
	ProductVO[] products;

	
	
	public CustomerVO(String ssn, String name, String addr, int tel) {
		super();
		this.tel = tel;
		this.ssn = ssn;
		this.name = name;
		this.addr = addr;
	}

	public int getTel() {
		return tel;
	}

	public String getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public ProductVO[] getProducts() {
		return products;
	}
	
	/**
	 * 전화번호 변경
	 */
	public void changTel(int tel) {
		this.tel = tel;
	}
	
	/**
	 * 주소 변경
	 */
	public void chanAddr(String addr) {
		this.addr = addr;
	}
	
	/**
	 * 물건 구입
	 */
	public void buyProduct(ProductVO[] products) {
		this.products = products;
	}
	
}
