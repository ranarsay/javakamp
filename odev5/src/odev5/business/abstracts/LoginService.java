package odev5.business.abstracts;

import odev5.entities.concretes.User;

public interface LoginService {
	
	boolean isEmailExists(String email);
	void register(User user);
	void login(String email, String password);

}
