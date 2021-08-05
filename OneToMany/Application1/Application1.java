class Application1
{
	String name1;
	double version1;
	Developer1 developer1;
	
Application1(String name1,double version1,Developer1 developer1)
{
	this.name1=name1;
	this.version1=version1;
	this.developer1=developer1;
}	
void displayApplication1Properties()
{
	System.out.println("Application1name:" +this.name1);
	System.out.println("Application1version:" +this.version1);
	System.out.println("Application1Developer:" +this.developer1.name1);
	
}

void displayDeveloper1Name()
 {
	 System.out.println("Developer1Name:" +this.developer1.name1);
 }
void displayDeveloper1Address1Size()
 {
	 if(this.developer1.addresses!=null)
	 System.out.println("Developer1AddressSize: " +this.developer1.addresses.length);
	 
 }

 void displayDeveloper1Country1State1Size()
 {
	 if(this.developer1.addresses!=null)
	 {
	 for(int i=0;i<this.developer1.addresses.length;i++)
	 {   
			Address1 addresses= developer1.addresses[i];
			Country1 country=addresses.country1;
			State1[] states=country.states;
			if(states!=null)
			{
			System.out.println("Developer1Country1State1Size: " +states.length);
			}			
	 }
	 }
 }
 void displayDeveloper1Address1Street()
 {
	if(this.developer1.addresses!=null)
	 {
	 for(int i=0;i<this.developer1.addresses.length;i++)
	 {   
         Address1 addresses= developer1.addresses[i];
		 String street=addresses.street1;
		 System.out.println("Developer1Address1Street1Name:" +street);
	 }
	 }
 }
 void displayDeveloper1Country1()
 {
	 if(this.developer1.addresses!=null)
	 {
	 for(int i=0;i<this.developer1.addresses.length;i++)
	 {  
            Address1 addresses= developer1.addresses[i];
			Country1 country=addresses.country1; 
			System.out.println("Developer1Country1Name: "+country.name1);
	 }
	 }
 }
void displayDeveloper1CityName()
{
	if(this.developer1.addresses!=null)
	 {
	 for(int i=0;i<this.developer1.addresses.length;i++)
	 {  
       Address1 addresses= developer1.addresses[i];
         Country1 country=addresses.country1; 
		 State1[] states=country.states;
		 if(states!=null)
		 {
		 for(int j=0;j<states.length;j++)
		 {  
	         State1 state=states[j];
			 String cityName=state.capitalCityName1;
			 System.out.println("Developer1CapitalCityName: " +cityName);
		 }
		 }
	 }
	 }
}
}