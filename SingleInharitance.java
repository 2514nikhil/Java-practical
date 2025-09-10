//Q12. Write a program to illustrate the concept of Single inheritance

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
}

public class SingleInharitance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); 
		d.bark();
	}
}
