import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDK 7 이후 부터 지원
		// 문자열을 switch-case 구현할수 있음.

		String month;

		Scanner scan = new Scanner(System.in);
		System.out.print("달의 이름을 입력하세요: ");
		month = scan.next();

		int monthNumber;

		switch (month) {
		case "january":
			monthNumber = 1;
			break;
		case "feruary":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		default:
			monthNumber = 0;
			break;
		}
		System.out.println(monthNumber);

	}

}
