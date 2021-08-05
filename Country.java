class Country
{
  String name;
  int code;
  State[] states;

Country(String name,int code)
{
	this.name=name;
	this.code=code;
}
void updateState(State[] states)
{
	this.states=states;
}
void displayProperties()
{
	System.out.println("Country name: " +this.name);
	System.out.println("Country code: " +this.code);
	System.out.println("States length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayProperties();
		}
	}
	
	
	
}
}