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
void displayProperties()
{
	System.out.println("street name1: " +this.street1);
	System.out.println("doorNo1 : " +this.doorNo1);
	System.out.println("country1 : " +this.country1);
	
} 

}