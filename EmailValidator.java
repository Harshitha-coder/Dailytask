class EmailValidator
{
boolean validateEmail(String email)throws EmailValidatorException 
{
	System.out.println("created validateEmail method");
	if(email.contains("@")&&(email.endsWith(".in")||email.endsWith(".com")))
	{
		System.out.println("Email is equal");
		return true;
	}
	
	
	EmailValidatorException temp=new EmailValidatorException();
	throw temp;
}
}