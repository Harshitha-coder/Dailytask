class Application8Tester
{
	public static void main(String[] args)
	{
		State8 states=new State8("Maharastra","Mumbai");
		states.displayState8Properties();
		
		Country8 c=new Country8("Iran",111);
		State8[] sts=new State8[2];
		State8 state1=new State8("Nagaland","Kohima");
		sts[0]=states;
		sts[1]=state1;
		c.updateState8(sts);
		c.displayCountry8Properties();
		
		Address8 address=new Address8("11th main",10,c);
		address.displayAddress8Properties();
		
		Developer8 dev=new Developer8("Sunil","sunil@gmail.com");
		Country8 country1=new Country8("Srilanka",19);
		Address8 address1=new Address8("20th cross",22,country1);
		Address8[] ads=new Address8[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress8(ads);
		dev.displayDeveloper8Properties();
		
		
		Application8 application=new Application8("GoogleMeet",3.0,dev);
		application.displayApplication8Properties();
		application.displayDeveloper8Name();
		application.displayDeveloper8Address8Size();
		application.displayDeveloper8Country8State8Size();
		application.displayDeveloper8Address8Street();
		application.displayDeveloper8Country();
		application.displayDeveloper8CityName();
	}
}