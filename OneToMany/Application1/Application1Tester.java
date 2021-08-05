class Application1Tester
{
	public static void main(String[] args)
	{
		State1 st=new State1("Karnataka","Banglore");
		st.displayState1Properties();
		
	    Country1 country1=new Country1("India",4567);
		State1 st2=new State1("Bihar","Patna");
		State1[] states=new State1[2];
		states[0]=st;
		states[1]=st2;
		country1.updateState1(states);
		country1.displayCountry1Properties();
		
		Address1 address1=new Address1("1st Cross",17,country1);
	    address1.displayAddress1Properties();
		
		Developer1 developer1=new Developer1("Harshitha","harshithak794@gmail.com");
		Country1 country2=new Country1("China",455);
		 Address1 address2=new Address1("3rd main",45,country2);
		 Address1[] adrs=new Address1[2];
		 adrs[0]=address1;
		 adrs[1]=address2;
		 developer1.updateAddress1(adrs);
		 developer1.displayDeveloper1Properties();
	
		Application1 app=new Application1("Whatsapp",2.1,developer1);
		app.displayApplication1Properties();
		app.displayDeveloper1Name();
		 app.displayDeveloper1Address1Size();
		 app.displayDeveloper1Country1State1Size();
		 app.displayDeveloper1Address1Street();
		 app.displayDeveloper1Country1();
		 app.displayDeveloper1CityName();
	}
}