import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ա��Ϸ��� �ݾ��� �Է��Ͻÿ�");
		s = sc.next();
		
		
		Account obj = new Account();
		obj.setName("tom");
		obj.setBalance(0);
		obj.setPrice();
		System.out.println("�̸��� " + obj.getName() + " ���� �ܰ��" + obj.getBalance() + "�ܾ���" + obj.getPrice() +"�Դϴ�");
	}

}
