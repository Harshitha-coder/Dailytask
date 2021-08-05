class Country6
{
  String name6;
  int code6;
  State6[] states;

Country6(String name6,int code6)
{
	this.name6=name6;
	this.code6=code6;
}
void updateState6(State6[] states)
{
	this.states=states;
}
void displayCountry6Properties()
{
	System.out.println("Country6Name: " +this.name6);
	System.out.println("Country6Code: " +this.code6);
	System.out.println("State6Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState6Properties();
		}
	}
	
	
	
}
}