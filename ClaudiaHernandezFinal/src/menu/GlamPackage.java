package menu;


//Class representing one of the menu options
public class GlamPackage implements MenuItem{
	private int price;
	int addGuest;
	double totalCost;


	GlamPackage() {
		price = 400;
		addGuest = 30;
	}
	
	@Override
	public String getName() {

		
		return "Glam Package";
	}

	@Override
	public String getDetails() {

		return "manicure and pedicure including nail polish with nail designs, haircut(just a trim), hairstyle, facial mask with cucumbers"
				+". Activities: diy bath bomb, lip balm and glittered hair"
				+". Time: 3 Hours";
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
