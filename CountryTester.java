class CountryTester
{
	public static void main(String[] args)
	{
		Country country=new Country("India",4567);
		State st1=new State("Karnataka","Banglore");
		State st2=new State("Bihar","Patna");
		State[] states=new State[2];
		states[0]=st1;
		states[1]=st2;
		country.updateState(states);
		country.displayProperties();
	}
}