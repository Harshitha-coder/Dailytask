class MobileArrayTester{

public static void main(String[] array){
    String[] mobiles={"Oppo K1","Realme 5i","Vivo Y20","RedmiNote 6 Pro","OnePlus 9","Honor 3s",
	                   "Nokia N95","Realme 7i","Samsung S20","Poco F11"};
	System.out.println("mobiles.length " + mobiles.length);
	for( int indexofModel=0;indexofModel<mobiles.length;){
		String tempmob=mobiles[indexofModel];
		System.out.println(tempmob);
		System.out.println("current index is : " + indexofModel);
		if(tempmob.equals("Nokia N95")){
			System.out.println("matching mobile is " + tempmob);
		}
		indexofModel++;
	}
}
}