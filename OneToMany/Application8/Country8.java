class Country8
{
  String name8;
  int code8;
  State8[] states;

Country8(String name8,int code8)
{
	this.name8=name8;
	this.code8=code8;
}
void updateState8(State8[] states)
{
	this.states=states;
}
void displayCountry8Properties()
{
	System.out.println("Country8Name: " +this.name8);
	System.out.println("Country8Code: " +this.code8);
	System.out.println("State8Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState8Properties();
		}
	}
	
	
	
}
}