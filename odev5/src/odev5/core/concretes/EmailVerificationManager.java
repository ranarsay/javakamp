package odev5.core.concretes;

import odev5.core.abstracts.EmailVerificationService;
import odev5.entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public boolean isVerified(User user) {
		System.out.println("email has been verified succesfully:  " + user.getEmail());
		return true;
	}

	@Override
	public void verifyEmail(User user) {
		System.out.println("click to verify email: " + user.getEmail());
	}

}
