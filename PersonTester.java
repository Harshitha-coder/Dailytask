class PersonTester
{
 public static void main(String[] args)
 {
 Person value= new Person();
 System.out.println(value.name);
 System.out.println(value.gender);
 System.out.println(value.bg);
 System.out.println(value.a.number); 
 System.out.println(value.a.dob);
 System.out.println(value.a.phoneLinked);

 
 Person person= new Person("Harshitha",Person.Gender.F,Person.BloodGroup.B);
 System.out.println(person.name);
 System.out.println(person.gender);
 System.out.println(person.bg);
 System.out.println(person.b.number); 
 System.out.println(person.b.dob);
 System.out.println(person.b.phoneLinked);

 
 }

}