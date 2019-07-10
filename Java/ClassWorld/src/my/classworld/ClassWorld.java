package my.classworld;

public class ClassWorld {

	public static void main(String[] args) {

		System.out.println("I do:");
		
	 Object obj = new Object();
	 //obj.
	 
	 Student st1 = new Student("Vasia", 20);
	 Student st2 = new Student("Vasia", 20);
	 System.out.println(st1.toString());
	 
	 System.out.println("? " + st1.equals(st2));

		
		
	}

}
