import java.util.Scanner;

public class Test07_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		double num1, num2;
		Scanner s = new Scanner(System.in);
		System.out.print("부호를 입력 하세요(EX:+, -, * /)");
		a = s.nextLine();
		System.out.println("숫자 2개를 입력하세요.");
		num1 = s.nextDouble();
		num2 = s.nextDouble();

		if (a.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (a.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (a.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else {
			if (num2 != 0)
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			else
				System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
