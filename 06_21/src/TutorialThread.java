class MultiThread extends Thread {// Thread를 상속, 생성되는 객체는 스레드가 된다
	String name;

	public MultiThread(String name) {
		System.out.println(getName() + "스레드가 생성되었습니다");
		this.name = name;
	}

	public void run() {// 스레드를 실행시키기 위해서는 run메소드가 반드시 필요
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + "(" + name + ")");
			try {
				sleep(100);// 스레드를 시간 간격을 두고 실행하여
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TutorialThread {
	public static void main(String[] args) {
		MultiThread mt1 = new MultiThread("Thread1");
		MultiThread mt2 = new MultiThread("Thread2");
		MultiThread mt3 = new MultiThread("Thread3");

		mt1.start();
		mt2.start();
		mt3.start();
	}
}
