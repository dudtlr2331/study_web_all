package step01;

public class Ex1 {
	public static void main(String[] args) {
		int[] number = new int[10];
		for(int i=0; i<number.length; i++){
			System.out.print(number[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		int temp = 0;
		for(int i=0; i <number.length; i++){
			System.out.println("ffff");
			for(int j=0; j <number.length; j++) {
			//문제
			//임의의 10개의 수 number에 버블정렬을 적용하여 오름차순 정렬하시오.
			//--------------------------------------------------//
		      if(number[i] < temp) {
		    	 temp = number[i];
		    	 number[i] = number[j]; 
		    	 number[j] = number[i];
		      }
			}
			//--------------------------------------------------//
			System.out.println(number[i]);
		}//end for i
		/*-출력값---------------------------
		//임의로 바뀜.
		6507420967
		5064207679
		0542066779
		0420566779
		0204566779
		0024566779
		————————————————*/
	}
}
