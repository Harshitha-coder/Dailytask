class Developer4
{
	String name4;
	String email4;
	Address4[] addresses;
	
Developer4(String name4,String email4)
{
	this.name4=name4;
	this.email4=email4;
}
void updateAddress4(Address4[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper4Properties()
{
	System.out.println("Developer4Name: " +this.name4);
	System.out.println("developer4Email: " +this.email4);
	System.out.println("developer4Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress4Properties();
		}
	}
	
}
}