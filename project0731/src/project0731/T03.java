package project0731;

public class T03 {

	public static void main(String[] args) throws java.io.IOException {
		char choice;
		do {
			System.out.println("***���̵� �׷� ��� ���***");
			System.out.println(" 1. ��ź�ҳ��");
			System.out.println(" 2. �ҳ�ô�");
			System.out.println(" 3. ������ ����");
			System.out.println(" 4. Ʈ����Ʈ");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			choice = (char) System.in.read();
			System.out.println();
		} while (choice < '1' || choice > '4');

		switch (choice) {
		case '1':
			System.out.println("****����, ��, ����, ����ȩ, ��, ����, RM****");
			break;
		case '2':
			System.out.println("****����, ����ī, ����, �¿�, ����, ���, Ƽ�Ĵ�, ����, ȿ��****");
			break;
		case '3':
			System.out.println("****����, �ڼ���, ���ҿ�, ����, ���ֿ�, ��ī, ����, ���̳�, �̿�, ����, ����****");
			break;
		case '4':
			System.out.println("****���, ��ȿ, ����, ����, ����, ����, �糪, �̳�, ä��****");
			break;
		}
	}
}
