class Address6
{
	String street6;
	int doorNo6;
	Country6 country6;

Address6(String street6,int doorNo6,Country6 country6)
{
	this.street6=street6;
	this.doorNo6=doorNo6;
	this.country6=country6;
}

void displayAddress6Properties()
{
	System.out.println("StreetName6: " +this.street6);
	System.out.println("DoorNo6 : " +this.doorNo6);
	System.out.println("Country6Name : " +this.country6.name6);
	
	
} 

}