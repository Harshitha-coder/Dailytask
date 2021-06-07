class PersonInfo{
static String name;
static long contactNo;
static Gender gender=Gender.Female;
static PersonStatus status=PersonStatus.Single;

static void setInfo(String newName,long newContactNo,Gender newGender,PersonStatus newStatus){
System.out.println("invoked setInfo()");
System.out.println(newName);
System.out.println(newContactNo);
System.out.println(newGender);
System.out.println(newStatus);
name=newName;
contactNo=newContactNo;
gender=newGender;
status=newStatus;
}

static void displayAll(){
System.out.println("invoked displayAll()");
System.out.println(name);
System.out.println(contactNo);
System.out.println(gender);
System.out.println(status);
}





}