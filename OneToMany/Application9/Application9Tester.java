class Application9Tester
{
	public static void main(String[] args)
	{
		State9 states=new State9("Punjab","Chandigarh");
		states.displayState9Properties();
		
		Country9 c=new Country9("Iraq",101);
		State9[] sts=new State9[2];
		State9 state1=new State9("TamilNadu","Chennai");
		sts[0]=states;
		sts[1]=state1;
		c.updateState9(sts);
		c.displayCountry9Properties();
		
		Address9 address=new Address9("6th main",11,c);
		address.displayAddress9Properties();
		
		Developer9 dev=new Developer9("Sachin","sachin@gmail.com");
		Country9 country1=new Country9("England",195);
		Address9 address1=new Address9("4th cross",2,country1);
		Address9[] ads=new Address9[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress9(ads);
		dev.displayDeveloper9Properties();
		
		
		Application9 application=new Application9("Zoom",2.0,dev);
		application.displayApplication9Properties();
		application.displayDeveloper9Name();
		application.displayDeveloper9Address9Size();
		application.displayDeveloper9Country9State9Size();
		application.displayDeveloper9Address9Street();
		application.displayDeveloper9Country();
		application.displayDeveloper9CityName();
	}
}