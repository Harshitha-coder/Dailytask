class DeveloperTester
{
	public static void main(String[] args)
	{
		DeveloperDetails developer=new DeveloperDetails("Harshitha","harshithak794@gmail.com");
		 Address address1=new Address("3rd main",45,Address.Country.INDIA);
		 Address address2=new Address("5th main",25,Address.Country.INDIA);
		 Address[] adrs=new Address[2];
		 adrs[0]=address1;
		 adrs[1]=address2;
		 developer.updateAddress(adrs);
		 developer.displayProperties();
		 
		
	}
}