class Developer1
{
	String name1;
	String email1;
	Address1[] addresses;
	
Developer1(String name1,String email1)
{
	this.name1=name1;
	this.email1=email1;
}
void updateAddress1(Address1[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper1Properties()
{
	System.out.println("Developer1Name: " +this.name1);
	System.out.println("developer1Email: " +this.email1);
	System.out.println("developer1Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress1Properties();
		}
	}
	
}
}