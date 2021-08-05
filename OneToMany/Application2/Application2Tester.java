class Application2Tester
{
	public static void main(String[] args)
	{
		State2 state=new State2("Assam","Dispur");
		state.displayState2Properties();
		
		Country2 country=new Country2("Brazil",5674);
		State2[] sts=new State2[2];
		State2 state2=new State2("HP","Shimla");
		sts[0]=state;
		sts[1]=state2;
		country.updateState2(sts);
		country.displayCountry2Properties();
		
		Address2 address=new Address2("17th cross",123,country);
		address.displayAddress2Properties();
		
		Developer2 dev=new Developer2("Ranjita","ranjita123@gmail.com");
		Country2 country1=new Country2("America",564);
		Address2 address1=new Address2("23rd main",190,country1);
		Address2[] ads=new Address2[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress2(ads);
		dev.displayDeveloper2Properties();
		
		
		Application2 application=new Application2("FB",7.8,dev);
		application.displayApplication2Properties();
		application.displayDeveloper2Name();
		application.displayDeveloper2Address2Size();
		application.displayDeveloper2Country2State2Size();
		application.displayDeveloper2Address2Street();
		application.displayDeveloper2Country();
		application.displayDeveloper2CityName();
	}
}