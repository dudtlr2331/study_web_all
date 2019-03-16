package step04;

import step04.itf.DataInfo;
import step04.itf.DataSource;

/**
 * "메타데이터"
 * 데이터(여기서는 코드를 의미)를 위한 데이터.
 */
public class TestApp {
	public static void main(String[] args) {
//		DaTaInfo info = new DaTaInfo();
//		System.out.println(info.HOST);
//		
//		System.out.println(DaTaInfo.HOST);
//		System.out.println(DaTaInfo.SERVER_NAME);
		
//		DataSource source = new DataSource();
//		System.out.println(source.HOST);
		
//		DaTaInfo.HOST = "127.0.0.1";
		
		
		DataSource s = new DataSource();
		s.a();
		
		DataInfo.a();
		
	}
}