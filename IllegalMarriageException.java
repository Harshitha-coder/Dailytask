class IllegalMarriageException extends Exception
{
	
	IllegalMarriageException()
	{
		System.out.println("IllegalMarriageException constructor is created");
	}
	IllegalMarriageException(String message)
	{
		super(message);
	}
}