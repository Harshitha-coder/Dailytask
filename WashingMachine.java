 class WashingMachine
 {
	 String brand;
	 String model;
WashingMachine()
{
	System.out.println("Default constructor");
}	
void setWashingMachine( String brand,String model)
{
	this.brand=brand;
	this.model=model;
}	
public int hashCode()
{
	System.out.println("invoked hashcode from washingMachine");
	int valueFromParentClass=super.hashCode();
	System.out.println(valueFromParentClass);
	return 56784;
} 
/*@Override
public boolean equals(Object obj)
{
	System.out.println("invoked equals from washingMachine");
	return true;
	
}*/
@Override
public String toString()
{
	return brand+""+ model;
}
 }