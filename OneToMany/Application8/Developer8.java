class Developer8
{
	String name8;
	String email8;
	Address8[] addresses;
	
Developer8(String name8,String email8)
{
	this.name8=name8;
	this.email8=email8;
}
void updateAddress8(Address8[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper8Properties()
{
	System.out.println("Developer8Name: " +this.name8);
	System.out.println("developer8Email: " +this.email8);
	System.out.println("developer8Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress8Properties();
		}
	}
	
}
}