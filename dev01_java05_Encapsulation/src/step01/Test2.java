package step01;

public class Test2 {
	public static void main(String[] args) {
	      int[] score = {79, 88, 91, 33, 100, 55, 95};
	      
	      int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화 한다.
	      int min = score[0]; //배열의 첫 번째 값으로 최소값을 초기화 한다.
	      
	      //문제
	      //if와 for문을 이용하여 max 에는 score 배열의 최대값을 할당하고
	      //min 에는 최소값을 할당하시오
	      //--------------------------------------------------//
	      for(int i = 0; i < score.length; i++) {
	    	  if(score[i] > max)
	    		  max = score[i];
	    	  if(score[i] < min)
	    		  min = score[i];
	      }
	      
	      
	      //--------------------------------------------------//
	      System.out.println("최대값 : " + max);
	      System.out.println("최소값 : " + min);
	      /*-출력값---------------------------
	      최대값 : 100
	      최소값 : 33
	      --------------------------------*/
	      
	      
	   }
}
