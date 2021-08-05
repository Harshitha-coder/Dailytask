class State
{
	String name;
	String capitalCityName;
	
State(String name,String capitalCityName)
{
	this.name=name;
	this.capitalCityName=capitalCityName;
}

void displayProperties()
{
	System.out.println("State name: " +this.name);
	System.out.println("capitalCityname: " +this.capitalCityName);
	
}
}