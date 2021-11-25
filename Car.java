package OOPConcepts;

public class Car {
	int power;
	String modelName;
	int price;
	
	public Car(){
		
	}
	
	public Car(int power, String modelName, int price) {
		this.power=power;
		this.modelName=modelName;
		this.price=price;
		
	}
	
	public void startEngine()
	{
		System.out.println("Engine started..");
	}
	
	public void stopEngine()
	{
		System.out.println("Engine stopped..");
	}
	
	public void run()
	{
		System.out.println("===CAR RUNNING===");
	}

	@Override
	public String toString() {
		return "Car [power=" + power + "cc"+", modelName=" + modelName + ", price=" + price + "]";
	}
	
	
}

