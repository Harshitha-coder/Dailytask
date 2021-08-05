class Address9
{
	String street9;
	int doorNo9;
	Country9 country9;

Address9(String street9,int doorN9,Country9 country9)
{
	this.street9=street9;
	this.doorNo9=doorNo9;
	this.country9=country9;
}

void displayAddress9Properties()
{
	System.out.println("StreetName9: " +this.street9);
	System.out.println("DoorNo9 : " +this.doorNo9);
	System.out.println("Country9Name : " +this.country9.name9);
	
	
} 

}