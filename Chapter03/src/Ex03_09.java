
public class Ex03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, d; // 정수형 4개

		a = 100 + 100; // 200
		b = a + 100; // 300
		c = a + b - 100;// 200+300-100 = 400
		d = a + b + c;
		System.out.printf("a,b,c,d의 값 ==> %d %d %d %d \n", a, b, c, d);

		a = b = c = d = 100;
		System.out.printf("a,b,c,d의 값 ==> %d %d %d %d \n", a, b, c, d);

		a = 100;
		a = a + 200;
		System.out.printf("a의 값 ==> %d", a);

	}

}
