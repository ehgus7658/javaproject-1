import java.sql.*;

public class DBManage {
		public static Connection con;
		public static Statement stmt;
		public static ResultSet rs;

		public void DBSetting(){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql:localhost/?serverTimezone=UTC","root","1234");
				stmt = con.createStatement();
				System.out.println("접속 성공!!");
				JOptionPane.showMessageDialog(null,"MySQL..Ok");
			}

		catch(Exception e) {
		}
	}
}
