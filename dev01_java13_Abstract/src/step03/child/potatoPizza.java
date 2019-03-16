package step03.child;

import step03.parent.Pizza;

public class potatoPizza extends Pizza{

	@Override
	protected String makePizza() {
		return "포테이토 피자";
	}

}
