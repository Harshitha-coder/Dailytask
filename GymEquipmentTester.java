class GymEquipmentTester
{
	public static void main(String[] args)
	{
		GymEquipment gym=new GymEquipment("TreadMill",EquipmentType.SOLEF63,140);
		gym.setCompany("LifeSpan");
		
		GymEquipment gym1=new GymEquipment("Dumbbell",EquipmentType.ADJUSTABLE,20);
		gym1.setCompany("Bowflex");
		System.out.println(gym1.hashCode());
		System.out.println(gym.hashCode());
		
		System.out.println("Both are equal:" +gym1.equals(gym));
	}
}