class Address3
{
	String street3;
	int doorNo3;
	Country3 country3;

Address3(String street3,int doorNo3,Country3 country3)
{
	this.street3=street3;
	this.doorNo3=doorNo3;
	this.country3=country3;
}

void displayAddress3Properties()
{
	System.out.println("StreetName3: " +this.street3);
	System.out.println("DoorNo3 : " +this.doorNo3);
	System.out.println("Country3Name : " +this.country3.name3);
	
	
} 

}