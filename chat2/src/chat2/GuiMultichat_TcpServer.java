package chat2;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.jar.Attributes.Name;

import javax.swing.*;

class FrServer extends JFrame {
	JTextArea ta;
	JTextField tf;

	public FrServer() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ä�ù� ����");
		setLayout(new BorderLayout());

		JLabel label = new JLabel("JAVA ä�ù� ����");
		ta = new JTextArea(25, 40);
		tf = new JTextField(25);

		add(label, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		setVisible(true);
	}
}

public class GuiMultichat_TcpServer {
	HashMap clients;

	GuiMultichat_TcpServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}

	public static void main(String[] args) {
		FrServer f = new FrServer();
		new GuiMultichat_TcpServer().start();
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("JAVA ������ ���۵Ǿ����ϴ� ���õ� ��ſ� ä���� �ǽñ⸦~");
			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "]" + "���� �����ϼ̽��ϴ�");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
				System.out.println("������ ����:" + thread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();

		while (it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				System.out.println("sendToall ����� ����");
			}
		}
	}

	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("���� ���ù� ���� IO ����");
			}
		}

		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#" + name + "���� �����̽��ϴ� ȯ�����ּ���");

				clients.put(name, out);
				System.out.println("���� ������ ����" + clients.size() + "�Դϴ� � �ο��� ��������");
				System.out.println("���� ������ ���:");

				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				System.out.println("���ù� ���� io������ �Ͼ���ϴ�");
			} finally {
				sendToAll("#" + name + "���� JAVA ä�ù濡�� �����̽��ϴ� �ƽ��׿�");
				clients.remove(name);
				System.out.println(
						"[" + socket.getInetAddress() + ":" + socket.getPort() + "] ���� ������ �����߽��ϴ� ������ �� ������ ���ڳ׿�");
				System.out.println("���� JAVA ä�ù� ������ ����" + clients.size() + "�Դϴ�");
			}
		}

	}
}