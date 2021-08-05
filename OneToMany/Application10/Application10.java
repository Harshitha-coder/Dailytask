class Application10
{
	String name10;
	float version10;
	Developer10 developer10;
	
Application10(String name10,float version10,Developer10 developer10)
{
	this.name10=name10;
	this.version10=version10;
	this.developer10=developer10;
}
void displayApplication10Properties()
{
	System.out.println("Application10Name: "+this.name10);
	System.out.println("Application10Version: "+this.version10);
	System.out.println("Application10Developer: "+this.developer10.name10);
}
void displayDeveloper10Name()
{
	System.out.println("Dveloper10Name: "+this.developer10.name10);
}
void displayDeveloper10Address10Size()
{
	if(this.developer10.addresses!=null)
	{
		System.out.println("Dveloper10AddressSize: "+this.developer10.addresses.length);
	}
}
void displayDeveloper10Country10State10Size()
{
	if(this.developer10.addresses!=null)
	{
		for(int i=0;i<developer10.addresses.length;i++)
		{
			Address10 a=developer10.addresses[i];
			Country10 c=a.country10;
			State10[] s=c.states;
			if(s!=null)
			{
			System.out.println("Developer10Country10State10Size: "+s.length);
			}
		}
	}
}
void displayDeveloper10Address10Street()
{
	
	if(this.developer10.addresses!=null)
	{
		for(int i=0;i<developer10.addresses.length;i++)
		{
			Address10 a=developer10.addresses[i];
			String s=a.street10;
			System.out.println("Developer10Address10StreetName: "+s);
		}
	}
}
void displayDeveloper10Country10()
{
	if(this.developer10.addresses!=null)
	{
		for(int i=0;i<developer10.addresses.length;i++)
		{
			Address10 a=developer10.addresses[i];
			Country10 c=a.country10;
			System.out.println("Developer10Country10Name: " +c.name10);
		}
	}
}
void displayDeveloper10CityName()
{
	if(this.developer10.addresses!=null)
	{
		for(int i=0;i<developer10.addresses.length;i++)
		{
			Address10 a=developer10.addresses[i];
			Country10 country=a.country10;
			State10[] states=country.states;
			if(states!=null)
			{
				for(int j=0;j<states.length;j++)
				{
					State10 s1=country.states[j];
					String c1=s1.capitalCityName10;
					System.out.println("Developer10CityName: "+c1);
				}
			}
		}
	}

}
}