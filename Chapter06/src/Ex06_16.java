
public class Ex06_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(초기값 1,초기값 2;조건식;증감식 1;증감식2)
		// 1X1 = 1
		// 2X2 = 2
		// 9X9 = 81
		int i, k;

		for (i = 1, k = 1; i <= 9; i++, k++)
			System.out.printf("%d X %d = %d\n", i, k, i * k);
	}

}
