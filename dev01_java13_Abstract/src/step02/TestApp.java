package step02;

import step02.impl.Division;
import step02.impl.Minus;
import step02.impl.Multiply;
import step02.impl.Plus;

public class TestApp {
	public static void main(String[] args) {
		CalCul cal1 = new Plus();
		CalCul cal2 = new Minus();
		CalCul cal3 = new Multiply();
		CalCul cal4 = new Division();
		CalCul ca15 = new CalCul() {
			
			@Override
			protected double doIt(int a, int b) {
				return (a * a + b);
			}
		};
		
		cal1.calcul(1, 2);
		cal2.calcul(2, 1);
		cal3.calcul(2, 1);
		cal4.calcul(2, 1);
		ca15.calcul(2, 1);
		
	}
}
