package project0731;

public class T05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {88,97,53,62,92,68,82};
		int max = score[0];
		int value = score[0];
		for(int i = 1; i < score.length; i=i+1){
			if(score[i] > max)
				max = score[i];
			if(score[i] < value)
				value = score[i];
		}
		System.out.println("배열 요소의 최대값은 " + max + "입니다");
		System.out.println("배열 요소의 최소값은" + value + "입니다");
	}

}
