package step01;

/*
 * Encapsulation - 캡슐화.
 * 변수는 외부에서 접근하지 못하게 하고
 * 메서드를 통한 주입만 가능하게 한다.
 * 메서드에서 값을 체크 하기 때문.
 */
public class Date {
   private int year;
   private int month;
   private int day;
   
   public int getYear() {
      return year;
   }
   public void setYear(int year) {
      this.year = year;
   }
   public int getMonth() {
      return month;
   }
   public void setMonth(int month) {
	   if(month >= 1 && month <= 12) {
		   this.month = month;
	  }else this.month = 0;
   }
   public int getDay() {
      return day;
   }
   public void setDay(int day) {
	   if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		   if(day >= 1 && day <= 31)
			   this.day = day;
		   else this.day = 0;
	   }else if(month == 4 || month == 6 || month == 9 || month == 11) {
		   if(day >= 1 && day <= 30)
			   this.day = day;
		   else this.day = 0;
	   }else if(month == 2) {
		   if(day >= 1 && day <= 28)
			   this.day = day;
		   else this.day = 0;
	   }
   }
   public String toDay() {
	   if(month != 0 && day != 0)
	   return year + "-" + month + "-" + day;
	   else return "유효한 날짜가 아닙니다.";
   }
}