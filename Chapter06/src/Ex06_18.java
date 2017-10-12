import java.util.Scanner;

public class Ex06_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		for (;;) {
			System.out.printf("더할 첫 번쨰 수 입력 : ");
			a = s.nextInt();
			System.out.printf("더할 두 번쨰 수 입력 : ");
			b = s.nextInt();
			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}

	}

}
