package odev2;

public class Course {
	int ID;
	String courseName;
	int instructorID;
	
	public Course(int ID, String courseName, int instructorID) {
		this.ID = ID;
		this.courseName = courseName;
		this.instructorID =instructorID;
		
	}
	public Course() {}
	
	public int getID() {
		return ID;
	}
	public void seID(int ID) {
		this.ID = ID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getInstructorID() {
		return instructorID;
	}
	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}
	
	
	
	

}
