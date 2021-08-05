class Address8
{
	String street8;
	int doorNo8;
	Country8 country8;

Address8(String street8,int doorNo8,Country8 country8)
{
	this.street8=street8;
	this.doorNo8=doorNo8;
	this.country8=country8;
}

void displayAddress8Properties()
{
	System.out.println("StreetName8: " +this.street8);
	System.out.println("DoorNo8 : " +this.doorNo8);
	System.out.println("Country8Name : " +this.country8.name8);
	
	
} 

}