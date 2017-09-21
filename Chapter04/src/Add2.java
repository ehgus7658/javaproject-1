import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, sum;
		Scanner input = new Scanner(System.in);

		System.out.print("X : ");
		x = input.nextInt();

		System.out.print("Y : ");
		y = input.nextInt();

		sum = x + y;

		System.out.println(sum);
	}

}
