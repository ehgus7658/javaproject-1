import java.util.Scanner;

public class Test07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z, min;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력 하세요 : ");
		x = scan.nextInt();
		System.out.print("정수를 입력 하세요 : ");
		y = scan.nextInt();
		System.out.print("정수를 입력 하세요 : ");
		z = scan.nextInt();

		if (x < y) {
			if (x < z) {
				if (y < z)
					System.out.printf("%d %d %d", x, y, z);
				else
					System.out.printf("%d %d %d", x, z, y);
			} else {
				if (y < x)
					System.out.printf("%d %d %d", z, y, x);
				else
					System.out.printf("%d %d %d", z, x, y);
			}
		} else {
			if (y < z) {
				if (x < z)
					System.out.printf("%d %d %d", y, x, z);
				else
					System.out.printf("%d %d %d", y, z, x);
			} else {
				if (y < x)
					System.out.printf("%d %d %d", z, y, x);
				else
					System.out.printf("%d %d %d", z, x, y);
			}
		}
	}

}
