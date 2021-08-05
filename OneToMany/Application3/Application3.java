class Application3
{
	String name3;
	double version3;
	Developer3 developer3;
	
Application3(String name3,double version3,Developer3 developer3)
{
	this.name3=name3;
	this.version3=version3;
	this.developer3=developer3;
}	
void displayApplication3Properties()
{
	System.out.println("Application3name:" +this.name3);
	System.out.println("Application3version:" +this.version3);
	System.out.println("Application3Developer:" +this.developer3.name3);
	
}
void displayDeveloper3Name()
{
	System.out.println("Developer3Name: "+this.developer3.name3);
}
void displayDeveloper3Address3Size()
{
	if(this.developer3.addresses!=null)
	{
		System.out.println("Developer3AddressSize: " + this.developer3.addresses.length);
	}
}
void displayDeveloper3Country3State3Size()
{
	if(this.developer3.addresses!=null)
	{
		for(int i=0;i<this.developer3.addresses.length;i++)
		{
			Address3 add=developer3.addresses[i];
			Country3 cnt=add.country3;
			State3[] states=cnt.states;
			if(states!=null)
			{
			System.out.println("Developer3Country3State3Size: "+states.length);
			}
		}
	}
}
void displayDeveloper3Address3Street()
{
	if(this.developer3.addresses!=null)
	{
		for(int i=0;i<this.developer3.addresses.length;i++)
		{
			Address3 a=developer3.addresses[i];
			String street=a.street3;
			System.out.println("Developer3Address3StreetName: "+street);
		}
	}	
}
void displayDeveloper3Country()
{
	if(this.developer3.addresses!=null)
	{
		for(int i=0;i<this.developer3.addresses.length;i++)
		{
			Address3 address=developer3.addresses[i];
			Country3 country=address.country3;
			System.out.println("Developer3CountryName: "+country.name3);
			
		}
	}
}
void displayDeveloper3CityName()
{
	if(this.developer3.addresses!=null)
	{
		for(int i=0;i<this.developer3.addresses.length;i++)
		{
			Address3 address=developer3.addresses[i];
			Country3 country =address.country3;
			State3[] states=country.states;
			if(states!=null)
			{
			for(int j=0;j<states.length;j++)
			{
				State3 states1=country.states[j];
				String cityName=states1.capitalCityName3;
				System.out.println("Developer3CityName :"+cityName);
			}
			}
		}
	}
}
}