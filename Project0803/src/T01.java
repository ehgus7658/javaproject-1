import java.net.InetAddress;
import java.net.UnknownHostException;

public class T01 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost(); //현재 컴퓨터의 InetAddress
		System.out.println("로컬 컴퓨터의 이름 : " + address.getHostName());
		System.out.println("로컬 컴퓨터의 IP 주소 : " + address.getHostAddress());
		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com 컴퓨터의 이름과 IP주소 : " + address);
		InetAddress all[] = InetAddress.getAllByName("www.daum.net");
		for (int i = 0; i < all.length; i++)
			System.out.println(all[i]);
	}

}
