import java.util.Scanner;

public class Test07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, stWeight, weight;
		Scanner scan = new Scanner(System.in);

		System.out.print("키를 입력하세요 : ");
		height = scan.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		weight = scan.nextDouble();

		stWeight = (height - 100) * 0.9;
		
		if(weight < stWeight)
			System.out.println("갈비야");
		else if(weight == stWeight)
			System.out.println("너는 표준이야");
		else
			System.out.println("꿀꿀");

	}

}
