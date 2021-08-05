class Developer6
{
	String name6;
	String email6;
	Address6[] addresses;
	
Developer6(String name6,String email6)
{
	this.name6=name6;
	this.email6=email6;
}
void updateAddress6(Address6[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper6Properties()
{
	System.out.println("Developer6Name: " +this.name6);
	System.out.println("developer6Email: " +this.email6);
	System.out.println("developer6Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress6Properties();
		}
	}
	
}
}