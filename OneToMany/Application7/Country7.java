class Country7
{
  String name7;
  int code7;
  State7[] states;

Country7(String name7,int code7)
{
	this.name7=name7;
	this.code7=code7;
}
void updateState7(State7[] states)
{
	this.states=states;
}
void displayCountry7Properties()
{
	System.out.println("Country7Name: " +this.name7);
	System.out.println("Country7Code: " +this.code7);
	System.out.println("State7Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState7Properties();
		}
	}
	
	
	
}
}