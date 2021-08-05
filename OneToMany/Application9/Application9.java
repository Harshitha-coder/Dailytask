class Application9
{
	String name9;
	double version9;
	Developer9 developer9;
	
Application9(String name9,double version9,Developer9 developer9)
{
	this.name9=name9;
	this.version9=version9;
	this.developer9=developer9;
}	
void displayApplication9Properties()
{
	System.out.println("Application9name:" +this.name9);
	System.out.println("Application9version:" +this.version9);
	System.out.println("Application9Developer:" +this.developer9.name9);
	
}
void displayDeveloper9Name()
{
	System.out.println("Developer9Name: "+this.developer9.name9);
}
void displayDeveloper9Address9Size()
{
	if(this.developer9.addresses!=null)
	{
		System.out.println("Developer9AddressSize: " + this.developer9.addresses.length);
	}
}
void displayDeveloper9Country9State9Size()
{
	if(this.developer9.addresses!=null)
	{
		for(int i=0;i<this.developer9.addresses.length;i++)
		{
			Address9 add=developer9.addresses[i];
			Country9 cnt=add.country9;
			State9[] states=cnt.states;
			if(states!=null)
			{
			System.out.println("Developer9Country9State9Size: "+states.length);
			}
		}
	}
}
void displayDeveloper9Address9Street()
{
	if(this.developer9.addresses!=null)
	{
		for(int i=0;i<this.developer9.addresses.length;i++)
		{
			Address9 ad=developer9.addresses[i];
			String street=ad.street9;
			System.out.println("Developer9Address9StreetName: "+street);
		}
	}	
}
void displayDeveloper9Country()
{
	if(this.developer9.addresses!=null)
	{
		for(int i=0;i<this.developer9.addresses.length;i++)
		{
			Address9 add=developer9.addresses[i];
			Country9 country=add.country9;
			System.out.println("Developer9CountryName: "+country.name9);
			
		}
	}
}
void displayDeveloper9CityName()
{
	if(this.developer9.addresses!=null)
	{
		for(int i=0;i<this.developer9.addresses.length;i++)
		{
			Address9 a=developer9.addresses[i];
			Country9 c =a.country9;
			State9[] states=c.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State9 s=c.states[j];
				String cityName=s.capitalCityName9;
				System.out.println("Developer9CityName :"+cityName);
			}
			}
		}
	}
}
}