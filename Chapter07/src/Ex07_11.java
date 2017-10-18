
public class Ex07_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i;

		while (true) {
			for (i = 1; i <= 100; i++) {
				hap = hap + i;
				if (hap > 2000) {
					System.out.printf("%d\n", hap);
					hap = 0;
					break;
				}
			}
			System.out.println("나는 반복중...\n");
		}

	}

}
