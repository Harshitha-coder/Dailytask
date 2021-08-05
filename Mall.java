class Mall
{
	String name;
	String location;
	boolean ambience;
	int noOfFloor;
	
Mall(String name,String location)
{
	this.name=name;
	this.location=location;
}
void setAmbience(boolean ambience)
{
	this.ambience=ambience;
}
void setNoOfFloor(int noOfFloor)
{
	this.noOfFloor=noOfFloor;
}
@Override
public int hashCode()
{
	System.out.println("invoked hashCode in Mall");
	return 13;
}
@Override
public String toString()
{
	System.out.println("invoked toString in Mall");
	return "Mall";
}
@Override
public boolean equals(Object ref)
{
	System.out.println("invoked equals in Mall");
	if(ref==null)
	{
		return false;
	}
		if(ref instanceof Mall)
		{
			Mall instance=(Mall)ref;
			if(this.name.equals(instance.name)&&this.location.equals(instance.location))
			{
			System.out.println("Mall is equal");
			return true;
			}
			else
		{
				System.out.println("Mall is not equal");
				return false;
		}

		}

			System.out.println("equals method is failed");
	
	
	return false;
}
}