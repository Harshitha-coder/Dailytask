class ValidIndianCitizen
{
	boolean validateCitizen(String name, String bornPlace,boolean naturalisation,boolean registration,boolean descent)throws InvalidCitizenException
	{
		System.out.println("running validateCitizen method ");
		if(name.equals("Harshitha")&&bornPlace.equals("Chickballapur")&&naturalisation==true&&registration==true&&descent==true)
		{
			System.out.println("IndianCitizen is valid");
			return true;
		}
		InvalidCitizenException temp=new InvalidCitizenException();
		throw temp;
	}
}
