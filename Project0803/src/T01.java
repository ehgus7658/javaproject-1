import java.net.InetAddress;
import java.net.UnknownHostException;

public class T01 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost(); //���� ��ǻ���� InetAddress
		System.out.println("���� ��ǻ���� �̸� : " + address.getHostName());
		System.out.println("���� ��ǻ���� IP �ּ� : " + address.getHostAddress());
		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com ��ǻ���� �̸��� IP�ּ� : " + address);
		InetAddress all[] = InetAddress.getAllByName("www.daum.net");
		for (int i = 0; i < all.length; i++)
			System.out.println(all[i]);
	}

}
