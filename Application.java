class Application{
static String[] applications=new String[10];
static int index=0;

static void addApplication(String applicationName)
{
System.out.println("invoked addApplication");
System.out.println("applicationName " + applicationName);
applications[index]=applicationName;
index++;
}

static void displayApplications()
{
	for(int indexof=0;indexof<applications.length;)
	{
		System.out.println(applications[indexof]);
		indexof++;
	}
}
static void displayApplicationAtIndex(int newIndex)
{
	if(newIndex<=9)
	{
		System.out.println("Index found");
	System.out.println(applications[newIndex]);
	}
	
		
}
static void printFoundIfApplication(String appName)
{
	for(int tempIndex=0;tempIndex<applications.length;tempIndex++)
	{
		String application=applications[tempIndex];
		if(application.equals(application))
		System.out.println("Found");
	     break;
	}

}
}



