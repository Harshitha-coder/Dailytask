class ShopTester
{
	public static void main(String[] args)
	{
		GroceryShop gs=new GroceryShop("Shankar","Harshitha","Chickballapur","GST2345567");
		gs.setBudget(30000);
		gs.setType(ShopType.SUPERMARKET);
		gs.setBillingType(BillingType.CREDIT);
		gs.setHomeDelivery(true);
		gs.setAmbience(true);
		gs.setOpenTime(7.30);
		gs.setWholesale(true);
		gs.setCloseTime(9.30);
		gs.setParking(true);
		gs.setNoOfWorkers(4);
		gs.setLargeScale(true);
		gs.setProfit(50000);
		String[] items=new String[3];
		items[0]="Noodels";
		items[1]="DryFruits";
		items[2]="Basmathi";
		gs.setIsoCertifiedItems(items);
		gs.setPackageType("Food");
		gs.setOnlineAvailable(true);
		gs.setCustomerFeedback("Good");
		gs.displayIsoCertifiedItems();
		gs.onlineDelivery();
		gs.displayProperties();
	}
}