class Country5
{
  String name5;
  int code5;
  State5[] states;

Country5(String name5,int code5)
{
	this.name5=name5;
	this.code5=code5;
}
void updateState5(State5[] states)
{
	this.states=states;
}
void displayCountry5Properties()
{
	System.out.println("Country5Name: " +this.name5);
	System.out.println("Country5Code: " +this.code5);
	System.out.println("State5Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState5Properties();
		}
	}
	
	
	
}
}