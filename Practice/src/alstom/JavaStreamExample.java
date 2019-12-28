package alstom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class People {
	String name;
	int age;

	People(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}

}

class Student {
	String name;
	int age;

	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

public class JavaStreamExample {
	public static void main(String[] args) {

		List<People> peopleList = new ArrayList<People>();
		peopleList.add(new People(10, "Test"));
		peopleList.add(new People(15, "Test"));
		peopleList.add(new People(20, "Test"));
		peopleList.add(new People(29, "Test"));
		peopleList.add(new People(18, "Test"));

		
		System.out.println(peopleList);
		
		List<Student> students = peopleList.stream().filter(people -> people.age>18).map(people -> {
			Student stu =  new Student(people.age, people.name);
			return stu;
		}).collect(Collectors.toList());

		System.out.println("============================================");
		System.out.println(students);
		
	}
}
