package step01.vo;

public class Member {
	public String name = "성영식";
	public static String classNo = "병아리반";
	
	public static void printName() {
		Member m = new Member(); 
	// System.out.println(this.name); 불가능
		System.out.println(m.name);
		
		System.out.println(Member.classNo);
		System.out.println(classNo); //같은 static이기 때문에 가능
	}
}
