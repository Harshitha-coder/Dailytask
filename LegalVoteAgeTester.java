class  LegalVoteAgeTester
{
	public static void main(String[] args)
	{
       LegalVoteAge legal=new LegalVoteAge();
	   try
	   {
	   boolean valid=legal.validateAge(15);
	   System.out.println(valid);
	   }
	   catch(InvalidVoteAgeException exp)
	   {
		   System.out.println("InvalidVoteAgeException handler");
		   exp.printStackTrace();
	   }
	   finally
	   {
		   System.out.println("finally block executed");
	   }
	}
}
