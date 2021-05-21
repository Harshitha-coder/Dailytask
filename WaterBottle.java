class WaterBottle{

static String brand;
static int quantity;
static boolean thermoFlask;


static void printBrand(){
System.out.println(brand);
}

static void printQuantity(){
System.out.println(quantity);
}

static void printThermoFlask(){
System.out.println(thermoFlask);
}

static void changeBrand(String newBrand){
System.out.println(newBrand);
System.out.println("brand before change "+ brand);
brand=newBrand;
System.out.println("brand after change "+ brand);
}

static void changeQuantity(int newQuantity){
System.out.println(newQuantity);
System.out.println("Quantity before change "+ quantity);
quantity=newQuantity;
System.out.println("Quantity after change "+ quantity);
}

static void changethermoFlask(boolean newthermoFlask){
System.out.println(newthermoFlask);
System.out.println("thermoFlask before change "+ thermoFlask);
thermoFlask=newthermoFlask;
System.out.println("thermoFlask after change "+ thermoFlask);
}

static void displayAll(){
printBrand();
printQuantity();
printThermoFlask();
}
}



