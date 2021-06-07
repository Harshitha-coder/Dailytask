class HotelTester{

public static void main(String[] tue){
String starter="Gobi";
int itemId=15;
Hotel.orderFood(starter);
Hotel.orderFood(itemId);
Hotel.orderFood(starter,itemId);
Hotel.orderFood(itemId,starter);
Hotel.display();
}
}