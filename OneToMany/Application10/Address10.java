class Address10
{
	String street10;
	int doorNo10;
	Country10 country10;
Address10(String street10,int doorNo10,Country10 country10)
{
	this.street10=street10;
	this.doorNo10=doorNo10;
	this.country10=country10;
}
void displayAddress10Properties()
{
	System.out.println("StreetName10: "+this.street10);
	System.out.println("DoorNo10: "+this.doorNo10);
	System.out.println("Country10Name: "+this.country10.name10);
}
}