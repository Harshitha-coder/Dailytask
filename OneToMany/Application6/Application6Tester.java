class Application6Tester
{
	public static void main(String[] args)
	{
		State6 states=new State6("Manipur","Imphal");
		states.displayState6Properties();
		
		Country6 c=new Country6("Cyprus",1311);
		State6[] sts=new State6[2];
		State6 state1=new State6("Meghalaya","Shillong");
		sts[0]=states;
		sts[1]=state1;
		c.updateState6(sts);
		c.displayCountry6Properties();
		
		Address6 address=new Address6("9th main",121,c);
		address.displayAddress6Properties();
		
		Developer6 dev=new Developer6("Mrudula","mrudula@gmail.com");
		Country6 country1=new Country6("Belgium",809);
		Address6 address1=new Address6("8th cross",19,country1);
		Address6[] ads=new Address6[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress6(ads);
		dev.displayDeveloper6Properties();
		
		
		Application6 application=new Application6("Google",91.0,dev);
		application.displayApplication6Properties();
		application.displayDeveloper6Name();
		application.displayDeveloper6Address6Size();
		application.displayDeveloper6Country6State6Size();
		application.displayDeveloper6Address6Street();
		application.displayDeveloper6Country();
		application.displayDeveloper6CityName();
	}
}