package project0731;

public class T02 {

	public static void main(String[] args) throws java.io.IOException{
		char choice;
		do {
			System.out.println("***�ݺ��� ���� ����***");
			System.out.println(" 1. while �ݺ���");
			System.out.println(" 2. do while �ݺ���");
			System.out.println(" 3.for �ݺ��� ");
			System.out.println("����ϴ� ��ȣ�� �Է��ϼ���");
			choice = (char)System.in.read();
			System.out.println();
		}while( choice < '1' || choice > '3');
		
		switch(choice)
		{
		case '1':
		System.out.println("****�ݺ���****");
		System.out.println("������ ���� �˻��ϰ� ������ ���� ��� �ݺ� �κ��� �����ϴ� �ݺ���");
		break;
		case '2':
		System.out.println("****do while �ݺ���****");
		System.out.println("�ݺ� �κ��� ���� �����ϰ� ������ �˻��Ѵ�. �ּ��� �ѹ��� ����Ǵ� �ݺ���");
		break;
		case '3':
		System.out.println("****for �ݺ���****");
		System.out.println("������ Ƚ���� �ݺ� �κ��� �����ϴ� �ݺ���");
		}
	}
}
