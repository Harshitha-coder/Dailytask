class LegalVoteAge
{
	boolean validateAge(int age)throws InvalidVoteAgeException
	{
		System.out.println("running validateAge method");
		if(age>=18)
		{
			System.out.println("voteAge is legal");
			return true;
		}
		
		InvalidVoteAgeException temp=new InvalidVoteAg eException();
		throw temp;
	}
}