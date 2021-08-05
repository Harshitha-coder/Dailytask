class FaceBook
{
int version;
String leadDeveloper;
String releaseDate;

FaceBook(int newVersion)
{
System.out.println("invoked facebook constructor");
version=newVersion;
}

FaceBook(String developer)
{
System.out.println("invoked facebook constructor");
leadDeveloper=developer;
}

FaceBook(int newVersion,String developer)
{
System.out.println("invoked facebook constructor");
version=newVersion;
leadDeveloper=developer;
}

FaceBook(int newVersion,String developer,String released)
{
System.out.println("invoked facebook constructor");
version=newVersion;
leadDeveloper=developer;
releaseDate=released;
}


FaceBook(String developer,String released)
{
System.out.println("invoked facebook constructor");
leadDeveloper=developer;
releaseDate=released;
}





}