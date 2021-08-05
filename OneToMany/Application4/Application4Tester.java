class Application4Tester
{
	public static void main(String[] args)
	{
		State4 state=new State4("Goa","Panaji");
		state.displayState4Properties();
		
		Country4 country=new Country4("Cambodia",1221);
		State4[] sts=new State4[2];
		State4 state1=new State4("MP","Bhopal");
		sts[0]=state;
		sts[1]=state1;
		country.updateState4(sts);
		country.displayCountry4Properties();
		
		Address4 address=new Address4("6th main",111,country);
		address.displayAddress4Properties();
		
		Developer4 dev=new Developer4("Pavitra","pavitra@gmail.com");
		Country4 country1=new Country4("France",999);
		Address4 address1=new Address4("2nd cross",190,country1);
		Address4[] ads=new Address4[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress4(ads);
		dev.displayDeveloper4Properties();
		
		
		Application4 application=new Application4("Twitter",5.8,dev);
		application.displayApplication4Properties();
		application.displayDeveloper4Name();
		application.displayDeveloper4Address4Size();
		application.displayDeveloper4Country4State4Size();
		application.displayDeveloper4Address4Street();
		application.displayDeveloper4Country();
		application.displayDeveloper4CityName();
	}
}