package step01.test;

import step01.child.Engineer;
import step01.child.Manager;
import step01.parent.Employee;
import step01.util.MyDate;

public class AppTest {
	public static void main(String[] args) {
		//1. 이름 : 김준성, 봉급 : 2000, 생일 : 1988-04-20 인 Employee 객체를 만들고 정보 출력.
//		MyDate myDate = new MyDate(1988, 4, 20);
//		Employee employee = new Employee("김준성", 2000.0, myDate);
		Employee employee = new Employee("김준성", 2000.0, new MyDate(1988, 4, 20));
		System.out.println(employee.getDetails());
		
		//2. 이름 : 성영식, 봉급 : 4000, 생일 : 1999-10-18, 부서: Development 
		Manager manager = new Manager("성영식", 4000.0, new MyDate(1999, 10, 18), "Development");
		System.out.println(manager.getDetails());
		
//		3.Engineer 객체 1개를 만들어 getDetails()가 아래와 같이 출력 되도록 구현.
		Engineer engineer = new Engineer("김새봄", 10000.0, new MyDate(2011, 1, 24), "Publisher");
		System.out.println(engineer.getDetails());
		
	}
}

