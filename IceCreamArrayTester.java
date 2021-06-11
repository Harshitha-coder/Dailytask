class IceCreamArrayTester{

public static void main(String[] array){
    String[] iceCreams={"Vanilla","ButterScotch","Kulfi","Strawberry","CottonCandy","BlackCurrent",
	                   "Blackberry","Chocolate","Lavender","Mint"};
	System.out.println("iceCreams.length " + iceCreams.length);
	for( int indexofFlavour=0;indexofFlavour<iceCreams.length;){
		String tempcream=iceCreams[indexofFlavour];
		System.out.println(tempcream);
		System.out.println("current index is : " + indexofFlavour);
		if(tempcream.equals("Kulfi")){
			System.out.println("favourite icecream is " + tempcream);
		}
		indexofFlavour++;
	}
}
}