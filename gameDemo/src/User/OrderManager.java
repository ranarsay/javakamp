package User;

public class OrderManager implements OrderService{

	@Override
	public void pay(User user, Game game) {
		
		System.out.println(user.getFirstName() + " paid " + game.getUnitPrice() + " for " + game.getName());
		
	}

	@Override
	public void payDiscounted(User user, Game game, Campaign campaign) {
		
		System.out.println(user.getFirstName() + " paid " + (game.getUnitPrice()-((game.getUnitPrice()*campaign.getDiscount())/100)) + " for " + game.getName() +" in discount " );
		
	}
	

}
