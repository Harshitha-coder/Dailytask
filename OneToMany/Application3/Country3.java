class Country3
{
  String name3;
  int code3;
  State3[] states;

Country3(String name3,int code3)
{
	this.name3=name3;
	this.code3=code3;
}
void updateState3(State3[] states)
{
	this.states=states;
}
void displayCountry3Properties()
{
	System.out.println("Country3Name: " +this.name3);
	System.out.println("Country3Code: " +this.code3);
	System.out.println("State3Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState3Properties();
		}
	}
	
	
	
}
}