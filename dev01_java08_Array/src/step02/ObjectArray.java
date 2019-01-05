package step02;

public class ObjectArray {
	public static void main(String[] args) {
		Member[] list;
		list = new Member[3];
		list[0] = new Member("김새봄",28);
		list[1] = new Member("성영식",20);
		list[2] = new Member("김준성",31);
		
		Member[] list1 = {
			new Member("김새봄",28), 
			new Member("성영식",20), 
			new Member("김준성",31)
		};
		
		int[] intList;
		intList = new int[3];
		intList[0] = 1;
		intList[1] = 2;
		intList[2] = 3;
		
	}
}

class Member extends Object{
	String name;
	int age;
	public Member() {
		super();
	}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}