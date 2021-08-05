class Application4
{
	String name4;
	double version4;
	Developer4 developer4;
	
Application4(String name4,double version4,Developer4 developer4)
{
	this.name4=name4;
	this.version4=version4;
	this.developer4=developer4;
}	
void displayApplication4Properties()
{
	System.out.println("Application4name:" +this.name4);
	System.out.println("Application4version:" +this.version4);
	System.out.println("Application4Developer:" +this.developer4.name4);
	
}
void displayDeveloper4Name()
{
	System.out.println("Developer4Name: "+this.developer4.name4);
}
void displayDeveloper4Address4Size()
{
	if(this.developer4.addresses!=null)
	{
		System.out.println("Developer4AddressSize: " + this.developer4.addresses.length);
	}
}
void displayDeveloper4Country4State4Size()
{
	if(this.developer4.addresses!=null)
	{
		for(int i=0;i<this.developer4.addresses.length;i++)
		{
			Address4 add=developer4.addresses[i];
			Country4 cnt=add.country4;
			State4[] states=cnt.states;
			if(states!=null)
			{
			System.out.println("Developer4Country4State4Size: "+states.length);
			}
		}
	}
}
void displayDeveloper4Address4Street()
{
	if(this.developer4.addresses!=null)
	{
		for(int i=0;i<this.developer4.addresses.length;i++)
		{
			Address4 a=developer4.addresses[i];
			String street=a.street4;
			System.out.println("Developer4Address4StreetName: "+street);
		}
	}	
}
void displayDeveloper4Country()
{
	if(this.developer4.addresses!=null)
	{
		for(int i=0;i<this.developer4.addresses.length;i++)
		{
			Address4 address=developer4.addresses[i];
			Country4 country=address.country4;
			System.out.println("Developer4CountryName: "+country.name4);
			
		}
	}
}
void displayDeveloper4CityName()
{
	if(this.developer4.addresses!=null)
	{
		for(int i=0;i<this.developer4.addresses.length;i++)
		{
			Address4 address=developer4.addresses[i];
			Country4 country =address.country4;
			State4[] states=country.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State4 states1=country.states[j];
				String cityName=states1.capitalCityName4;
				System.out.println("Developer4CityName :"+cityName);
			}
			}
		}
	}
}
}