class ITCompany
{
String nameOfTechPark;
boolean goodAmbience;
String location;
double investment;
Developer[] developers;


ITCompany( String nameOfTechPark,boolean goodAmbience,String location,double investment)
{
	this.nameOfTechPark=nameOfTechPark;
	this.goodAmbience=goodAmbience;
	this.location=location;
	this.investment=investment;	
}

void initDevelopers(Developer[] developers)
{
    this.developers=developers;
	
}

void displayProperties()
{
	System.out.println("nameOfTechPark : " + this.nameOfTechPark);
	System.out.println("goodAmbience: " + this.goodAmbience);
	System.out.println("location: " + this.location);
	System.out.println("investment: " + this.investment);
	System.out.println("developers: " + this.developers.length);
	for(int i=0;i<this.developers.length;i++)
	{
		this.developers[i].displayProperties();
		
		
		
	}


	
		
}
}