class Animal{
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends Animal {
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
	public void say() {
		System.out.println("Dogs can say");
	}
	public void work() {
		System.out.println("Dogs can work");
	}
	public void Fly() {
		System.out.println("Dogs can Fly");
	}
}

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a =  new Animal();
		Dog b = new Dog();
		
		a.move();
		b.move();
		b.bark();
		b.say();
		b.work();
		b.Fly();

	}
}
