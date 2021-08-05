class RadioStation
{
	String name;
	double frequency;
	int noOfAudience;
	
RadioStation(String name,double frequency)
{
	this.name=name;
	this.frequency=frequency;
}
void setNoOfAudience(int noOfAudience)
{
	this.noOfAudience=noOfAudience;
}
@Override
public int hashCode()
{
	System.out.println("invoked hashCode in RadioStation");
	return 345;
}
@Override
public String toString()
{
	System.out.println("invoked toString in RadioStation ");
	return "RadioStation";
}
@Override
public boolean equals(Object arg)
{
	System.out.println("invoked equals in RadioStation");
	if(arg==null)
		return false;
	if(arg instanceof RadioStation)
	{
		RadioStation instance=(RadioStation)arg;
		if(this.name.equals(instance.name)&&this.frequency==instance.frequency)
		{
			System.out.println("RadioStation is equals");
			return true;
		}
		else
		{
			System.out.println("RadioStationis  not equal");
			return false;
		}
	}
	return false;
}
}