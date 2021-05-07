package odev5.core.abstracts;

import odev5.entities.concretes.User;

public interface EmailVerificationService {
	
	boolean isVerified(User user);
	void verifyEmail(User user);
	
	
	

}
