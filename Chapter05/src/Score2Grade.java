import java.util.Scanner;

public class Score2Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score, number;
		char grade;

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하시오. : ");
		score = scan.nextInt(); // 100점
		number = score / 10;

		switch (number) {

		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;

		}
		System.out.println("등급: " + grade);

	}

}
