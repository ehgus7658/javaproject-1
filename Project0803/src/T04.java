import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class T04 {
	public static void main(String[] args) throws Exception {
		int port = Integer.parseInt(args[0]);
		int times = Integer.parseInt(args[1]);
		ServerSocket ss = new ServerSocket(port); //��Ʈ��ȣ�� ServerSocket��ü ����
		int i = 1;
		while (i <= times) { //������ Ƚ����ŭ Ŭ���̾�Ʈ ��û ó��
			Socket s = ss.accept();
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			for (int j = i; j <= 10; j++)
				dos.writeInt(j);
			s.close();
			++i;
		}
	}

}
