package odev5;

import odev5.business.abstracts.UserService;
import odev5.business.concretes.LoginManager;
import odev5.business.concretes.UserManager;
import odev5.core.adapters.GoogleManagerAdapter;
import odev5.core.concretes.EmailVerificationManager;
import odev5.core.concretes.InfoCheckManager;
import odev5.dataAccess.concretes.MemoryUserDao;
import odev5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new LoginManager(new MemoryUserDao(), new InfoCheckManager(), 
				new EmailVerificationManager()), new GoogleManagerAdapter());
		
		User user = new User();
		user.setFirstName("Hilal");
		user.setLastName("Anarsay");
		user.setEmail("ranarsay@gmail.com");
		user.setPassword("password123");
		userService.register(user);
		
		userService.login("ranarsay@gmail.com", "password123");
		userService.registerWithGoogle();
		userService.loginWithGoogle();
		
		System.out.println("-------------------------------------------");
		
		User user2 = new User();
		user2.setFirstName("ali");
		user2.setLastName("veli");
		user2.setEmail("raail.com");
		user2.setPassword("password123");
		userService.register(user2);
		
		userService.login("ranarsay@gmail.com", "password123");
		userService.registerWithGoogle();
		userService.loginWithGoogle();
		
        System.out.println("-------------------------------------------");
		
		User user3 = new User();
		user3.setFirstName("ayşe");
		user3.setLastName("f");
		user3.setEmail("ayse@gmail.com");
		user3.setPassword("password123");
		userService.register(user3);
		
		System.out.println("-------------------------------------------");
		
		User user4 = new User();
		user4.setFirstName("Hilal");
		user4.setLastName("Anarsay");
		user4.setEmail("ranarsay@gmail.com");
		user4.setPassword("password123");
		userService.register(user4);
	
		

	}

}
