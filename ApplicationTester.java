class ApplicationTester
{
	public static void main(String[] args)
	{
		State st=new State("Karnataka","Banglore");
		st.displayProperties();
		
	    Country country=new Country("India",4567);
		State st2=new State("Bihar","Patna");
		State[] states=new State[2];
		states[0]=st;
		states[1]=st2;
		country.updateState(states);
		country.displayProperties();
		
		Address address=new Address("1st Cross",17,country);
	    address.displayProperties();
		
		DeveloperDetails developer=new DeveloperDetails("Harshitha","harshithak794@gmail.com");
		 Address address1=new Address("3rd main",45,INDIA);
		 Address address2=new Address("5th main",25,NDIA);
		 Address[] adrs=new Address[3];
		 adrs[0]=address;
		 adrs[1]=address1;
		 adrs[2]=address2;
		 developer.updateAddress(adrs);
		 developer.displayProperties();
	
		Application app=new Application("Whatsapp",2.1,developer);
		Application app1=new Application("Instagram",2.2,developer);
		Application[] apps= new Application[2];
		apps[0]=app;
		apps[1]=app1;
		app.displayProperties();
		app.displayDeveloperName();
		 app.displayDeveloperAddressSize();
		 //app.displaydeveloperCountryStateSize();
	}
}