class DeveloperDetails
{
	String name;
	String email;
	Address[] addresses;
	
DeveloperDetails(String name,String email)
{
	this.name=name;
	this.email=email;
}
void updateAddress(Address[] addresses)
{
	this.addresses=addresses;
}

void displayProperties()
{
	System.out.println("developer name: " +this.name);
	System.out.println("developer email: " +this.email);
	System.out.println("developer address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayProperties();
		}
	}
	
}
}