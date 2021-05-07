package odev5.business.concretes;

import odev5.business.abstracts.LoginService;
import odev5.core.abstracts.EmailVerificationService;
import odev5.core.abstracts.InfoCheckService;
import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class LoginManager implements LoginService{
	
	private UserDao userDao;
	private InfoCheckService checkService;
	private EmailVerificationService verifyEmail;
	

	public LoginManager(UserDao userDao, InfoCheckService checkService, EmailVerificationService verifyEmail) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.verifyEmail = verifyEmail;
	}

	@Override
	public boolean isEmailExists(String email) {
		for (User user : userDao.getAll()) {
			if (user.getEmail() == email) {
				throw new ArithmeticException("This email is already in use by another user");
			}
		}
		return true;
		
	}

	@Override
	public void register(User user) {
		this.isEmailExists(user.getEmail());
		
		if (checkService.checkEmail(user.getEmail())) {
		 System.out.println("email check - successful");
		}
		if (checkService.checkFirstName(user.getFirstName())) {
			System.out.println("name check - successful");
		}
		
		if (checkService.checkLastname(user.getLastName())) {
			System.out.println("last name is check - successful");
		}
		
		if (checkService.checkPassword(user.getPassword())) {
			System.out.println("password check - successful");
		}
		
		
		verifyEmail.verifyEmail(user);
		verifyEmail.isVerified(user);
		userDao.add(user);
		System.out.println("user is registered: " + user.getEmail());
		
	}

	@Override
	public void login(String email, String password) {
		if (checkService.checkEmail(email)) {
			return;
		}
		if (checkService.checkPassword(password)) {
			return;
		}
		for (User user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
				return;
			}
		}
		System.out.println("Could not logged in. Please try again.");

	}


		
	}


