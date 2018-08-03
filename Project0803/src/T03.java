import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class T03 {
	public static void main(String[] args) throws Exception{
		URL kbs = new URL("http://www.co.kr/aboutkbs/history.html");
		URLConnection kbsCon = kbs.openConnection();
		System.out.println("문서의 타입 : " + kbsCon.getContentType());
		System.out.println("===문서의 내용===");
		InputStream input = kbsCon.getInputStream();
		int i = 500;
		int c;
		while (((c = input.read()) != -1)&&(--i > 0)){
			System.out.println((char)c);
		}
	}
}
