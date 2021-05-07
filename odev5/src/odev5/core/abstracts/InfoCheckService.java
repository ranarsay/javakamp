package odev5.core.abstracts;

public interface InfoCheckService {
	
	boolean checkEmail(String email);
	boolean checkPassword(String password);
	boolean checkFirstName(String firstName);
	boolean checkLastname(String lastName); 

}
