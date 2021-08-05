class Country2
{
  String name2;
  int code2;
  State2[] states;

Country2(String name2,int code2)
{
	this.name2=name2;
	this.code2=code2;
}
void updateState2(State2[] states)
{
	this.states=states;
}
void displayCountry2Properties()
{
	System.out.println("Country2Name: " +this.name2);
	System.out.println("Country2Code: " +this.code2);
	System.out.println("State2Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState2Properties();
		}
	}
	
	
	
}
}