class ITCompanyTester
{
public static void main(String[] args)
{
Developer developer=new Developer("Harshitha",Developer.Designation.FullStack);
ITCompany company=new ITCompany("Embassy TechVillage",true,"Devarabisanahalli",3);
developer.updateSalaryAndExp(0,25000);
String[] techs=new String[3];
techs[0]="java";
techs[1]="sql";
techs[2]="html";
developer.init(techs);
developer.displayProperties();
Developer dev1=new Developer("Sunita",Developer.Designation.Web);
Developer dev2=new Developer("Ranjita",Developer.Designation.FullStack);
Developer[] developers=new Developer[2];
developers[0]=dev1;
developers[1]=dev2;
dev1.updateSalaryAndExp(0,28000);
dev2.updateSalaryAndExp(0,25000);
company.initDevelopers(developers);
company.displayProperties();

}




}