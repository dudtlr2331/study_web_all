package step03;

import java.util.Vector;


import step03.child.CheezePizza;
import step03.child.pineApplePizza;
import step03.child.potatoPizza;
import step03.parent.Pizza;
import step03.service.PizzaService;

public class TestApp {
	public static void main(String[] args) {
		PizzaService service = new PizzaService();
		Vector<Pizza> pizza = new Vector<Pizza>();
		//1. 피자 객체를 만든다. 치즈피자, 파인애플 피자, 토테이토 피자...
		Pizza p1 = new potatoPizza();
		Pizza p2 = new pineApplePizza();
		Pizza p3 = new CheezePizza();
		
		pizza.add(p1);
		pizza.add(p2);
		pizza.add(p3);
		
		//2. service에 deliveryPizza()를 호출...
		service.deliveryPizza(pizza);
		/*
		 치즈 피자를 배달한다...
		 파인애플 피자를 배달한다...
		  토테이토 피자를 배달한다...
		 */
	}
}
