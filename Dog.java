package OOPConcepts;

public abstract class Dog extends Animal{
	
	public void bark()
	{
		System.out.println("Barking!");
	}
	
	/*
	 * @Override public void eat() { System.out.println("I eat dog food only!!"); }
	 */
	
	public void eat(String food)
	{
		System.out.println("I eat "+food);
	}

}
