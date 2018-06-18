import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

class MyFrame extends JFrame {
	JTextField id, title, p, year, price, author;
	JButton previousButton, nextButton, InsertButton, deleteButton, searchButton;
	ResultSet rs;
	Statement stmt;

	public MyFrame() throws SQLException {
		super("Database Viewer");
		Connection con = makeConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("SELECT * FROM books");
		setLayout(new GridLayout(0, 2));
		add(new JLabel("ID", JLabel.CENTER));
		add(id = new JTextField());
		add(new JLabel("TITLE", JLabel.CENTER));
		add(title = new JTextField());
		add(new JLabel("PUBLISHER", JLabel.CENTER));
		add(p = new JTextField());
		add(new JLabel("YEAR", JLabel.CENTER));
		add(year = new JTextField());
		add(new JLabel("PRICE", JLabel.CENTER));
		add(price = new JTextField());
		add(new JLabel("���� �˻�", JLabel.CENTER));
		add(author = new JTextField());
		previousButton = new JButton("Previous");
		previousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					rs.previous();
					id.setText("" + rs.getInt("book_id"));
					title.setText("" + rs.getString("title"));
					p.setText("" + rs.getString("publisher"));
					year.setText("" + rs.getString("year"));
					price.setText("" + rs.getInt("price"));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					rs.next();
					id.setText("" + rs.getInt("book_id"));
					title.setText("" + rs.getString("title"));
					p.setText("" + rs.getString("publisher"));
					year.setText("" + rs.getString("year"));
					price.setText("" + rs.getInt("price"));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		add(nextButton);
		add(previousButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		// pack();
		setVisible(true);
	}

	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/book_db";
		String id = "root";
		String password = "password";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		return con;
	}
}

public class SQLSelectTest {
	public static Connection makeConnection() {
		...
	}

	public static void main(String[] args) throws SQLException {
		new MyFrame();
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM books");
		while (rs.next()) {
			int id = rs.getInt("book_id");
			String title = rs.getString("title");
			System.out.println(id + " " + title);
		}
	}
}
