class Developer10
{
	String name10;
	String email10;
	Address10[] addresses;
	
Developer10(String name10,String email10)
{
	this.name10=name10;
	this.email10=email10;
}	
void updateAddress10(Address10[] addresses)
{
	this.addresses=addresses;
}
void displayDeveloper10Properties()
{
	System.out.println("Developer10Name: " +this.name10);
	System.out.println("Developer10email: " +this.email10);
	System.out.println("Developer10Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress10Properties();
		}
	}

}
}