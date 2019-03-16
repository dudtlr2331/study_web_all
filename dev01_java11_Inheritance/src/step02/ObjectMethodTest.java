package step02;

public class ObjectMethodTest {
   public static void main(String[] args) {
      Person p = new Person();
      //데이터는 메서드를 통해 주입해야 한다.
//      p.name = "김준성";
//      System.out.println(p.name);
      
//      System.out.println(p.getName());
////      p.setName("김김김김준준준준성");
//      p.setName("김준성");
//      System.out.println(p.getName());
      
      Person p1 = new Person("김새봄", 30);
      Person p2 = new Person("성영식", 21);
      
      System.out.println(p1);
      System.out.println("p1 :: " + p1.toString());
      System.out.println("p2 :: " + p2.toString());
      System.out.println(p1.equals(p2));//false
      
      p1 = p2;
      System.out.println("p1 :: " + p1.toString());
      System.out.println("p2 :: " + p2.toString());
      System.out.println(p1.equals(p2));//true
      
   }
}

class Person{
   private String name;
   private int age;
   
   Person(){
	   
   }
   Person(String name, int age){
	   this.name = name;
	   this.age = age;
   } 
   
//   @Override
//   public String toString() {
//      return "hi";
//   }
   
   public void setName(String name) {
      if(name.length()>5) {
         System.out.println("이름은 5글자만 가능 합니다.");
         return;
      }
      this.name = name;
   }
   public String getName() {
      return this.name;
   }
}