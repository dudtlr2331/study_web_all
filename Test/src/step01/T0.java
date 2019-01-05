package step01;

public class T0 {
	public static void main(String[] args) {
		
			int[] number = new int[10];
			int[] counter = new int[10];
			
			for(int i=0; i<number.length; i++){
				System.out.print(number[i] = (int)(Math.random() * 10));
			}
			System.out.println();
			
			//문제
			//number에는 임의의 정수 10자리가 들어간다.
			//counter는 임의의 정수 number의 0부터9까지 숫자의 갯수를 담는다.
			//0번방엔 0의 갯수가, 1번방엔 1의 갯수가....
			//counter배열에 갯수를 담아 출력하시오.
			//--------------------------------------------------//
			for(int i=0; i<number.length; i++) {
				counter[number[i]]++;
			}
			      
			      
			//--------------------------------------------------//
			for(int i=0; i<number.length; i++){
				System.out.println(i + "의 개수 :" + counter[i]);
			}
			/*-출력값---------------------------
			//임의로 바뀜.
			9639693181
			0의 개수 :0
			1의 개수 :2
			2의 개수 :0
			3의 개수 :2
			4의 개수 :0
			5의 개수 :0
			6의 개수 :2
			7의 개수 :0
			8의 개수 :1
			9의 개수 :3
			--------------------------------*/
	}
}
