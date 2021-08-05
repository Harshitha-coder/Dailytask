class Country4
{
  String name4;
  int code4;
  State4[] states;

Country4(String name4,int code4)
{
	this.name4=name4;
	this.code4=code4;
}
void updateState4(State4[] states)
{
	this.states=states;
}
void displayCountry4Properties()
{
	System.out.println("Country4Name: " +this.name4);
	System.out.println("Country4Code: " +this.code4);
	System.out.println("State4Length: " +this.states.length);
	if(this.states!=null)
	{
		for(int i=0;i<this.states.length;i++)
		{
			this.states[i].displayState4Properties();
		}
	}
	
	
	
}
}