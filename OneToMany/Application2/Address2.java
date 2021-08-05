class Address2
{
	String street2;
	int doorNo2;
	Country2 country2;

Address2(String street2,int doorNo2,Country2 country2)
{
	this.street2=street2;
	this.doorNo2=doorNo2;
	this.country2=country2;
}

void displayAddress2Properties()
{
	System.out.println("StreetName2: " +this.street2);
	System.out.println("DoorNo2 : " +this.doorNo2);
	System.out.println("Country2Name : " +this.country2.name2);
	
	
} 

}