package odev3;

public class UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " added as student");
	}
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " added as instructor");
	}

}
