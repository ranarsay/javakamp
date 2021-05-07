package odev5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class MemoryUserDao implements UserDao{
	
	public List<User> userList;
	
	public MemoryUserDao() {
		this.userList = new ArrayList<User>();
	}


	@Override
	public void add(User user) {
		this.userList.add(user);
		System.out.println("user" + user.getFirstName() + user.getFirstName() + "added to the system.");
		
	}

	@Override
	public void delete(User user) {
		this.userList.remove(user);
		System.out.println("user" + user.getFirstName() + user.getFirstName() + "deleted from the system.");
		
	}

	@Override
	public List<User> getAll() {
		return this.userList;
	}
	

}
