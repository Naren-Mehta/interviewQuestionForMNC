package niyoInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Employee1 {
	int id;
	String name;
	List<String> hobbies;

	
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	public Employee1(int id, String name, List<String> hobbies) {
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
//	}

}


public class HashmapDemo {

	public static void main(String[] args) {

		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Playing");

		Employee1 e1 = new Employee1(1, "Naren", hobbies);
		Employee1 e2 = new Employee1(2, "Deepak", hobbies);
		
		System.out.println(e1.name.hashCode());
		
		HashMap<Employee1, Integer> hm= new HashMap<Employee1, Integer>();
		hm.put(e1, 1);
		hm.put(e2, 2);
		
		System.out.println(hm);
		
		e1.name="Hero";
		
//		hobbies.add("Travelling");
		System.out.println(hm);

		
	}
}
