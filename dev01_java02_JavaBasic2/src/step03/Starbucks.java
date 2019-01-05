package step03;

public class Starbucks {
	private Coffee coffe;
	private String location;

	public String info() {
		return "로케이션 : " + location +" , 커피 [ " + coffe.info() + " ]";
	}//로케이션 : 범박점, 커피[ 이름 : 아메리카노, 가격: 4100 ]
	
	public Starbucks(String location, Coffee co01) {
		this.location = location;
		this.coffe = co01;
	}	
	
	public void setLocation(String location) {
		this.location = location;
	}
	
}
