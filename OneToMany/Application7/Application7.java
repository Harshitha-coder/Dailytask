class Application7
{
	String name7;
	double version7;
	Developer7 developer7;
	
Application7(String name7,double version7,Developer7 developer7)
{
	this.name7=name7;
	this.version7=version7;
	this.developer7=developer7;
}	
void displayApplication7Properties()
{
	System.out.println("Application7name:" +this.name7);
	System.out.println("Application7version:" +this.version7);
	System.out.println("Application7Developer:" +this.developer7.name7);
	
}
void displayDeveloper7Name()
{
	System.out.println("Developer7Name: "+this.developer7.name7);
}
void displayDeveloper7Address7Size()
{
	if(this.developer7.addresses!=null)
	{
		System.out.println("Developer7AddressSize: " + this.developer7.addresses.length);
	}
}
void displayDeveloper7Country7State7Size()
{
	if(this.developer7.addresses!=null)
	{
		for(int i=0;i<this.developer7.addresses.length;i++)
		{
			Address7 add=developer7.addresses[i];
			Country7 cnt=add.country7;
			State7[] states=cnt.states;
			if(states!=null)
			{
			System.out.println("Developer7Country7State7Size: "+states.length);
			}
		}
	}
}
void displayDeveloper7Address7Street()
{
	if(this.developer7.addresses!=null)
	{
		for(int i=0;i<this.developer7.addresses.length;i++)
		{
			Address7 ad=developer7.addresses[i];
			String street=ad.street7;
			System.out.println("Developer7Address7StreetName: "+street);
		}
	}	
}
void displayDeveloper7Country()
{
	if(this.developer7.addresses!=null)
	{
		for(int i=0;i<this.developer7.addresses.length;i++)
		{
			Address7 add=developer7.addresses[i];
			Country7 country=add.country7;
			System.out.println("Developer7CountryName: "+country.name7);
			
		}
	}
}
void displayDeveloper7CityName()
{
	if(this.developer7.addresses!=null)
	{
		for(int i=0;i<this.developer7.addresses.length;i++)
		{
			Address7 a=developer7.addresses[i];
			Country7 c =a.country7;
			State7[] states=c.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State7 s=c.states[j];
				String cityName=s.capitalCityName7;
				System.out.println("Developer7CityName :"+cityName);
			}
			}
		}
	}
}
}