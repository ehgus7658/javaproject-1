import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int a;

		System.out.printf("정수를 입력해 주세요 : ");
		a = s.nextInt();

		if (a % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

	}

}
