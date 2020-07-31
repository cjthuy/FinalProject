package menu;


//Class representing one of the menu options
public class VipPackage implements MenuItem{
	private int price;
	int addGuest;
	double totalCost;


	VipPackage() {
		price = 600;
		addGuest = 40;
		
	}

	@Override
	public String getName() {
		
		return "Vip Package";
	}

	@Override
	public String getDetails() {
	
		return "manicure and pedicure including nail polish with nail designs, haircut(just a trim), hairstyle, facial mask with cucumbers and shimmering makeup application, hand painting designs"
				+". Activities: diy bath bomb, lip balm, bead bracelet, glittered hair, and fun runway show"
				+". Time: 4-5 Hours";
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

