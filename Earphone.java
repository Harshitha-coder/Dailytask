class Earphone{
static String color;
static double price;
static boolean connected;

public static void sound(){

System.out.println("invoked sound()");
System.out.println(connected);
if(connected)
{
System.out.println("playing");
System.out.println(price);
System.out.println(color);
}
else
{
System.out.println("not playing");
}
System.out.println("exit sound()");
}
}
