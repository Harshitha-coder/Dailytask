class ActorArrayTester{

public static void main(String[] array){
    String[] actorNames={"Dharshan","Vijay","Vijay Devarakonda","Nivetha Thomas","Sunny Leone","Suriya",
	                   "Yash","Siddarth","Alia Bhatt","Samantha"};
	System.out.println("actorNames.length " + actorNames.length);
	for( int indexofActor=0;indexofActor<actorNames.length;) 
	{
		String tempActor=actorNames[indexofActor];
		System.out.println(tempActor);
		System.out.println("current index is : " + indexofActor);
		if(tempActor.equals("Sunny Leone")){
			System.out.println(" Sachin's favourite actor is " + tempActor);
		}
		indexofActor++;
	}
}
}