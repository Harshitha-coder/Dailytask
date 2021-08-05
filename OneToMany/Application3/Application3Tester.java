class Application3Tester
{
	public static void main(String[] args)
	{
		State3 state=new State3("AP","Itanagar");
		state.displayState3Properties();
		
		Country3 country=new Country3("Italy",1001);
		State3[] sts=new State3[2];
		State3 state1=new State3("HP","Shimla");
		sts[0]=state;
		sts[1]=state1;
		country.updateState3(sts);
		country.displayCountry3Properties();
		
		Address3 address=new Address3("21st main",11,country);
		address.displayAddress3Properties();
		
		Developer3 dev=new Developer3("Sowmya","sowmya199@gmail.com");
		Country3 country1=new Country3("Germany",99);
		Address3 address1=new Address3("6th main",190,country1);
		Address3[] ads=new Address3[2];
		ads[0]=address;
		ads[1]=address1;
		dev.updateAddress3(ads);
		dev.displayDeveloper3Properties();
		
		
		Application3 application=new Application3("FB",7.8,dev);
		application.displayApplication3Properties();
		application.displayDeveloper3Name();
		application.displayDeveloper3Address3Size();
		application.displayDeveloper3Country3State3Size();
		application.displayDeveloper3Address3Street();
		application.displayDeveloper3Country();
		application.displayDeveloper3CityName();
	}
}