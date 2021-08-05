class ErrorTester
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("inside try");
			String name="Harshitha";
			OutOfMemoryError memory=new OutOfMemoryError();
			throw memory;
		}
		catch(RuntimeException err)
		{
			System.out.println("OutOfMemoryError handler");
			err.printStackTrace();
		}
	}
}