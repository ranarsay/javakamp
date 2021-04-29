package odev2;

public class Instructor {
	
	public void add(Course course) {
		System.out.println("The course "+  course.getCourseName() + " is available.");
	}
	
	public void delete(Course course) {
		System.out.println("The course "+  course.getCourseName() + " is not available.");
	}

}
