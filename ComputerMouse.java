class ComputerMouse{

static String wireless;
static boolean chargeable;
static int range;

static void printWireless(){
System.out.println(wireless);
}

static void printChargeable(){
System.out.println(chargeable);
}

static void printRange(){
System.out.println(range);
}



static void changeWireless(String newWireless){
System.out.println(newWireless);
System.out.println(" before change "+ wireless);
wireless=newWireless;
System.out.println(" after change "+ wireless);

}

static void changeChargeable(boolean newChargeable){
System.out.println(newChargeable);
System.out.println(" before change "+ chargeable);
chargeable=newChargeable;
System.out.println(" after change "+ chargeable);

}

static void changeRange(int newRange){
System.out.println(newRange);
System.out.println(" before change "+ range);
range=newRange;
System.out.println(" after change "+ range);

}
static void displayAll(){
printWireless();
printChargeable();
printRange();
}


}




