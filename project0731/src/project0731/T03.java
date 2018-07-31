package project0731;

public class T03 {

	public static void main(String[] args) throws java.io.IOException {
		char choice;
		do {
			System.out.println("***아이돌 그룹 멤머 명단***");
			System.out.println(" 1. 방탄소년단");
			System.out.println(" 2. 소녀시대");
			System.out.println(" 3. 애프터 스쿨");
			System.out.println(" 4. 트와이트");
			System.out.println("원하는 번호를 입력하세요");
			choice = (char) System.in.read();
			System.out.println();
		} while (choice < '1' || choice > '4');

		switch (choice) {
		case '1':
			System.out.println("****정국, 뷔, 슈가, 제이홉, 진, 지민, RM****");
			break;
		case '2':
			System.out.println("****윤아, 제시카, 수영, 태연, 유리, 써니, 티파니, 서현, 효연****");
			break;
		case '3':
			System.out.println("****나나, 박수아, 유소영, 가희, 이주연, 베카, 가은, 레이나, 이영, 유이, 정아****");
			break;
		case '4':
			System.out.println("****모모, 지효, 다현, 쯔위, 나연, 정연, 사나, 미나, 채영****");
			break;
		}
	}
}
