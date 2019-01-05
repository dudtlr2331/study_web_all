package day01.step04;

public class School {
	private String name;
	private Teacher[] teacher;
	private Student[] student;
	
	School(String name){
		this.name = name;
	}
	
	//getter
	public Teacher[] getTeache(){
		return this.teacher;
	}
	public Student[] getStudent(){
		return this.student;
	}
	public String getName(){
		return this.name;
	}
	//setter
	public void setTeacher(Teacher[] teacher) {
		this.teacher = teacher;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	public void setName(String name) {
		this.name = name;
	}
}
