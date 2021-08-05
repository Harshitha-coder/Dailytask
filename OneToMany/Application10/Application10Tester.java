class Application10Tester
{
	public static void main(String[] args)
	{
		State10 s1=new State10("Telegana","Hyderabad");
		s1.displayState10Properties();
		
		Country10 c=new Country10("Afganisthan",1456);
		State10[] states=new State10[2];
		State10 s2=new State10("UP","Lucknow");
		states[0]=s1;
		states[1]=s2;
		c.updateState10(states);
		c.displayCountry10Properties();
		
		Address10 a=new Address10("12th cross",13,c);
		a.displayAddress10Properties();
		
		Developer10 d1=new Developer10("Aishwarya","aishwarya@gmail.com");
		Country10 c1=new Country10("Singapoor",146);
		Address10[] ad=new Address10[2];
		Address10 a1=new Address10(" 1st main",10,c1);
		ad[0]=a;
		ad[1]=a1;
		d1.updateAddress10(ad);
		d1.displayDeveloper10Properties();
		
		Application10 ap=new Application10("CandyCrush",3.1f,d1);
		ap.displayApplication10Properties();
		ap.displayDeveloper10Name();
		ap.displayDeveloper10Address10Size();
		ap.displayDeveloper10Country10State10Size();
		ap.displayDeveloper10Address10Street();
		ap.displayDeveloper10Country10();
		ap.displayDeveloper10CityName();
	}
}