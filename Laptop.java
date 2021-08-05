class Laptop extends Computer
{
	double weight;
	boolean camera;
	
Laptop(double weight,boolean camera)
{
     super("lenovo");
	System.out.println("created laptop with weight and camera");
	this.weight=weight;
	this.camera=camera;
}

void displayProperties()
{
	System.out.println("Brand: " +this.brand);
	System.out.println("Weight: " +this.weight);
	System.out.println("Camera:" +this.camera);
	System.out.println("modelNo: " +super.modelNo);
	System.out.println("price: " +super.price);
}
}