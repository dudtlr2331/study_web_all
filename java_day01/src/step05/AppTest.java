package step05;

public class AppTest {

	public static void main(String[] args) {
		//1.독일산 엔진
		Engine e01 = new Engine("N001" , 1000);
			
		//2.소렌토
		Car car01 = new Car("소렌토" , 2000 , e01);
		
		//3. 미국산 엔진
		Engine e02 = new Engine("SUPER001" , 2000);
		
		//4. 소렌토(car01)에 엔진(e02)을 바꾸고 싶다...
		car01.setEngine(e02);
		
		//5. 내차(car01)의 이름을 출력해보시오.
		System.out.println("내차의 이름은??" + car01.getName());
		
		//6. 내차(car01)의 가격을 출력해보시오.
		System.out.println("내차의 가격은??" + car01.getPrice());

		//7 내차의 이름, 가격을 동시에 출력해보시오.
		System.out.println("내차의 정보 : " + car01.toString());

		//8. 독일산 엔진(e01)의 정보(이름 , 가격)를 출력.
		System.out.println("독일산 엔진의 정보?? : " + e01.toString());

		//9. 내 차(car01)의 엔진 이름을 출력해보시오 (e02.toString() x)
		System.out.println("내 차의 엔진 이름은??" + car01.getEngine().getName());
		
		//1o. 내차의 엔진 정보를 출력
		System.out.println("내차 엔진의 정보 ??" + car01.getEngine().toString());
		
		//11. 내차의 정보를 출력하면 내차정보 + 엔진정보 까지 모두 출력.
		System.out.println("내 차의 정보 : " + car01.getInfo());
	}

}

