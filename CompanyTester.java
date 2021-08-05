class  CompanyTester
{
	public static void main(String[] args)
	{
	Airplane airplane=new Airplane("6E458","Indigo");
	Airhostess hostess=new Airhostess("Akanksha Puri",35,Airhostess.DressCode.WESTERN,true);
	airplane.updateCapacityAndSeats(42,180);
	hostess.displayProperties();
	
	
	Airhostess[] host=new Airhostess[2];
	Airhostess hostess1=new Airhostess("Tara Roy",234,Airhostess.DressCode.INDIAN,true);
	Airhostess hostess2=new Airhostess("Nut Rage",454,Airhostess.DressCode.KOREAN,true);
	host[0]=hostess1;
	host[1]=hostess2;
	airplane.updateAirhostess(host);
	airplane.displayProperties();
	
	Company comp=new Company("Kingfisher");
	Airplane[] planes=new Airplane[3];
	Airplane ap1= new Airplane("SE001","SpiceJet");
	Airplane ap2= new Airplane("A1669","Air India");
	planes[0]=airplane;
	planes[1]=ap2;
	planes[2]=ap1;
	ap1.updateAirhostess(host);
	ap1.updateCapacityAndSeats(56,200);
	ap2.updateCapacityAndSeats(65,220);
	comp.updateAirplanes(planes);
	comp.displayAirplaneProperties();
	comp.displayAirhostessName();
	
	
	
	
	
	}
	
}