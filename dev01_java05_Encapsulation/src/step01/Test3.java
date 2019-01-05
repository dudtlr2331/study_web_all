package step01;

import java.util.Random;

public class Test3 {
		public static void main(String[] args) {
			int[] number = new int[10];
			
			for(int i=0; i<number.length; i++){
				number[i] = i; //배열을 0~9의 숫자로 초기화 한다.
				System.out.print(number[i]);
			}
			System.out.println();//출력값 한줄 띄기
			
			//문제
			//number 배열의 0번 째 값부터 9번째 값 까지 
			//for 문을 이용하여 값을 석으시오
			//예) 0123456789 - > 8296054713
			//필요한 변수는 추가하여도 상관 없음.
			//--------------------------------------------------//
			int rndInt = 0;
			int temp = 0;
			
			Random rnd = new Random();
			
			for(int i=0; i<number.length; i++) {
				rndInt = rnd.nextInt(10);
				temp = number[i];
				number[i] = number[rndInt];
				number[rndInt] = temp;
			}
			
			//--------------------------------------------------//
			for(int i=0; i<number.length; i++){
				//배열의 내용을 출력한다.
				System.out.print(number[i]);
			}
			/*-출력값---------------------------
			0123456789
		 	5173462098 //매번 값이 변경될 수 있다.
			--------------------------------*/
		}// end of main

}
