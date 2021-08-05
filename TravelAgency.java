class TravelAgency{
static String[] agencies=new String[5];
static int index=0;

static void addAgency(String agencyName)
{
System.out.println("invoked addAgency");
System.out.println("agencyName " + agencyName);
agencies[index]=agencyName;
index++;
}

static void displayAgencies()
{
	for(int indexof=0;indexof<agencies.length;)
	{
		System.out.println(agencies[indexof]);
		indexof++;
	}
}
static void displayAgencyAtIndex(int newIndex)
{
	if(newIndex<=4)
	{
		System.out.println("Index found");
	System.out.println(agencies[newIndex]);
	}
}
static void printFoundIfAgency(String agencyName)
{
	for(int tempIndex=0;tempIndex<agencies.length;)
	{
		String agency=agencies[tempIndex];
		if(agencyName.equals(agency))
			System.out.println("Found");
		tempIndex++;
	}
	
}
}




