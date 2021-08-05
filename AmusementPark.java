class AmusementPark
{
	String name;
	String lisenceNo;
	int noOfGames;
	String location;
	boolean waterGame;
	int ticketPrice;
	
AmusementPark(String name,String location,int noOfGames,int ticketPrice,boolean waterGame)
{
	this.name=name;
	this.location=location;
	this.noOfGames=noOfGames;
	this.ticketPrice=ticketPrice;
	this.waterGame=waterGame;
}
void setLisenceNo(String lisenceNo)
{
	this.lisenceNo=lisenceNo;
}
@Override
public int hashCode()
{
	System.out.println("invoked hashCode in AmusementPark");
	return 23;
}
@Override
public String toString()
{
	System.out.println("invoked toString in AmusementPark");
	return "AmusementPark";
}
@Override
public boolean equals(Object arg)
{
	System.out.println("invoked equals in AmusementPark");
	if(arg==null)
		return false;
	if(arg instanceof AmusementPark)
	{
		AmusementPark instance=(AmusementPark)arg;
		if(this.ticketPrice==instance.ticketPrice&&this.noOfGames==instance.noOfGames&&this.waterGame==instance.waterGame)
		{
			System.out.println("AmusementPark is equal");
			return true;
		}
		else
		{
			System.out.println("AmusementPark is not equal");
			return false;
		}
	}
		
	return false;
}
}