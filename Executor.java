class Executor{

static void execute(int percentage){

System.out.println("invoked execute");
System.out.println(percentage);
if(percentage>60){
System.out.println("First class");
return;
}
if(percentage>70){
System.out.println("Distinction class");
return;
}
if(percentage<60){
System.out.println("Smart class");
return;
}
System.out.println("execute End");
return;
}
}