class Laptop{
static String brand;
static double memory;


public static void display(){

System.out.println("invoked display()");
System.out.println(brand);
System.out.println(memory);
System.out.println("exit display()");

}
public static void changeMemory(){
System.out.println("invoked changeMemory()");
memory=8;
System.out.println(memory);
System.out.println("exit changeMemory()");
}

public static void changeBrand(){
System.out.println("invoked changeBrand()");
brand="dell";
System.out.println(brand);
System.out.println("exit changeBrand()");
}
}
