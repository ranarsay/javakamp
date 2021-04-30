package odev3;

public class StudentManager extends UserManager {
	
	public void done(Student student) {
		
		System.out.println( "Homework is done by student " + student.getStudentID() );
	}

}
