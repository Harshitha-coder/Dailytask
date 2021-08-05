class LaptopTester
{
	public static void main(String[] args)
	{
		Computer comp=new Laptop(2000,true);
		comp.init("50Qp",35000);
		Laptop casted=(Laptop)comp;
		double value=casted.weight;
		boolean value1=casted.camera;
		System.out.println(value);
		System.out.println(value1);
		casted.displayProperties();
	}
}