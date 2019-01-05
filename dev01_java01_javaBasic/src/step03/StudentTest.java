package step03;

public class StudentTest {
	public static void main(String[] args) {
		//나이 : 22, 이름 : 성영식
		//나이 : 31, 이름 : 김준성
		//나이 : 29, 이름 : 김새봄
		System.out.println("나이 : 22, 이름 : 성영식");
		System.out.println("나이 : 31, 이름 : 김준성");
		System.out.println("나이 : 29, 이름 : 김새봄");
		
		//변수로 빼서 다시 작성
		String name1 = "성영식";
		String name2 = "김준성";
		String name3 = "김새봄";
		
		int age1 = 22;
		int age2 = 31;
		int age3 = 29;
		
		System.out.println("나이 : " +age1+", 이름 : "+name1+"");
		System.out.println("나이 : " +age2+", 이름 : "+name2+"");
		System.out.println("나이 : " +age3+", 이름 : "+name3+"");
		
		// 3. Object Oriented Programming 적용.
		Student s1 = new Student("성영식", 20);
		Student s2 = new Student("김준성", 31);
		Student s3 = new Student("김새봄", 29);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return "나이 : " + age + ", 이름 : " + name;
	}
}
