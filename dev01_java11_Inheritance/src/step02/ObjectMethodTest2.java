package step02;

/**
 *       Object                         |      String
 * equal()      :  객체의 주소값 비교(동등비교)      객체의 데이터값 비교
 * toString()   :  객체의 주소값 출력                      객체의 데이타값 출력
 */
public class ObjectMethodTest2 {
   public static void main(String[] args) {
      String s1 = new String("김준성");
      String s2 = "김새봄";
      String s3 = "성영식";
      System.out.println("s1 :: "+s1);
      System.out.println("s2 :: "+s2.toString());
      System.out.println("s3 :: "+s3.toString());
      System.out.println(s1.equals(s2));
      
      s1 = s2;
      System.out.println(s1.equals(s2));
      
   }
}


//class Object{
//   public String toString() {
//      return 객체의주소값을반환;
//   }
//}
//
//class String extends Object{
//   @Override
//   public String toString() {
//      return 문자열을반환;
//   }
//}
//
//class Person extends Object{
//   String name;
//   @Override
//   public String toString() {
//      return name;
//   }
//}