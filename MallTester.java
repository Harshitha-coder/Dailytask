class MallTester
{
	public static void main(String[] args)
	{
		Mall temp=new Mall("Orion","Rajajinagar");
		temp.setAmbience(true);
		temp.setNoOfFloor(5);
		
		Mall temp1=new Mall("Esteem","Hebbal");
		temp1.setAmbience(true);
		temp1.setNoOfFloor(4);
		
		System.out.println("Both are equal:"+temp.equals(temp1));
	}
}