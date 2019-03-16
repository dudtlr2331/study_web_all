package step01.parent;
/*
 * 멤버 : 5개
 */
public class Animal {
	public String kind;
	public int weight;
	public char gender;
	
	public void eat() {
		System.out.println("eat....");
	}
	
	public String sleep(int hour) {
		return hour + "시간 zzz....";
	}
}
