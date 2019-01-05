package step01.parent;

import step01.util.MyDate;

public class Employee {
	public String name;
	public double slary;
	public MyDate birthDate;
	
	public Employee(String name, double slary, MyDate birthDate) {
		super();
		this.name = name;
		this.slary = slary;
		this.birthDate = birthDate;
	}
	
	public String getDetails() {
		//코딩...
		return name + "\t" + slary + "\t" + birthDate.getDetails();
	}
}
