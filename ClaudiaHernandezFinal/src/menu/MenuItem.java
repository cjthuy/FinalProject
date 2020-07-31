package menu;

//interface, all MenuItems must implement this
public interface MenuItem {
	public int getBasePrice();
	public int getAddOnPrice();
	public int getTotalGuestPrice(int additionalGuestTotal);
	public String getName();
	public String getDetails();
}
