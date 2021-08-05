class GymEquipment
{
	String name;
	EquipmentType type;
	double weight;
	String company;
	
GymEquipment(String name,EquipmentType type,double weight)
{
	this.name=name;
	this.type=type;
	this.weight=weight;
}
void setCompany(String company)
{
	this.company=company;
}
@Override
public int hashCode()
{
	System.out.println("invoked hashCode in GymEquipment");
	return 34;
}
@Override
public String toString()
{
	System.out.println("invoked toString in GymEquipment");
	return "GymEquipment";
}
public boolean equals(Object ref)
{
	System.out.println("invoked equals in GymEquipment");
	if(ref==null)
		return false;
	if(ref instanceof GymEquipment)
	{
		GymEquipment instance=(GymEquipment)ref;
		if(this.name.equals(instance.name)&&this.type.equals(instance.type)&&this.weight==instance.weight)
		{
			System.out.println("GymEquipment is equal");
			return true;
		}
		else
		{
			System.out.println("GymEquipment is not equal");
			return false;
		}
	}
	return false;
}
}