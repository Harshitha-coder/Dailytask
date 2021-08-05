class Country1
{
  String name1;
  int code1;
  State1[] states;

Country1(String name1,int code1)
{
	this.name1=name1;
	this.code1=code1;
}
void updateState1(State1[] states)
{
	this.states=states;
}
void displayCountry1Properties()
{
	System.out.println("Country1Name: " +this.name1);
	System.out.println("Country1Code: " +this.code1);
	System.out.println("State1Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState1Properties();
		}
	}
	
	
	
}
}