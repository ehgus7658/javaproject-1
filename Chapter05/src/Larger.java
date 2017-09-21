import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, max;

		Scanner input = new Scanner(System.in);

		System.out.printf("첫번째 정수 : ");
		x = input.nextInt();

		System.out.printf("두번째 정수 : ");
		y = input.nextInt();

		if (x > y)
			max = x;
		else
			max = y;

		System.out.println("큰수는" + max);

	}

}
