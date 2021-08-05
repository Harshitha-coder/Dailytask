class EmailValidatorTester
{
	public static void main(String[] args)
	{
		EmailValidator validator=new EmailValidator();
		try{
		 boolean valid =validator.validateEmail("harshitha@gmail.com");
		 System.out.println(valid);
		}
		catch(EmailValidatorException exp)
		{
			System.out.println("EmailValidatorException handler");
			exp.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Generic handler");
		}
	}
}