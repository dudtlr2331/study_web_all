package step03.service;

import java.util.Vector;

import step03.parent.Pizza;

public class PizzaService {
	
	//인자로 받은 피자를 배달한다...
	public void deliveryPizza(Vector<Pizza> pizza) {
		for(int i = 0; i < pizza.size(); i++) {
			pizza.get(i).delivery();
		}
	}
}
