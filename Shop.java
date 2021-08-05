class Shop
{
 String name;
 String ownerName;
 double budget;
 String location;
 ShopType type;
 BillingType billingType;
 boolean homeDelivery;
 boolean ambience;
 double openTime;
 boolean wholesale;
 double closeTime;
 boolean parking;
 String gstNo;
 int noOfWorkers;
 
Shop()
{
	 System.out.println("Created default constructor for shop");
	 
}

void setName(String name)
{
	this.name=name;
}
void setOwnerName(String ownerName)
{
	this.ownerName=ownerName;
}
 
 void setBudget(double budget)
{
	this.budget=budget;
}
void setLocation(String location)
{
	this.location=location;
}
 
 void setType(ShopType type)
{
	this.type=type;
}
void setBillingType(BillingType billingType)
{
	this.billingType=billingType;
}
 
 void setHomeDelivery(boolean homeDelivery)
{
	this.homeDelivery=homeDelivery;
}
 
 void setAmbience(boolean ambience)
{
	this.ambience=ambience;
}
void setOpenTime(double openTime)
{
	this.openTime=openTime;
}
void setWholesale(boolean wholesale)
{
	this.wholesale=wholesale;
}
void setCloseTime(double closeTime)
{
	this.closeTime=closeTime;
}
void setParking(boolean parking)
{
	this.parking=parking;
}
void setGstNo(String gstNo)
{
	this.gstNo=gstNo;
}
void setNoOfWorkers(int noOfWorkers)
{
	this.noOfWorkers=noOfWorkers;
}

 void displayProperties()
 {
	 System.out.println("Name: "+this.name);
	 System.out.println("OwnerName: "+this.ownerName);
	 System.out.println("Budget: "+this.budget);
	 System.out.println("Location: "+this.location);
	 System.out.println("Type: "+this.type);
	 System.out.println("BillingType: "+this.billingType);
	 System.out.println("HomeDelivery: "+this.homeDelivery);
	 System.out.println("Ambience: "+this.ambience);
	 System.out.println("OpenTime: "+this.openTime);
	 System.out.println("wholesale: "+this.wholesale);
	 System.out.println("CloseTime: "+this.closeTime);
	 System.out.println("Parking: "+this.parking);
	 System.out.println("GstNo: "+this.gstNo);
	 System.out.println("NoOfWorkers: "+this.noOfWorkers);
	 
 }
 
}