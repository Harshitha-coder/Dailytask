class Country9
{
  String name9;
  int code9;
  State9[] states;

Country9(String name9,int code9)
{
	this.name9=name9;
	this.code9=code9;
}
void updateState9(State9[] states)
{
	this.states=states;
}
void displayCountry9Properties()
{
	System.out.println("Country9Name: " +this.name9);
	System.out.println("Country9Code: " +this.code9);
	System.out.println("State9Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState9Properties();
		}
	}
	
	
	
}
}