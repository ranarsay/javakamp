package odev5.business.concretes;

import odev5.business.abstracts.LoginService;
import odev5.business.abstracts.UserService;
import odev5.core.abstracts.GoogleServices;
import odev5.entities.concretes.User;

public class UserManager implements UserService{
	
	private LoginService loginService;
	private GoogleServices googleService;

	public UserManager(LoginService loginService, GoogleServices googleService) {
		super();
		this.loginService = loginService;
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		System.out.println("Registered: " + user.getEmail());
		
	}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
		System.out.println("Logged in: " + email);
	}

	@Override
	public void registerWithGoogle() {
		googleService.register();
		
	}

	@Override
	public void loginWithGoogle() {
		googleService.login();
	}

}
