class Application5Tester
{
	public static void main(String[] args)
	{
		State5 states=new State5("Mizoram","Aizawal");
		states.displayState5Properties();
		
		Country5 c=new Country5("Greece",1311);
		State5[] sts=new State5[2];
		State5 state1=new State5("Rajasthan","Jaipur");
		sts[0]=states;
		sts[1]=state1;
		c.updateState5(sts);
		c.displayCountry5Properties();
		
		Address5 address=new Address5("4th main",12,c);
		address.displayAddress5Properties();
		
		Developer5 dev=new Developer5("Sunita","sunita@gmail.com");
		Country5 country1=new Country5("Belgium",89);
		Address5 address1=new Address5("7th cross",190,country1);
		Address5[] ads=new Address5[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress5(ads);
		dev.displayDeveloper5Properties();
		
		
		Application5 application=new Application5("SnapChat",3.8,dev);
		application.displayApplication5Properties();
		application.displayDeveloper5Name();
		application.displayDeveloper5Address5Size();
		application.displayDeveloper5Country5State5Size();
		application.displayDeveloper5Address5Street();
		application.displayDeveloper5Country();
		application.displayDeveloper5CityName();
	}
}