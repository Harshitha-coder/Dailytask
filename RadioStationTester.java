class RadioStationTester
{
	public static void main(String[] args)
	{
		RadioStation station=new RadioStation("RadioMirchi",98.3);
		station.setNoOfAudience(6500);
		
		RadioStation station1=new RadioStation("RadioCity",91.1);
		station.setNoOfAudience(6500);
		
		RadioStation station2=new RadioStation("RadioMirchi",98.3);
		station.setNoOfAudience(6500);
		
		System.out.println("Both are equal:"+station2.equals(station));
	}
}