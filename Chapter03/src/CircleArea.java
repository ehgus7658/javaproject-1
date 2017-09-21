import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius; // 원의 반지름
		double area; // 원의 면적

		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력 : ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;
		System.out.println(area);

	}

}
