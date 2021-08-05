class GroceryShop extends Shop
{
	boolean largeScale;
	double profit;
	String[] isoCertifiedItems;
	String packageType;
	boolean onlineAvailable;
	String customerFeedback;
	
GroceryShop(String name,String ownerName,String location,String gstNo)
{
	super.name=name;
	super.ownerName=ownerName;
	super.location=location;
	super.gstNo=gstNo;
}
void setLargeScale(boolean largeScale)
{
	this.largeScale=largeScale;
}
void setProfit(double profit)
{
	this.profit=profit;
}
void setIsoCertifiedItems(String[] isoCertifiedItems)
{
	this.isoCertifiedItems=isoCertifiedItems;
}
void setPackageType(String packageType)
{
	this.packageType=packageType;
}
void setOnlineAvailable(boolean onlineAvailable)
{
	this.onlineAvailable=onlineAvailable;
}
void setCustomerFeedback(String customerFeedback)
{
	this.customerFeedback=customerFeedback;
}

void displayIsoCertifiedItems()
{
	if(this.isoCertifiedItems!=null)
	{
		for(int i=0;i<this.isoCertifiedItems.length;i++)
		{
			System.out.println("IsoCertifiedtItems: "+this.isoCertifiedItems[i]);
		}
	}
}
void onlineDelivery()
{
	System.out.println("Online Delivery Available");
} 
void displayProperties()
{
	System.out.println("LargeScale: " +this.largeScale);
	System.out.println("Profit: " +this.profit);
	System.out.println("PackageType: " +this.packageType);
	System.out.println("OnlineAvailable: " +this.onlineAvailable);
	System.out.println("CustomerFeedback: " +this.customerFeedback);
	this.displayIsoCertifiedItems();
	super.displayProperties();
}
boolean getLargeScale()
{
	return this.largeScale;
}
double getProfit()
{
	return this.profit;
}
String[] getIsoCertifiedItems()
{
	return this.isoCertifiedItems;
}
String getPackageType()
{
	return this.packageType;
}
boolean getOnlineAvailable()
{
	return this.onlineAvailable;
}
String getCustomerFeedback()
{
	return this.customerFeedback;
}
}