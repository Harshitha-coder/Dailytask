class Address1
{
	String street1;
	int doorNo1;
	Country1 country1;

Address1(String street1,int doorNo1,Country1 country1)
{
	this.street1=street1;
	this.doorNo1=doorNo1;
	this.country1=country1;
}

void displayAddress1Properties()
{
	System.out.println("StreetName1: " +this.street1);
	System.out.println("DoorNo1 : " +this.doorNo1);
	System.out.println("Country1Name : " +this.country1.name1);
	
	
} 

}