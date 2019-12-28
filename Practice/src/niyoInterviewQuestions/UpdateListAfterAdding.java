package niyoInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int id;
	String name;
	List<String> hobbies;

	public Employee(int id, String name, List<String> hobbies) {
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}

}

public class UpdateListAfterAdding {
	public static void main(String[] args) {

		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Playing");

		Employee e1 = new Employee(1, "Naren", hobbies);
		Employee e2 = new Employee(2, "Deepak", hobbies);

		System.out.println(e1);
		System.out.println(e2);
		hobbies.add("Travelling");
		System.out.println(e1);
		System.out.println(e2);
	}
}
