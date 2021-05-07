package GoogleService.concretes;

import GoogleService.abstracts.GoogleLoginSerivce;

public class GoogleLoginManager implements GoogleLoginSerivce{

	@Override
	public void register() {
		System.out.println("Registered with Google");
		
	}

	@Override
	public void login() {
		System.out.println("Logged with Google");
		
	}

}
