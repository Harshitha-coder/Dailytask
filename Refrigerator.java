class Refrigerator{
static double capacity;
static boolean opened;

public static void open(){

System.out.println("invoked open()");
opened=true;
System.out.println(opened);
System.out.println("exit open()");
}

public static void close(){

System.out.println("invoked close()");
opened=false;
System.out.println(opened);
System.out.println("exit close()");
}

public static void displayopened(){

System.out.println("invoked displayopened()");
System.out.println("opened");
System.out.println(capacity);
System.out.println("exit displayopened()");
}

}
