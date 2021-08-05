class HeadPhoneTester
{
	public static void main(String[] args)
	{
		
	HeadPhone name1=new HeadPhone();
	name1.model="Sony";
	name1.setType=HeadSetType.ClosedBack;
	name1.weight=5;
	System.out.println(name1.model);
	System.out.println(name1.setType);
	System.out.println(name1.weight);

    HeadPhone name2=new HeadPhone();
	name2.model="Samsung";
	name2.setType=HeadSetType.OpenBack;
	name2.weight=6;
	System.out.println(name2.model);
	System.out.println(name2.setType);
	System.out.println(name2.weight);

    HeadPhone name3=new HeadPhone();
	name3.model="Sony";
	name3.setType=HeadSetType.OnEar;
	name3.weight=4;
	System.out.println(name3.model);
	System.out.println(name3.setType);
	System.out.println(name3.weight);

	}

}