class Developer2
{
	String name2;
	String email2;
	Address2[] addresses;
	
Developer2(String name2,String email2)
{
	this.name2=name2;
	this.email2=email2;
}
void updateAddress2(Address2[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper2Properties()
{
	System.out.println("Developer2Name: " +this.name2);
	System.out.println("developer2Email: " +this.email2);
	System.out.println("developer2Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress2Properties();
		}
	}
	
}
}