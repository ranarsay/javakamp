package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student hilal = new Student();
		
		hilal.setStudentID(123);
		hilal.setFirstName("hilal");
		hilal.setLastName("anarsay");
		
		
		Instructor ali = new Instructor();
		ali.setInstructorID(456);
		ali.setFirstName("ali");
		ali.setLastName("veli");
		
		UserManager userManager = new UserManager();
		userManager.add(ali);
		userManager.add(hilal);
		
		StudentManager abc = new StudentManager();
		abc.done(hilal);
		
		InstructorManager xyz = new InstructorManager();
		xyz.upload(ali);
		
		
		
		
		
		
		

	}

}
