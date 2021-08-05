class Application2
{
	String name2;
	double version2;
	Developer2 developer2;
	
Application2(String name2,double version2,Developer2 developer2)
{
	this.name2=name2;
	this.version2=version2;
	this.developer2=developer2;
}	
void displayApplication2Properties()
{
	System.out.println("Application2name:" +this.name2);
	System.out.println("Application2version:" +this.version2);
	System.out.println("Application2Developer:" +this.developer2.name2);
	
}
void displayDeveloper2Name()
{
	System.out.println("Developer2Name: "+this.developer2.name2);
}
void displayDeveloper2Address2Size()
{
	if(this.developer2.addresses!=null)
	{
		System.out.println("Developer2AddressSize: " + this.developer2.addresses.length);
	}
}
void displayDeveloper2Country2State2Size()
{
	if(this.developer2.addresses!=null)
	{
		for(int i=0;i<this.developer2.addresses.length;i++)
		{
			Address2 address=developer2.addresses[i];
			Country2 country=address.country2;
			State2[] states=country.states;
			if(states!=null)
			{
			System.out.println("Developer2Country2State2Size: "+states.length);
			}
		}
	}
}
void displayDeveloper2Address2Street()
{
	if(this.developer2.addresses!=null)
	{
		for(int i=0;i<this.developer2.addresses.length;i++)
		{
			Address2 address=developer2.addresses[i];
			String street=address.street2;
			System.out.println("Developer2Address2StreetName: "+street);
		}
	}	
}
void displayDeveloper2Country()
{
	if(this.developer2.addresses!=null)
	{
		for(int i=0;i<this.developer2.addresses.length;i++)
		{
			Address2 address=developer2.addresses[i];
			Country2 country=address.country2;
			System.out.println("Developer2CountryName: "+country.name2);
			
		}
	}
}
void displayDeveloper2CityName()
{
	if(this.developer2.addresses!=null)
	{
		for(int i=0;i<this.developer2.addresses.length;i++)
		{
			Address2 address=developer2.addresses[i];
			Country2 country =address.country2;
			State2[] states=country.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State2 states1=country.states[j];
				String cityName=states1.capitalCityName2;
				System.out.println("Developer2CityName :"+cityName);
			}
			}
		}
	}
}
}