package project0731;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class T04 {

	public static void main(String[] args) {
		int number[] = new int[10];
		System.out.println("number�迭�� ����:" + number.length);
		
		int i,j,sum = 0;
		double avg;
		for(i = 0; i < number.length; i=i+1)
			number[i] = i + 1;
		for(j = 0; j < number.length; j=j+1)
			sum = sum + number[j];
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�");
		avg = (double)sum/number.length;
		System.out.println("1���� 10������ ���� �����" + avg + "�Դϴ�");
	}
}
