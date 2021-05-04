package User;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println("New game is added: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Game is deleted: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Game is updated: " + game.getName());
		
	}
	
	

}