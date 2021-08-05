class Application5
{
	String name5;
	double version5;
	Developer5 developer5;
	
Application5(String name5,double version5,Developer5 developer5)
{
	this.name5=name5;
	this.version5=version5;
	this.developer5=developer5;
}	
void displayApplication5Properties()
{
	System.out.println("Application5name:" +this.name5);
	System.out.println("Application5version:" +this.version5);
	System.out.println("Application5Developer:" +this.developer5.name5);
	
}
void displayDeveloper5Name()
{
	System.out.println("Developer5Name: "+this.developer5.name5);
}
void displayDeveloper5Address5Size()
{
	if(this.developer5.addresses!=null)
	{
		System.out.println("Developer5AddressSize: " + this.developer5.addresses.length);
	}
}
void displayDeveloper5Country5State5Size()
{
	if(this.developer5.addresses!=null)
	{
		for(int i=0;i<this.developer5.addresses.length;i++)
		{
			Address5 add=developer5.addresses[i];
			Country5 cnt=add.country5;
			State5[] states=cnt.states;
			if(states!=null)
			{
			System.out.println("Developer5Country5State5Size: "+states.length);
			}
		}
	}
}
void displayDeveloper5Address5Street()
{
	if(this.developer5.addresses!=null)
	{
		for(int i=0;i<this.developer5.addresses.length;i++)
		{
			Address5 ad=developer5.addresses[i];
			String street=ad.street5;
			System.out.println("Developer5Address5StreetName: "+street);
		}
	}	
}
void displayDeveloper5Country()
{
	if(this.developer5.addresses!=null)
	{
		for(int i=0;i<this.developer5.addresses.length;i++)
		{
			Address5 add=developer5.addresses[i];
			Country5 country=add.country5;
			System.out.println("Developer5CountryName: "+country.name5);
			
		}
	}
}
void displayDeveloper5CityName()
{
	if(this.developer5.addresses!=null)
	{
		for(int i=0;i<this.developer5.addresses.length;i++)
		{
			Address5 a=developer5.addresses[i];
			Country5 c =a.country5;
			State5[] states=c.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State5 s=c.states[j];
				String cityName=s.capitalCityName5;
				System.out.println("Developer5CityName :"+cityName);
			}
			}
		}
	}
}
}