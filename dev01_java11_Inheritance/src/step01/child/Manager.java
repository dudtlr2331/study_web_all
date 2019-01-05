package step01.child;

import step01.parent.Employee;
import step01.util.MyDate;

/**
 * 맴버 5( 필드 4, 메서드 1)
 */
public class Manager extends Employee{
	private String job;
	
	public Manager(String name, double salary, MyDate birthDate, String job) {
		super(name, salary, birthDate);
		this.job = job;
	}

	@Override
	public String getDetails() {
//		return super.name + "\t" + super.salary + "\t" + super.birthDate.getDetails() + "\t" + this.job;
		return super.getDetails() + "\t" + this.job;
	}
}