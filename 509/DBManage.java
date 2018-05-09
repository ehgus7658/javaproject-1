import java.sql.*;

public class DBManage {
	public static Connection con;
	public static Statement stmt;
	public static ResultSet rs;

	public void DBSetting(){
		try{
			class.forName("com.mysql.idbc.Driver");
			con = DrverManager.getConnection("jdbc:mysql:localhost:3306/test","root","1234");
			stmt = con.createStatement();
			JOprtionPane.showMessageDialog(null,"MySQL..Ok");
		}	eatch(Exception e) {
	}
}