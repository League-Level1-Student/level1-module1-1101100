package _06_duck;

public class animal {
	String name;
	int age;
	
	void action1() {
		System.out.println("action1 has been excecuted " + name + " "+ age);
	}
	void action2() {
		System.out.println("action2 has been excecuted " + name + " "+ age);
	}
	
	animal(String name, int age){
		this.name = name;
		this.age = age;
	}
}
