
public class Ex06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단~9단까지 출력하는 프로그램 충첩 for
		int i, k;

		for (i = 2; i <= 9; i++) {
			for (k = 1; k <= 9; k++) {
				System.out.printf("%d X %d = %d\n", i, k, i * k);
			}
			System.out.printf("\n");
		}
	}
}
