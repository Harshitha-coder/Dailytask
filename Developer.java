class Developer
{
double salary;
String name;
Designation desg;
int totalExp;
String[] technologies;

Developer(String name,Designation desg)
{
	this.name=name;
	this.desg=desg;
	
}
void updateSalaryAndExp(int totalExp,double salary)
{
	this.totalExp=totalExp;
	this.salary=salary;
}

void init(String[] technologies)
{
	this.technologies=technologies;
}

void displayProperties()
{
	System.out.println("name : " + this.name);
	System.out.println("designation : " + this.desg);
	System.out.println("salary : " + this.salary);
	System.out.println("totalExp : " + this.totalExp);
	if(this.technologies!=null)
	{
	for(int i=0;i<this.technologies.length;i++)
	{
		System.out.println("technologies :" +this.technologies[i]);
	}
	}
}

enum Designation{
	FrontEnd,Web,FullStack,Python
}
}
