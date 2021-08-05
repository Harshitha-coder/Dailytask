class Person
{
String name =new String("Dharshan");
Gender gender;
BloodGroup bg;
Aadhar a=new Aadhar("24/04/1998",true);
Aadhar b=new Aadhar("13/08/1999",true);

Person()
{
System.out.println("invoked person constructor");	
}

Person(String name,Gender gender,BloodGroup bloodGroup)
{
System.out.println("invoked person constructor");
this.name=name;
this.gender=gender;
bg=bloodGroup;
}

void displayDetails()
{
	System.out.println(this.name);
	System.out.println(this.gender);
	System.out.println(bg);
}

enum Gender
{
 M,F,T
}

enum BloodGroup
{
A,B,O,AB,Anegative,Onegative,NA
}
}