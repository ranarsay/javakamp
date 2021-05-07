package odev5.business.abstracts;

import odev5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);
	void registerWithGoogle();
	void loginWithGoogle();

}
