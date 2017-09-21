import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double w, h, area, perimeter;

		Scanner input = new Scanner(System.in); // 키보드 입력

		System.out.print("가로 : ");
		w = input.nextInt();

		System.out.print("세로 : ");
		h = input.nextInt();

		area = w * h;
		perimeter = 2.0 * (w + h);

		System.out.println("넓이" + area);
		System.out.println("둘레" + perimeter);

	}

}
