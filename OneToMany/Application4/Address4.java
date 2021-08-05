class Address4
{
	String street4;
	int doorNo4;
	Country4 country4;

Address4(String street4,int doorNo4,Country4 country4)
{
	this.street4=street4;
	this.doorNo4=doorNo4;
	this.country4=country4;
}

void displayAddress4Properties()
{
	System.out.println("StreetName4: " +this.street4);
	System.out.println("DoorNo4 : " +this.doorNo4);
	System.out.println("Country4Name : " +this.country4.name4);
	
	
} 

}