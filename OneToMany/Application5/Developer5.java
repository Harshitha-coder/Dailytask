class Developer5
{
	String name5;
	String email5;
	Address5[] addresses;
	
Developer5(String name5,String email5)
{
	this.name5=name5;
	this.email5=email5;
}
void updateAddress5(Address5[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper5Properties()
{
	System.out.println("Developer5Name: " +this.name5);
	System.out.println("developer5Email: " +this.email5);
	System.out.println("developer5Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress5Properties();
		}
	}
	
}
}