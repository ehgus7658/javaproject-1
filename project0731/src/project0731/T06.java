package project0731;

public class T06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD[][] = new int[4][5];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		System.out.println("2차원 배열에서 행의 길이는 :" + twoD.length);
		System.out.println(" 첫 번째 행의 요소 수는 :" + twoD.length);
		System.out.println("두 번째 행의 요소 수는 :" + twoD.length);
		System.out.println("세 번째 행의 요소 수는 :" + twoD.length);
		System.out.println("네 번째 행의 요소 수는 :" + twoD.length);
		int i, j, k = 0;
		for (i = 0; i < twoD.length; i++)
			for (j = 0; j < twoD.length; j++) {
				twoD[i][j] = k;
				k++;
			}
		for (i = 0; i < twoD.length; i++) {
			for (j = 0; j < twoD.length; j++)
				System.out.println(twoD[i][j] + " ");
			System.out.println();
		}

	}

}
