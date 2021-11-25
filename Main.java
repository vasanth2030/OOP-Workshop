package OOPConcepts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Car maruti=new Car();
		 * 
		 * maruti.modelName="Alto"; maruti.power=800; maruti.price=100000;
		 * maruti.startEngine();
		 * 
		 * System.out.println(maruti);
		 * 
		 * Car honda=new Car(); honda.modelName="Civic"; honda.power=1000;
		 * honda.price=200000;
		 * 
		 * System.out.println(honda);
		 * 
		 * 
		 * Car hyundai=new Car(1500,"Vento",300000); System.out.println(hyundai);
		 */
		
		
		
		
		/*
		 * Student student=new Student(); student.setName("Dev"); student.setAge(20);
		 * student.setEmail("dev@gmail.com");
		 * 
		 * 
		 * System.out.println(student.getName());
		 */
		
		
		/*
		 * Dog newDog=new Dog(); newDog.bark(); newDog.eat(); newDog.breed="Labrador";
		 * System.out.println(newDog.breed);
		 * 
		 * Labrador lab=new Labrador(); lab.bark(); lab.eat();
		 */
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter some string");
		String str=sc.nextLine();
		
		System.out.println(id+" "+str);
		

	}

}
