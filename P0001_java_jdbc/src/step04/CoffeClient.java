package step04;

import java.util.Scanner;
import step04.service.coffeService;

/*
 * 서비스를 이용하는 클라이언트
 */
public class CoffeClient {
	public static void main(String[] args) {
		CoffeClient app = new CoffeClient();
				while(true) {
				int inputWord = app.showMenu();
			
				switch(inputWord) { 
				case 1:
					app.insertMenu();
					break;
				case 2:
					app.updateMenuOne();
					break;
				case 3:
					app.deleteMenuOne();
					break;
				case 4:
					app.selectMenuOne();
					break;
				case 5:
					app.selectMenuAll();
					break;
				default:
					System.exit(-1);
					break;
				}
				
			  }
						
	}

	private int showMenu() {
		System.out.println("원하시는 메뉴를 입력 하세요.");
		System.out.println("1 : 메뉴 등록");
		System.out.println("2 : 메뉴 수정");
		System.out.println("3 : 메뉴 삭제");
		System.out.println("4 : 메뉴 가격 보기");
		System.out.println("5 : 전체 메뉴 보기");
		return new Scanner(System.in).nextInt();
		}
	//메뉴 등록
	public void insertMenu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력 하세요.");
			String name = sc.next();
			System.out.println("가격을 입력 하세요.");
			int price = sc.nextInt();			
			coffeService jdbc = new coffeService();
			jdbc.insertMenu(name , price);
			
			System.out.println("입력한 정보는 다음과 같습니다.");
			System.out.println("이름 :" + name + ", 가격 : " + price);
		}
		
	//메뉴 수정
		public void updateMenuOne() {
			Scanner sc = new Scanner(System.in);
			System.out.println("변경 할 메뉴를 입력 하세요.");
			String name = sc.next();
			System.out.println("가격를 입력 하세요.");
			int price = sc.nextInt();
			
			coffeService jdbc = new coffeService();
			jdbc.updateMenuOne(name,price);
		}
	//메뉴 삭제
		public void deleteMenuOne() {
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제 할 메뉴를 입력 하세요.");
			String name = sc.next();
			
			coffeService jdbc = new coffeService();
			jdbc.deleteMenuOne(name);
		}
	//메뉴 가격 보기
		public void selectMenuOne() {
			Scanner sc = new Scanner(System.in);
			System.out.println("찾으실 메뉴를 입력 해주세요.");
			String name = sc.next();
			
			coffeService jdbc = new coffeService();
			jdbc.selectMenuOne(name);
		}
	//전체 메뉴
		public void selectMenuAll() {
			coffeService jdbc = new coffeService();
			jdbc.selectMenuAll();
		}
	}

