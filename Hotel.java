class Hotel{
 static String starterName;
 static int foodId;

static void orderFood(String newStarterName){
System.out.println("invoked orderFood");
System.out.println("newStarterName " + newStarterName);
starterName=newStarterName;
}

static void orderFood(int mainFoodId){
System.out.println("invoked orderFood");
System.out.println("mainFoodId " + mainFoodId);
foodId=mainFoodId;
}
static void orderFood(String starter ,int newFoodId){
System.out.println("invoked orderFood");
System.out.println("starter " + starter);
System.out.println("newFoodId " + newFoodId);
starterName=starter;
foodId=newFoodId;
}

static void orderFood(int newFoodId,String starter ){
System.out.println("invoked orderFood");
System.out.println("newFoodId " + newFoodId);
System.out.println("starter " + starter);
foodId=newFoodId;
starterName=starter;
}


static void display(){
System.out.println("starterName " + starterName);
System.out.println("foodId " + foodId);
}
}