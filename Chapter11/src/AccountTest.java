import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		s = sc.next();
		System.out.println("�ܾ��� �Է��ϼ���");
		a = sc.nextInt();
		Account obj = new Account();
		obj.setName(s);
		obj.setBalance(a);
		if (a <= 0)
			System.out.println("�ٽ� �Է����ּ���");
		else
			System.out.println("�� " + obj.getName() + "���� ���� �ܰ��" + obj.getBalance() + "�� �Դϴ�");
	}

}
