package day02.step02;

public class Person {
	String name;
	int age;
	
	public void addAge() {
		//this.age = this.age + 1;
		this.age += 1;
	}
	
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
	 return  "Person [ name = "+ this.name + " , age = " + this.age + "]";
	}
}
