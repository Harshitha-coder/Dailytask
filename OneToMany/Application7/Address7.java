class Address7
{
	String street7;
	int doorNo7;
	Country7 country7;

Address7(String street7,int doorNo7,Country7 country7)
{
	this.street7=street7;
	this.doorNo7=doorNo7;
	this.country7=country7;
}

void displayAddress7Properties()
{
	System.out.println("StreetName7: " +this.street7);
	System.out.println("DoorNo7 : " +this.doorNo7);
	System.out.println("Country7Name : " +this.country7.name7);
	
	
} 

}