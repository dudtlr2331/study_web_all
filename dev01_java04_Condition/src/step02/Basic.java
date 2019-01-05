package step02;

public class Basic {

   public static void main(String[] args) {
      /*
       * 성적이 90~100점인 경우는 A학점을 출력 
       * 성적이 80~89점인 경우는 B학점을 출력
       * 성적이 70~79점인 경우는  C학점을
       * 출력 성적이 그외인 경우는 "Try Again"을 출력
       */
      step03(69);
      
   }
   
   public static void step01() {
      String key = "냉장고";
      switch (key) {
      case "냉장고": 
         System.out.println("상품은 냉장고 입니다. 축하합니다.");
         break;
      case "컴퓨터": 
         System.out.println("상품은 컴퓨터 입니다. 축하합니다.");
         break;
      default:
         System.out.println("꽝입니다.");
         break;
      }
   }
   
   public static void step02() {
      String key = "냉장고";
      switch (key) {
      case "컴퓨터": 
         a();
      case "냉장고": 
         System.out.println("상품은  냉장고, 문화상품권 입니다. 축하합니다.");
      case "문화상품권": 
         System.out.println("상품은 문화상품권 입니다. 축하합니다.");
         break;
      default:
         System.out.println("꽝입니다.");
         break;
      }
   }
   
   public static void step03(int score) {
      String grade = "";
      switch (score) {
      case 100:case 99:case 98:case 97:case 96:
      case 95:case 94:case 93:case 92:case 91:case 90:
         grade = "A";
         break;
      case 89:case 88:case 87:case 86:case 85:
      case 84:case 83:case 82:case 81:case 80:
         grade = "B";
         break;
      case 79:case 78:case 77:case 76:case 75:
      case 74:case 73:case 72:case 71:case 70:
         grade = "C";
         break;
      default:
         grade = "Try Again";
         break;
      }
      System.out.println(grade);
   }
   
   public static void a() {
      System.out.println("상품은 컴퓨터, 냉장고, 문화상품권 입니다. 축하합니다.");
   }
   
}