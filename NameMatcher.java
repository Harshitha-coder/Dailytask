class NameMatcher{

static String getFullName(String firstName){
System.out.println("invoked getFullName");
System.out.println(firstName);
String fullName="NA";

if(firstName.equals("Sunil")){
String sunilFullName="Sunil Chowdary";
 fullName=sunilFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Girija")){
String girijaFullName="Girija janagond";
fullName=girijaFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Mradula")){
String mradulaFullName="Mradula Shetty";
fullName=mradulaFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Sunita")){
String sunitaFullName="Sunia meti";
fullName=sunitaFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Pavitra")){
String pavitraFullName="Pavitra Dalawai";
fullName=pavitraFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Vaishnavi")){
String vaishnaviFullName="Vaishnavi Jatti";
fullName=vaishnaviFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Mahesh")){
String maheshFullName="Mahesh Reddy";
fullName=maheshFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Harshitha")){
String harshithaFullName="Harshitha Krishnappa";
fullName=harshithaFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

if(firstName.equals("Aishwarya")){
String aishwaryaFullName="Aishwarya Hp";
fullName=aishwaryaFullName;
System.out.println("fullName: " + fullName);
return fullName;
}
if(firstName.equals("Chandrashekar")){
String chandrashekarFullName="Chandrashekar Mv";
fullName=chandrashekarFullName;
System.out.println("fullName: " + fullName);
return fullName;
}

System.out.println("getFullname End");
return fullName;
}

}