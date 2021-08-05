class FaceBookTester
{

public static void main(String[] args)
{
FaceBook value=new FaceBook(124);
System.out.println("facebook version " + value.version);
FaceBook value1=new FaceBook("Mark Zugerberg");
System.out.println("facebook developer " + value1.leadDeveloper);
FaceBook value3=new FaceBook(124,"Mark Zugerberg");
System.out.println("facebook details "  +value3.leadDeveloper+ " " +value3.version);
FaceBook value4=new FaceBook(124,"Mark Zugerberg","Mar1980");
System.out.println("facebook details " +value4.version+ " " +value4.leadDeveloper+ " " +value4.releaseDate);





}
}