class Application8
{
	String name8;
	double version8;
	Developer8 developer8;
	
Application8(String name8,double version8,Developer8 developer8)
{
	this.name8=name8;
	this.version8=version8;
	this.developer8=developer8;
}	
void displayApplication8Properties()
{
	System.out.println("Application8name:" +this.name8);
	System.out.println("Application8version:" +this.version8);
	System.out.println("Application8Developer:" +this.developer8.name8);
	
}
void displayDeveloper8Name()
{
	System.out.println("Developer8Name: "+this.developer8.name8);
}
void displayDeveloper8Address8Size()
{
	if(this.developer8.addresses!=null)
	{
		System.out.println("Developer8AddressSize: " + this.developer8.addresses.length);
	}
}
void displayDeveloper8Country8State8Size()
{
	if(this.developer8.addresses!=null)
	{
		for(int i=0;i<this.developer8.addresses.length;i++)
		{
			Address8 add=developer8.addresses[i];
			Country8 cnt=add.country8;
			State8[] states=cnt.states;
			if(states!=null)
			{
			System.out.println("Developer8Country8State8Size: "+states.length);
			}
		}
	}
}
void displayDeveloper8Address8Street()
{
	if(this.developer8.addresses!=null)
	{
		for(int i=0;i<this.developer8.addresses.length;i++)
		{
			Address8 ad=developer8.addresses[i];
			String street=ad.street8;
			System.out.println("Developer8Address8StreetName: "+street);
		}
	}	
}
void displayDeveloper8Country()
{
	if(this.developer8.addresses!=null)
	{
		for(int i=0;i<this.developer8.addresses.length;i++)
		{
			Address8 add=developer8.addresses[i];
			Country8 country=add.country8;
			System.out.println("Developer8CountryName: "+country.name8);
			
		}
	}
}
void displayDeveloper8CityName()
{
	if(this.developer8.addresses!=null)
	{
		for(int i=0;i<this.developer8.addresses.length;i++)
		{
			Address8 a=developer8.addresses[i];
			Country8 c =a.country8;
			State8[] states=c.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State8 s=c.states[j];
				String cityName=s.capitalCityName8;
				System.out.println("Developer8CityName :"+cityName);
			}
			}
		}
	}
}
}