class LegalMarriageAgeTester
{
public static void main(String[] args)
{
	LegalMarriageAge legal=new LegalMarriageAge();
	try
	{
		boolean valid=legal.validateAge(LegalMarriageAge.Gender.FEMALE,17);
		System.out.println(valid);
	}
	catch(IllegalMarriageException exp)
	{
		System.out.println("IllegalMarriageException handler");
		exp.printStackTrace();
	}
	
}
}