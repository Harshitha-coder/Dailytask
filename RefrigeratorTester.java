class RefrigeratorTester
{
public static void main(String[] args)
{
Refrigerator ref=new Refrigerator("Blue",35000);
Stabilizer stabl=new Stabilizer(290,true,1);
ref.initStab(stabl,Refrigerator.Type.TOPFREEZER);
  
 ref.displayProperties();

}

}