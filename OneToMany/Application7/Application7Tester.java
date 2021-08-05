class Application7Tester
{
	public static void main(String[] args)
	{
		State7 states=new State7("Hariyana","Chandigadh");
		states.displayState7Properties();
		
		Country7 c=new Country7("California",1431);
		State7[] sts=new State7[2];
		State7 state1=new State7("Jharkand","Ranchi");
		sts[0]=states;
		sts[1]=state1;
		c.updateState7(sts);
		c.displayCountry7Properties();
		
		Address7 address=new Address7("1st main",11,c);
		address.displayAddress7Properties();
		
		Developer7 dev=new Developer7("Sachin","sachin@gmail.com");
		Country7 country1=new Country7("Argentiana",79);
		Address7 address1=new Address7("10th cross",2,country1);
		Address7[] ads=new Address7[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress7(ads);
		dev.displayDeveloper7Properties();
		
		
		Application7 application=new Application7("Youtube",11.0,dev);
		application.displayApplication7Properties();
		application.displayDeveloper7Name();
		application.displayDeveloper7Address7Size();
		application.displayDeveloper7Country7State7Size();
		application.displayDeveloper7Address7Street();
		application.displayDeveloper7Country();
		application.displayDeveloper7CityName();
	}
}