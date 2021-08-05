class Developer9
{
	String name9;
	String email9;
	Address9[] addresses;
	
Developer9(String name9,String email9)
{
	this.name9=name9;
	this.email9=email9;
}
void updateAddress9(Address9[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper9Properties()
{
	System.out.println("Developer9Name: " +this.name9);
	System.out.println("developer9Email: " +this.email9);
	System.out.println("developer9Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress9Properties();
		}
	}
	
}
}