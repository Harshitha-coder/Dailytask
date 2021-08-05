class Application
{
	String name;
	double version;
	Developer developer;
	
Application(String name,double version,Developer developer)
{
	this.name=name;
	this.version=version;
	this.developer=developer;
}	
void displayProperties()
{
	System.out.println("Application name:" +this.name);
	System.out.println("Application version:" +this.version);
	System.out.println("Application developer:" +this.developer);
	
	
}

 void displayDeveloperName()
 {
	 System.out.println("Developer Name:" +this.developer);
 }
void displayDeveloperAddressSize()
 {
	 if(this.developer.addresses!=null)
	 System.out.println("address Size: " +this.developer.addresses.length);
	 
 }

/* void displayDeveloperCountryStateSize()
 {
	 if(developer.addresses!=null)
	 {
	 for(int i=0;i<this.developer.addresses.length;i++)
	 {
	 Developer refOfDeveloper=developer[i];
			Address[] refOfAddress= refOfDeveloper.addresses;
			if(refOfAddress!=null)
			{
			System.out.println(refOfAddress.length);
			
			for(int j=0;j<refOfAdress.length;j++)
			{
				Address refOfAdd= refOfAddress[j];
				Country refOfCOuntry=refOfAdd.country;
			    State[] refOfState=refOfCOuntry.states;
				System.out.println("Developer Country State Size: " +refOfAddress.size);
			}
			}
	 }
	 }
 }*/
 
}