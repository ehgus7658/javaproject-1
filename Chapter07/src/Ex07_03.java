import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.print("더할 첫번째 수 입력 : ");
			a = s.nextInt();
			System.out.print("더할 두번째 수 입력 : ");
			b = s.nextInt();
			
			if(a==0 && b==0){
				System.out.printf("두 입력값이 0이 들어와서 프로그램을 종료합니다.");
				break;
				
			}
				

			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}

	}

}
