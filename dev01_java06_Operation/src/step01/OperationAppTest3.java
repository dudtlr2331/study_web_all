package step01;

public class OperationAppTest3 {
		public static void main(String[] args) {
			int x = 2;
			int y = 2;
			System.out.println(x * y++);	//4,4
			System.out.println(x * ++y);	//8,8
	}
}
