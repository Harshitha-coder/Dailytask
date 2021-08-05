class ValidIndianCitizenTester
{
	public static void main(String[] args)
	{
		ValidIndianCitizen valid=new ValidIndianCitizen();
		try
		{
		boolean val=valid.validateCitizen("Harshitha","Banglore",true,true,true);
		System.out.println(val);
		}
		catch(InvalidCitizenException exp)
		{
			System.out.println("InvalidCitizenException handler");
			exp.printStackTrace();
			
		}
		finally
	   {
		   System.out.println("finally block executed");
	   }
	}
}
