package step02;


public class Baby {
	//변수
	private String name;
	private int age;
	private char gender;
	
	//생성자
	Baby(){
		System.out.println("응애 응애");
	}
	
	Baby(char gender, int age){
		//생성자 호출은 생성자 안에 1번만 호출할 수 있고 맨 윗줄에 있어야함.
		this();
		this.gender = gender;
		this.age = age;
	}
	
	//메서드
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Baby [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
