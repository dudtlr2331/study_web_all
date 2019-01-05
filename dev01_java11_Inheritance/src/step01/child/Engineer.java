package step01.child;

import step01.parent.Employee;
import step01.util.MyDate;

public class Engineer extends Employee{
	private String job;
	
	public Engineer(String name, double slary, MyDate birthDate, String job) {
		super(name, slary, birthDate);
		this.job = job;
	}
	
	public String getDetails() {
		return super.getDetails() + "\t" + job;
	}

}
