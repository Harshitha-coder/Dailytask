class Computer
{
	String brand;
	String modelNo;
	double price;
	Computer()
	{
		System.out.println("created computer using default constructor");
	}

Computer(String brand)
{
	System.out.println("created computer using String");
	this.brand=brand;
	System.out.println("Brand: "+this.brand);
}

void init(String modelNo,double price)
{
	System.out.println("created computer using String and double");
	this.modelNo=modelNo;
	this.price=price;
	System.out.println("ModelNo:" +this.modelNo);
	System.out.println("Price: "+this.price);
}
}