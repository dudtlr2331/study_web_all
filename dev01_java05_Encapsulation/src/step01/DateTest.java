package step01;

public class DateTest {
   public static void main(String[] args) {
      /*
       * Month - 1 ~ 12
       * Day - 28, 30, 31
       * 
       * 에러시
       * "유효한 날짜가 아닙니다."
       * 
       */
      Date date = new Date();
      date.setYear(2018);
      date.setMonth(2);
      date.setDay(28);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(2);
      date.setDay(30);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(3);
      date.setDay(31);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(3);
      date.setDay(32);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(13);
      date.setDay(32);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(13);
      date.setDay(1);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(4);
      date.setDay(31);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(5);
      date.setDay(31);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(6);
      date.setDay(1);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(6);
      date.setDay(25);
      System.out.println(date.toDay());
      date.setYear(2018);
      date.setMonth(6);
      date.setDay(30);
      System.out.println(date.toDay());
   }
}