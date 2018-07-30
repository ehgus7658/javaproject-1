package project;

public class T07304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 20;
		double d = 3.14;
		boolean fag;
		fag = a > d;
		System.out.println("a가 d보다 큰가? " + fag);
		fag = a == 20.0f;
		System.out.println("10이 10과 같지 않은가?" + fag);
		fag = 10 <= 20;
		System.out.println("10이 20보다 작거나 같은거?" + fag);
		System.out.println("10이 20보다 작은가?" + (10 < 20));
		System.out.println("10이 20보다 크거나 같은가?" + (10 >= 20));

	}

}
