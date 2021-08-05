class Sport
{
String name;
String[] sponsors;
String originatedCountry;
String mostPlayed;
Players[] players;

Sport(String name,String originatedCountry,String mostPlayed)
{
	this.name=name;
	this.originatedCountry=originatedCountry;
	this.mostPlayed=mostPlayed;
}
void initSponsors(String[] sponsors)
{
	this.sponsors=sponsors;
	
}
void updatePlayers(Players[] players)
{
	this.players=players;
	
}
void displayProperties()
{
	
	System.out.println("name: " +this.name);
	System.out.println("originatedCountry: " +this.originatedCountry);
	System.out.println("mostPlayed: " +this.mostPlayed);
	for(int i=0;i<this.sponsors.length;i++)
	{
	System.out.println("Sponsors :" +this.sponsors[i]);
	}
	
	if(this.players!=null)
	{
		for(int index=0;index<this.players.length;index++)
		{
			this.players[index].displayProperties();
		}
	}
	
}
}