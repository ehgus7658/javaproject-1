package project0731;

class Avg3{
	public String name;
	public int avg;
	public String average(int kor, int eng){
		avg = (kor + eng) / 2;
		return name + "�� ���� ��� :" + avg;
	}
	public String average(int kor, int eng, int mat){
		avg = (kor + eng + mat)/ 3;
		return name + "�� ���� ��� :" + avg;
	}
}
public class T09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avg3 student1 = new Avg3();
		Avg3 student2 = new Avg3();
		student1.name = "��ö��";
		student2.name = "�迵��";
		String st1_avg = student1.average(70, 80);
		String st2_avg = student2.average(80, 90, 100);
		System.out.println(st1_avg);
		System.out.println(st2_avg);

	}

}
