package User;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign added: " + campaign.getName());
		System.out.println("Discount amount : " + campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Campaign is over: " + campaign.getName());
		
		
	}



}
