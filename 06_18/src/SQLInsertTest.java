import java.sql.*;

public class SQLInsertTest {
	public static Connection makeConnection() {
		 ...// ���� ����
		 }
		 public static void main(String arg[]) {
		 addBook("Artificial Intellegence", "Addison Wesley", "2002", 35000);
}
		 private static void addBook(String title, String publisher, String year,
				 int price) {
				 Connection con = makeConnection();
				 try {
				 Statement stmt = con.createStatement();
				 String s = "INSERT INTO books (title, publisher, year, price) VALUES ";
				 s += "('" + title + "','" + publisher + "','" + year + "','"
				 + price + "')";
				 System.out.println(s);
				 int i = stmt.executeUpdate(s);
				 if (i == 1)
				 System.out.println("���ڵ� �߰� ����");
				 else
				 System.out.println("���ڵ� �߰� ����");
				 } catch (SQLException e) {
				 System.out.println(e.getMessage());
				 System.exit(0);
				 }
				 }
				}
