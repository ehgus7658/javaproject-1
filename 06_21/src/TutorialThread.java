class MultiThread extends Thread {// Thread�� ���, �����Ǵ� ��ü�� �����尡 �ȴ�
	String name;

	public MultiThread(String name) {
		System.out.println(getName() + "�����尡 �����Ǿ����ϴ�");
		this.name = name;
	}

	public void run() {// �����带 �����Ű�� ���ؼ��� run�޼ҵ尡 �ݵ�� �ʿ�
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + "(" + name + ")");
			try {
				sleep(100);// �����带 �ð� ������ �ΰ� �����Ͽ�
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
