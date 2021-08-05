class Players
{
String name;
int noOfGamesPlayed;
int jerseyNo;
int yearsOfExp;
String[] clubsRepresented;

Players(String name,int noOfGamesPlayed,int jerseyNo,int exp)
{
	this.name=name;
	this.noOfGamesPlayed=noOfGamesPlayed;
	this.jerseyNo=jerseyNo;
	this.yearsOfExp=exp;
}

void initclubsRepresented(String[] clubsRepresented)
{
	this.clubsRepresented=clubsRepresented;
}
void displayProperties()
{
	System.out.println("name: " +this.name);
	System.out.println("noOfGamesPlayed: " +this.noOfGamesPlayed);
	System.out.println("jerseyNo: " +this.jerseyNo);
	System.out.println("yearsOfExp: " +this.yearsOfExp);
	if(this.clubsRepresented!=null)
	{
	for(int i=0;i<this.clubsRepresented.length;i++)
	{
	System.out.println("clubsRepresented :" +this.clubsRepresented[i]);
	}
	}
}
}