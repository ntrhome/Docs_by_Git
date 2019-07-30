package my.classworld;

public class Student {
	private String name;
	private int age;

	public Student() {
		super();
		InitData("", 0);
	}
	
	public Student(String name, int age) {
		super();
		InitData(name, age);
	}
	
	private boolean InitData(String name, int age) {		
		return setName(name) | setAge(age);  
	}
	
	public String getName() { 
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean setName(String name) {
		if(name.length() <= 42) {
			this.name = name;
			return false;
		}
		else {
			this.name = "";
			return true;
		}
	}
	
	public boolean setAge(int age) {
		if(age >= 0 && age <= 130) {
			this.age = age;
			return false;
		}
		else {
			this.age = 0;
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return name == student.name && age == student.age; 
	}
	
	
}
