package Day4_Oops;

public class Employee {
	
	
	public Employee(int id, String name, String email, String address, double salary){
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
		this.salary=salary;
	}
	
	public Employee(){
		
	}
	
	
	static String employer="Quinnox";
	
	
	private int id;
	
	public void setId(int newId) {
		// business logic====
		this.id=newId;
	}
	public int getId() {
		return id;
	}
	
	
	String name;
	String email;
	double salary;
	int age;
	String address;
	String location="Hongasandra";

	public static String getEmployer() {
		return employer;
	}
	public static void setEmployer(String employer) {
		Employee.employer = employer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
