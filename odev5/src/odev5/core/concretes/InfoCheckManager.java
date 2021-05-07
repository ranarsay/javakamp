package odev5.core.concretes;

import odev5.core.abstracts.InfoCheckService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InfoCheckManager implements InfoCheckService {

	@Override
	public boolean checkEmail(String email) {
		
		Pattern pattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (!email.isEmpty() && matchFound) {
			return true;
		} else 
			System.out.println("Email is not valid");
		    return false;
	}

	@Override
	public boolean checkPassword(String password) {
		
		if (password.length() > 5) {
			return true;
		} else
			System.out.println("Password must contain at least 6 characters");
		    return false;
		
		
		
	}

	@Override
	public boolean checkFirstName(String firstName) {
		
		if(firstName.length() > 1) {
			return true;
		} else 
			System.out.println("First name must contain at least 2 characters");
		    return false;
	}

	@Override
	public boolean checkLastname(String lastName) {
		
		if(lastName.length() > 1) {
			return true;
		} else 
			System.out.println("Last name must contain at least 2 characters");
		    return false;
	}
	
	
	

}
