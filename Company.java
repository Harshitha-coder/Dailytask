class Company
{
	String name;
	Airplane[] airplanes;
	
Company(String name)
{
	this.name=name;
}
void updateAirplanes(Airplane[] airplanes)
{
	
	this.airplanes=airplanes;
}
void displayAirplaneProperties()
{
	System.out.println("CompanyName: " +this.name);
	System.out.println("airplanes length: " +this.airplanes.length);

	if(this.airplanes!=null)
	{
	for(int index=0;index<this.airplanes.length;index++)
	{
		this.airplanes(index).displayProperties();
	}
	}
}
void displayAirhostessName()
{
	if(this.airplanes!=null)
	{
		for( int indexOf=0;indexOf<airplanes.length;indexOf++)
		{
			Airplane refOfAirplane=airplanes[indexOf];
			Airhostess[] refOfAirhostess= refOfAirplane.airhostess;
			if(refOfAirhostess!=null)
			{
			System.out.println(refOfAirhostess.length);
			
			for(int j=0;j<refOfAirhostess.length;j++)
			{
				Airhostess refOfAirhost= refOfAirhostess[j];
				System.out.println(refOfAirhost.name);
			}
			}
		}
	}
}		
		


}


