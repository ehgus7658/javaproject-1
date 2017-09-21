import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int currentHour = date.getHours();

		System.out.println("현재시간 : " + date);

		if (currentHour < 11) {
			System.out.println("좋은아침");
		} else if (currentHour < 15) {
			System.out.println("좋은오후");
		} else if (currentHour < 20) {
			System.out.println("좋은저녁");
		} else {
			System.out.println("좋은밤보내");
		}

	}

}
