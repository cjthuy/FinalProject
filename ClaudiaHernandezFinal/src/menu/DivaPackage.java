package menu;



//Class representing one of the menu options
public class DivaPackage implements MenuItem{
	private int price;
	int addGuest;
	double totalCost;
	

	DivaPackage() {
		price = 300;
		addGuest = 20;
	}
	
	@Override
	public String getName() {
		
		return "Diva Package";
	}

	@Override
	public String getDetails() {
	
		return "manicure and pedicure including nail polish,  facials and hairstyles"
				+ ".  Activities: slipper decorating, diy bath bomb"
				+ ".  Time: 2 Hours";
	}

	@Override
	public int getBasePrice() {
	
		return price;
	}

	@Override
	public int getTotalGuestPrice(int additionalGuestTotal) {
		int getTotalGuestPrice = addGuest * additionalGuestTotal;
		
		return getTotalGuestPrice;
	}

	@Override
	public int getAddOnPrice() {
		return addGuest;
	} 
	

}	

