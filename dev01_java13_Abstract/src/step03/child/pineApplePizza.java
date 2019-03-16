package step03.child;

import step03.parent.Pizza;

public class pineApplePizza extends Pizza{

	@Override
	protected String makePizza() {
		return "파인애플 피자";
	}

}
