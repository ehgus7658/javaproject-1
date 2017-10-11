import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int hap = 0; // 합계 누적 변수
		int i; // 증가 변수
		int num; // 입력 받을 최종 값

		System.out.printf("값 입력 : ");
		num = s.nextInt();

		for (i = 1; i <= num; i++) {
			hap += i;
		}
		System.out.printf("1에서 %d까지의 합 : %d\n", num, hap);

	}

}
