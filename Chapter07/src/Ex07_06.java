import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int menu;

		// do~while
		do {
			System.out.printf("주문할 메뉴를 선택해 주세요.\n");
			System.out.printf("<1>라떼 <2>카푸치노 <3>아메리카노 <4>주문종료");

			menu = s.nextInt();

			switch (menu) {
			case 1:
				System.out.printf("#라떼를 주문하였습니다.\n");
				break;
			case 2:
				System.out.printf("#카푸치노를 주문하였습니다.\n");
				break;
			case 3:
				System.out.printf("#아메리카노를 주문하였습니다.\n");
				break;
			case 4:
				System.out.printf("###주문하신 커피를 준비합니다.\n");
				break;
			default:
				System.out.printf("잘못 주문하였습니다.");
			}
		} while (menu != 4);

	}
}
