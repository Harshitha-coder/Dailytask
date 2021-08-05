class EmailValidatorException extends Exception
{
	EmailValidatorException()
	{
		System.out.println("Default EmailValidatorEcxeption constructor");
	}
	EmailValidatorException(String message)
	{
		super(message);
	}
}