class ToyStoreTester
{
	public static void main(String[] args)
	{
		
		ToyStore store=new ToyStore();
		
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		store.addToy("Panda");
		ToysMemoryExcedException runtime=new ToysMemoryExcedException();
		throw runtime;
		
	}
}