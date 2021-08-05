class LegalMarriageAge
{
	boolean validateAge(Gender gender,double age)throws IllegalMarriageException
	{
		System.out.println("running validateAge method");
		if((gender.equals(Gender.FEMALE)&&age>=18)||(gender.equals(Gender.MALE)&&age>=21))
		{
			System.out.println("MarriageAge is legal");
			return true;
		}
		
		IllegalMarriageException exp=new IllegalMarriageException();
	    throw exp;
	}

	
	enum Gender
	{
		FEMALE,MALE,OTHERS;
	}
}
