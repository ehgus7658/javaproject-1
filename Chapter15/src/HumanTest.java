class Human{
	public void move(){
		System.out.println("Human can move");
	}
}
class HyunWoo extends Human {
	public void move() {
		System.out.println("HyunWoo can move");
	}
	public void say() {
		System.out.println("HyunWoo can say");
	}
	public void run() {
		System.out.println("HyunWoo can run");
	}
	public void laugh() {
		System.out.println("HyunWoo can laugh");
	}
	public void layDown() {
		System.out.println("HyunWoo can lay down");
	}
	public void sleep() {
		System.out.println("HyunWoo can sleep");
	}
}
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a =  new Human();
		HyunWoo b = new HyunWoo();
		
		a.move();
		b.say();
		b.run();
		b.laugh();
		b.layDown();
		b.sleep();
		
		System.out.println("hahahaha");

	}

}
