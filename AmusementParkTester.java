class AmusementParkTester
{
	public static void main(String[] args)
	{
		AmusementPark ap=new AmusementPark("Wonderla","Bidadi",70,1250,true);
		AmusementPark ap1=new AmusementPark("FunWorld","JCNagar",30,500,true);
		AmusementPark ap2=new AmusementPark("Wonderla","Bidadi",70,1250,true);

		System.out.println("Both are equal:"+ap2.equals(ap));
	}
}