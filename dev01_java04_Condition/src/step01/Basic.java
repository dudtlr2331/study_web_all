package step01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Basic {

   public static void main(String[] args) {
      //조건문 if, switch if(불리언값) switch(값) case(불리언값)
      
      boolean b = true;
      if(b) System.out.println("이값은 항상 출력된다.");
      if(!b) System.out.println("이값은 항상 출력 안된다.");
      
      if(true) System.err.println("a");
      else System.err.println("b");
      
//      Scanner s = new Scanner(System.in);
//      String inputValue = s.nextLine();
      
//      String inputValue = JOptionPane.showInputDialog("값을 입력하세요.");
      
//      if("".equals(inputValue)) {
//         System.err.println("값을 입력하세요.");
//      }
      
      // &, |, &&, ||
      /*
       *  모두 참일때 참.
       *  true & true = true
       *  true & false = false
       *  true & false & false = false
       *  
       *  하나라도 참일때 참.
       *  true | true = true
       *  true | false = true
       *  true | false | true = true
       *  
       *  (true & false) | true = 
       *  
       */
      
      
      /*
       * 성적이 90~100점인 경우는 A학점을 출력 
       * 성적이 80~89점인 경우는 B학점을 출력
       * 성적이 70~79점인 경우는  C학점을
       * 출력 성적이 그외인 경우는 "Try Again"을 출력
       * 
       */
      int score = 90;
//      
//      if(score >= 90 && score <= 100) System.out.println("A학점");
//      else if(score >= 80 && score <= 89) System.out.println("B학점");
//      else if(score >= 70 && score <= 79) System.out.println("C학점");
//      else System.out.println("Try Again");
    
      
//    if(true) {
//    if(true) {
//       System.out.println("hi");
//    }
// }
 /*
    90점 이상일때 A이고 
       98점 이상 이면 +를 붙이고 94점이하면 -를 붙여라
    80점 이상일때 B이고
       88점 이상 이면 +를 붙이고 84점이하면 -를 붙여라
    그외 나머지는 C (이중 if를 사용하여 작성)
 */

      String inputValue = JOptionPane.showInputDialog("성적을 입력하세요.");
      score = Integer.parseInt(inputValue);
      
      if(score >= 90) {
    	  if(score >= 98) {
    		  System.out.println("+A");
    	  }else if(score <= 94) {
    		  System.out.println("-A");
    	  } 	  
      }
      else if(score >= 80) {
    	  if(score >= 88) {
    		  System.out.println("+B");
    	  }else if(score <= 84) {
    		  System.out.println("-B");
    	  } 	  
      }
    else System.out.println("C학점");
      
      
      
      
      
   }

}