class BikeInfo{
static String brand;
static long price;
static Model model=Model.Royalenfield;
static Cc cc=Cc.cc346;
static int mileage;

static void setInfo(String newBrand,long newPrice,Model newModel,Cc newCc,int newMileage){
System.out.println("invoked setInfo()");
System.out.println(newBrand);
System.out.println(newPrice);
System.out.println(newModel);
System.out.println(newCc);
System.out.println(newMileage);
brand=newBrand;
price=newPrice;
model=newModel;
cc=newCc;
mileage=newMileage;
}

static void displayAll(){
System.out.println("invoked displayAll()");
System.out.println(brand);
System.out.println(price);
System.out.println(model);
System.out.println(cc);
System.out.println(mileage);
}





}