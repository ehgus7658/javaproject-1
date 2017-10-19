
public class Test07_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2~100사이 모든 소수 : ");
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.print(" " + i);
		}

	}

}
