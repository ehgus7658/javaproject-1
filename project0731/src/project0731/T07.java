package project0731;

class Avg {
	String name;
	String title = "ÃÑÁ¡";
	String Average = "Æò±Õ";
	int avg, tit, avr;

	public String average(int kor, int eng, int mat) {
		avg = (kor + eng + mat) / 3;
		tit = (kor + eng + mat);
		avr = (kor + eng + mat) / 3;
		return name + avg + title + tit + Average + avr;
	}
}

public class T07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avg student1 = new Avg();
		Avg student2 = new Avg();
		student1.name = "±èÃ¶¼ö";
		student2.name = "±è¿µÈñ";
		String st1_avg = student1.average(70, 80, 90);
		String st2_avg = student2.average(80, 90, 100);
		System.out.println(st1_avg);
		System.out.println(st2_avg);
	}

}
