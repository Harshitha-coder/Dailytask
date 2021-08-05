class Refrigerator
{
String color;
double price;
Type type;
int noOfDoors=2;
Stabilizer stab;

enum Type{
	
SIDEBYSIDE,FRENCHDOOR,TOPFREEZER,BOTTOMFREEZER
}

Refrigerator(String color,double price)
{
this.color=color;
this.price=price;
}
void initStab(Stabilizer stab,Type type)
{
this.stab=stab;
this.type=type;
}
void displayProperties()
{
System.out.println("color : " +this.color);
System.out.println("price : " +this.price);
System.out.println("type : " +this.type);
System.out.println("noOfDoors: " +noOfDoors);
System.out.println("maxVoltage : " +this.stab.maxVoltage);
System.out.println("working :" +this.stab.working);
System.out.println("noOfFuse :" +this.stab.noOfFuse);


}
}
