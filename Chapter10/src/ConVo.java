import java.util.Scanner;

public class ConVo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		char s2;
		int count1 = 0 , count2 = 0; count3 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���:");
		s = scan.next();
		for(int i = 0; i < s.length(); i++){
			s2 = s.charAt(i);
			if((s2 >= 'A' && s2 <= 'Z') || (s2 >= 'a' && s2 <= 'z')){
				if(s2=='a' || s2=='e' || s2 == 'i' || s2 == 'o' || s2 == 'u')
					count1++;
				else if (s2 >= 'a' && s2 <= 'z')
					count2++;
			}
		}
		System.out.println("������ ���� :" + count1);
		System.out.println("������ ���� :" + count2);
		System.out.println("������ ���� :" + count3);
	}

}