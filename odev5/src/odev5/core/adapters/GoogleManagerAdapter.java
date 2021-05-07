package odev5.core.adapters;

import GoogleService.concretes.GoogleLoginManager;
import odev5.core.abstracts.GoogleServices;

public class GoogleManagerAdapter implements GoogleServices{

	@Override
	public void register() {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.register();
		
	}

	@Override
	public void login() {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.login();
		
	}
	

}
 