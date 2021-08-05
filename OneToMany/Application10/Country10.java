class Country10
{
	String name10;
	int code10;
	State10[] states;
	
Country10(String name10,int code10)
{
	this.name10=name10;
	this.code10=code10;
}
void updateState10(State10[] states)
{
	this.states=states;
}
void displayCountry10Properties()
{
	System.out.println("Country10Name:" +this.name10);
	System.out.println("Country10code:" +this.code10);
	System.out.println("State10Length:" +this.states.length);
	if(this.states!=null)
	{
	for(int i=0;i<this.states.length;i++)
	{
		this.states[i].displayState10Properties();
	}
	}
	
}
}