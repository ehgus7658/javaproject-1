import java.net.*;
import java.nio.charset.*;

public class T02 {
	public static void main(String[] args) throws MalformedInputException{
		URL kbs = new URL("http://www.kbs.co.kr/aboutkbs/history.html");
		System.out.println("프로토콜 : " + kbs.getProtocol());
		System.out.println("포트 : " + kbs.getPort());
		System.out.println("호스트 : " + kbs.getHost());
		System.out.println("파일(경로포함) : " + kbs.getFile());
		System.out.println("전체 URL : " + kbs.toExternalForm());
	}

}