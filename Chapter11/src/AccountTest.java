import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		s = sc.next();
		System.out.println("잔액을 입력하세요");
		a = sc.nextInt();
		Account obj = new Account();
		obj.setName(s);
		obj.setBalance(a);
		if (a <= 0)
			System.out.println("다시 입력해주세요");
		else
			System.out.println("고객 " + obj.getName() + "씨의 통장 잔고는" + obj.getBalance() + "원 입니다");
	}

}
