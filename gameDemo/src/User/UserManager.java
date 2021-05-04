package User;

public class UserManager implements UserService{
	
	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		
		if(userCheckService.validate(user)) {
			System.out.println("Submission is succesfull");
			
		}else {
			System.out.println("User info is missing, please check again: " + user.getFirstName());
		}
		
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println("User deleted: " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("User info is updated: " + user.getFirstName());
		
	}
	
	
	

}
