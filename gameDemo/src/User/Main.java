package User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"password", "43387300660", "hilal", "anarsay", 1999);
		User user2 = new User(2,"password1234","21345678", "veli ", "ahmet", 1997);
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
		userManager.add(user2);
		
		Game game1 = new Game(1,"LOL" ,50.50);
		Game game2 = new Game(3,"Sims" ,99.50);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		
		Campaign campaign1 = new Campaign(1, "Black Friday", 30);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		
		OrderManager orderManager = new OrderManager();
		orderManager.payDiscounted(user2, game2,campaign1);
		orderManager.pay(user1, game1);
		
		

	}

}
