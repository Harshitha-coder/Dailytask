class InvalidVoteAgeException extends Exception
{
	InvalidVoteAgeException()
	{
		System.out.println("InvalidVoteAgeException contsructor is created");
	}
	InvalidVoteAgeException(String message)
	{
		super(message);
	}
}