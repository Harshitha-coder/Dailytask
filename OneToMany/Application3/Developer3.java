class Developer3
{
	String name3;
	String email3;
	Address3[] addresses;
	
Developer3(String name3,String email3)
{
	this.name3=name3;
	this.email3=email3;
}
void updateAddress3(Address3[] addresses)
{
	this.addresses=addresses;
}

void displayDeveloper3Properties()
{
	System.out.println("Developer3Name: " +this.name3);
	System.out.println("developer3Email: " +this.email3);
	System.out.println("developer3Address: " +this.addresses.length);
	if(this.addresses!=null)
	{
		for(int i=0;i<this.addresses.length;i++)
		{
			this.addresses[i].displayAddress3Properties();
		}
	}
	
}
}