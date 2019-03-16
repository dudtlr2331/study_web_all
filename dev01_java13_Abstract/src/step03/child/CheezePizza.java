package step03.child;

import step03.parent.Pizza;

public class CheezePizza extends Pizza{

	@Override
	protected String makePizza() {
		return "치즈 피자";
	}

}
