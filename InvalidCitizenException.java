class InvalidCitizenException extends Exception
{
	InvalidCitizenException()
	{
		System.out.println("InvalidCitizenException constructor is created");
	}
	InvalidCitizenException(String message)
	{
		super(message);
	}
}