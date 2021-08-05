class WashingMachineTester
{
	public static void main (String[] args)
	{
		WashingMachine temp=new WashingMachine();
		temp.brand="IFB";
		temp.model="Elite Aqua Six";
		 int code=temp.hashCode();
		 System.out.println("HashCode: " +code);
		System.out.println(temp);
		temp.toString();
		//temp.equals();
		 
		 
	}
}