class SportTester
{
public static void main(String[] args)
{
Sport sp=new Sport("Cricket","England","India");
Players player1=new Players("Sachin Tendulkar",463,10,30);
String[] sps=new String[2];
sps[0]="Paytm";
sps[1]="Byjus";
sp.initSponsors(sps);
 
 
 String[] clubs=new String[2];
 clubs[0]="Madras";
 clubs[1]="Banglore";
 player1.initclubsRepresented(clubs);
 player1.displayProperties();
 
 Players[] players=new Players[2];
 Players ply1=new Players("ViratKohli",91,18,13);
 Players ply2=new Players("SureshRaina",226,3,21);
 players[0]=ply1;
 players[1]=ply2;
 
 String[] clbs=new String[2];
 clbs[0]="chennai";
 clbs[1]="Delhi";
 ply1.initclubsRepresented(clbs);
 ply2.initclubsRepresented(clbs);
 sp.updatePlayers(players);
 sp.displayProperties();
 
 
 
 
 
}
}