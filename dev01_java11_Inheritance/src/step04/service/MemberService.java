package step04.service;

import step04.child.Empolyee;
import step04.child.Instructor;
import step04.child.Student;
import step04.parent.Person;

public class MemberService {
	public void printAllInfo(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			if (p[i] instanceof Student) {
				Student stu = (Student) p[i];
				stu.attend();
			}
			if (p[i] instanceof Empolyee) {
				Empolyee emp = (Empolyee) p[i];
				emp.planEducation();
			}
			if (p[i] instanceof Instructor) {
				Instructor ins = (Instructor) p[i];
				ins.sumScore();
			}
		}
	}
}