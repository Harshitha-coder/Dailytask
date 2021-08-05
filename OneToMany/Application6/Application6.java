class Application6
{
	String name6;
	double version6;
	Developer6 developer6;
	
Application6(String name6,double version6,Developer6 developer6)
{
	this.name6=name6;
	this.version6=version6;
	this.developer6=developer6;
}	
void displayApplication6Properties()
{
	System.out.println("Application6name:" +this.name6);
	System.out.println("Application6version:" +this.version6);
	System.out.println("Application6Developer:" +this.developer6.name6);
	
}
void displayDeveloper6Name()
{
	System.out.println("Developer6Name: "+this.developer6.name6);
}
void displayDeveloper6Address6Size()
{
	if(this.developer6.addresses!=null)
	{
		System.out.println("Developer6AddressSize: " + this.developer6.addresses.length);
	}
}
void displayDeveloper6Country6State6Size()
{
	if(this.developer6.addresses!=null)
	{
		for(int i=0;i<this.developer6.addresses.length;i++)
		{
			Address6 add=developer6.addresses[i];
			Country6 cnt=add.country6;
			State6[] states=cnt.states;
			if(states!=null)
			{
			System.out.println("Developer6Country6State6Size: "+states.length);
			}
		}
	}
}
void displayDeveloper6Address6Street()
{
	if(this.developer6.addresses!=null)
	{
		for(int i=0;i<this.developer6.addresses.length;i++)
		{
			Address6 ad=developer6.addresses[i];
			String street=ad.street6;
			System.out.println("Developer6Address6StreetName: "+street);
		}
	}	
}
void displayDeveloper6Country()
{
	if(this.developer6.addresses!=null)
	{
		for(int i=0;i<this.developer6.addresses.length;i++)
		{
			Address6 add=developer6.addresses[i];
			Country6 country=add.country6;
			System.out.println("Developer6CountryName: "+country.name6);
			
		}
	}
}
void displayDeveloper6CityName()
{
	if(this.developer6.addresses!=null)
	{
		for(int i=0;i<this.developer6.addresses.length;i++)
		{
			Address6 a=developer6.addresses[i];
			Country6 c =a.country6;
			State6[] states=c.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State6 s=c.states[j];
				String cityName=s.capitalCityName6;
				System.out.println("Developer6CityName :"+cityName);
			}
			}
		}
	}
}
}