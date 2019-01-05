package step01;

public class Ex2 {
	public static void main(String[] args) {
		int[] number = new int[10];
		
		for(int i=0; i<number.length; i++){
			number[i] = (int)(Math.random() * 10);
			System.out.print(number[i]);
		}
		
		System.out.println();
		
		int temp = 0;
		for(int i=1; i <number.length; i++){
			for(int j=0; j <number.length - i; j++) {
		      if(number[j] < number[j+1]) {
		    	 temp = number[j];
		    	 number[j] = number[j + 1]; 
		    	 number[j + 1] = temp;
		      }
			}
			System.out.println(number[i]);
		}
	}
}

