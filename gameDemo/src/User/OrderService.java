package User;

public interface OrderService {
	
	void pay(User user, Game game);
	void payDiscounted(User user, Game game, Campaign campaing);

}
