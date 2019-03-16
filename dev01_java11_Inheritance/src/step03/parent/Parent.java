package step03.parent;

/**
 *  맴버 : 4개
 *  접근지정자는 : public > protected > default > private
 */
public class Parent {
	public String publicTest = "publicTest";
	protected String protectedTest = "protectedTest";
	String defaultTest = "defaultTest";
	private String privateTest = "privateTest";
	
	public Parent(){
		System.out.println("Parent Create!!!");
	}
	
	public void access() {
		System.out.println("Parent!!!");
	}
}