class Airplane
{
String flightNo;
String flightName;
double fuelCapacity;
int Seat;
Airhostess[] airhostess;

Airplane(String flightNo,String flightName)
{
   this.flightNo=flightNo;
   this.flightName=flightName;
}
void updateCapacityAndSeats(double fuelCapacity,int Seat)
{
	this.fuelCapacity=fuelCapacity;
	this.Seat=Seat;
}

void updateAirhostess(Airhostess[] airhostess)
{
	
	this.airhostess= airhostess;
}

void displayProperties()
{
	System.out.println("flightNo: " +this.flightNo);
	System.out.println("flightName: " +this.flightName);
	System.out.println("fuelCapacity: " +this.fuelCapacity);
	System.out.println("Seat: " +this.Seat);
	System.out.println("airhostess length: " +this.airhostess.length);
	if(this.airhostess!=null)
	{
	for(int i=0;i<this.airhostess.length;i++)
	{
		this.airhostess[i].displayProperties();
	}
	}
	
}




}