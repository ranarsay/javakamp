package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course(2, "Java" ,123);
		
		course1.seID(1);
		course1.setCourseName("React");
		course1.setInstructorID(456);
		
		Course[] courses = new Course[] {course1, course2};
		
		for(Course course:courses) {
			System.out.println("Course name is " + course.getCourseName());
			System.out.println("Course ID is " + course.getID());
			System.out.println("Course instructor ID is " + course.getInstructorID());
			
		}
		
		Instructor inst1 = new Instructor();
		Instructor inst2 = new Instructor();
		
		inst1.add(course1);
		inst2.add(course2);
		inst1.delete(course1);
		

	}

}
