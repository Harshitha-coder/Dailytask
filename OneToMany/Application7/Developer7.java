class Developer7
{
	String name7;
	String email7;
	Address7[] addresses;
	
Developer7(String name7,String email7)
{
	this.name7=name7;
	this.email7=email7;
}
void updateAddress7(Address7[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper7Properties()
{
	System.out.println("Developer7Name: " +this.name7);
	System.out.println("developer7Email: " +this.email7);
	System.out.println("developer7Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress7Properties();
		}
	}
	
}
}