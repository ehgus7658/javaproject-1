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
		setTitle("채팅방 서버");
		setLayout(new BorderLayout());

		JLabel label = new JLabel("JAVA 채팅방 서버");
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
			System.out.println("JAVA 서버가 시작되었습니다 오늘도 즐거운 채팅이 되시기를~");
			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "]" + "에서 접속하셨습니다");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
				System.out.println("스레드 네임:" + thread.getName());
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
				System.out.println("sendToall 입출력 에러");
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
				System.out.println("서버 리시버 소켓 IO 에러");
			}
		}

		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#" + name + "님이 들어오셨습니다 환영해주세요");

				clients.put(name, out);
				System.out.println("현재 접속자 수는" + clients.size() + "입니다 어서 인원을 모으세요");
				System.out.println("현재 접속자 목록:");

				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				System.out.println("리시버 도중 io에러가 일어났습니다");
			} finally {
				sendToAll("#" + name + "님이 JAVA 채팅방에서 나가셨습니다 아쉽네요");
				clients.remove(name);
				System.out.println(
						"[" + socket.getInetAddress() + ":" + socket.getPort() + "] 에서 접속을 종료했습니다 다음에 또 만나면 좋겠네요");
				System.out.println("현재 JAVA 채팅방 접속자 수는" + clients.size() + "입니다");
			}
		}

	}
}