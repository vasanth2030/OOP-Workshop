package OOPConcepts;

public class Student {
	
	private String name;
	private int age;
	private String email;
	
	public Student()
	{
		
	}
	
	public Student(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public void writeExam()
	{
		System.out.println("Writing exam..");
	}
	
	public void study()
	{
		System.out.println("Studying..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
