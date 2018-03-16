import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("입금하려는 금액을 입력하시요");
		s = sc.next();
		
		
		Account obj = new Account();
		obj.setName("tom");
		obj.setBalance(0);
		obj.setPrice();
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는" + obj.getBalance() + "잔액은" + obj.getPrice() +"입니다");
	}

}
