package step02.service;

import step02.vo.Employee;
import step02.vo.Engineer;
import step02.vo.Manager;

public class EmployeeService {
	// 1. 특정한 객체의 정보를 출력하는 기능 (한명) / 배열에서 for문 돌리지 말아라 / 부모 안에서 자동할당
	public void printInfo(Employee emp) {
		if (emp instanceof Manager) {
			Manager m = (Manager) emp;
			System.out.println(m);
		}else if(emp instanceof Engineer) {
			Engineer en = (Engineer) emp;
			System.out.println(en);
		} else {
			System.out.println(emp);
		}
	}

	// 2. 모든 객체들의 정보를 출력하는 기능
	public void printAllInfo(Employee[] emp) {
		for (Employee e : emp) {
			printInfo(e);
		}
	}

	// 3. Test 클래스에서 넘겨받은 empId의 값과 일치하는 객체를 리턴하는 기능 / empId을 통해서 Employee 찾는것
	public Employee findByEmpId(Employee[] emp, String empId) { // empId 전체를 //
		Employee e = null;
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].getEmpId().equals(empId)) {
				e = emp[i];
				break;
			}
		}
		
		return e;
	}

	// 4. Test 클래스에서 넘겨받은 addr의 값과 일치하는 객체를 리턴하는 기능 / addr를 통해서 Employee 찾는것
	public Employee[] findByAddr(Employee[] emp, String addr) {
		Employee[] e = new Employee[emp.length];
		int count = 0;
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].getAddr().equals(addr)) {
				e[count] = emp[i];
				count++;
			}
		}
		return e;
	}
     
	
	// 5. 특정한 Employee의 연봉을 리턴하는 기능.. 1년 / 특정한 : 배열을 넣지 않는다
	public int getAnnualSalary(Employee emp) {
		int annualSalary = emp.getSalary() * 12;
		if (emp instanceof Engineer) {
			Engineer eg = (Engineer) emp;
			annualSalary = eg.getSalary() * 12 + eg.getBonus();
		}
		return annualSalary;
	}

	// 6. 연간 총 인건비의 총액을 리턴하는 기능...
	public int getTotalCost(Employee[] emp) {
		int totalcost = 0;
		for (int i = 0; i < emp.length; i++) {
			totalcost += getAnnualSalary(emp[i]);
		}
		return totalcost;
	}
}
