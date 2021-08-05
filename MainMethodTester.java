class MainMethodTester
{

public static void main(String[] arguments)
{
 System.out.println(arguments.length);
 for(int mainIndex=0;mainIndex<arguments.length;mainIndex++)
 {
	  System.out.print(arguments[mainIndex]);
	  String arg=arguments[mainIndex];
	  Application.addApplication(arg);
 }


}
} 