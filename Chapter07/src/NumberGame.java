import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 59; // 정답
		int guess;
		Scanner sc = new Scanner(System.in);
		int tries = 0;

		do {
			System.out.print("정답을 추축하여 보세요: ");
			guess = sc.nextInt();
			tries++;

			if (guess > answer) {
				System.out.println("제시한 정수가 높습니다.");
			}
			if (guess < answer) {
				System.out.println("제시한 정수가 낮습니다.");
			}

		} while (guess != answer);
		System.out.println("축하합니다. 정답입니다. 시도횟수는" + tries);
	}

}
