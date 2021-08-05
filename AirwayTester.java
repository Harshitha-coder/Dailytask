class AirwayTester
{
public static  void main(String[] args)
{
Airway value=new Airway();
value.arrival="Kia";
value.departure="Kocchi";
value.airHostess=5;
System.out.println(" arrival " + value.arrival);
System.out.println(" departure " + value.departure);
System.out.println(" airHostess " + value.airHostess);

Airway temp=new Airway();
temp.arrival="Kia";
temp.departure="Mp";
temp.airHostess=10;
System.out.println(" arrival " + temp.arrival);
System.out.println(" departure " + temp.departure);
System.out.println(" airHostess " + temp.airHostess);

Airway temp1=new Airway();
System.out.println(" arrival " + temp1.arrival);
System.out.println(" departure " + temp1.departure);
System.out.println(" airHostess " + temp1.airHostess);


}


}