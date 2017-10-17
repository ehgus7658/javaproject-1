
public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+2+3+4+5+6...+9+10=55
		int hap = 0;
		int i = 1;

		/*while (i <= 10) {
			hap = hap + i;
			i++;
		}*/
		for (i = 1; i <= 10; i++) {
			hap = hap + i;
		}

		System.out.printf("%d\n", hap);
	}

}
