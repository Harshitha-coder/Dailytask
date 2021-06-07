class PersonInfoTester{

public static void main(String[] num){
PersonInfo.displayAll();
String name="Harshitha";
long contactNo=7899186099l;
PersonInfo.setInfo(name,contactNo,Gender.Female,PersonStatus.Single);
PersonInfo.displayAll();
}
}