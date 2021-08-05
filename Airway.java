class Airway
{
String arrival;
String departure;
byte airHostess;

Airway(String arrivalOfAirway,String departureOfAirway,byte airHostessOfAirway)
{
System.out.println("invoked airway constructor");
arrival=arrivalOfAirway;
departure=departureOfAirway;
airHostess=airHostessOfAirway;
}

Airway()
{
System.out.println("invoked airway constructor");
}
}