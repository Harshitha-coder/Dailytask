class Address5
{
	String street5;
	int doorNo5;
	Country5 country5;

Address5(String street5,int doorNo5,Country5 country5)
{
	this.street5=street5;
	this.doorNo5=doorNo5;
	this.country5=country5;
}

void displayAddress5Properties()
{
	System.out.println("StreetName5: " +this.street5);
	System.out.println("DoorNo5 : " +this.doorNo5);
	System.out.println("Country5Name : " +this.country5.name5);
	
	
} 

}