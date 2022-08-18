package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.shoe;

public class DBCandFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Connection getDb()
	{
		final String JDBC="com.mysql.cj.jdbc.Driver";
		final String url="jdbc:mysql://localhost:3306/searchshoe?ServerTimezone=Asia/taipei";
		final String user="root";
		final String password="1234";
		Connection conn=null;
		try {
			Class.forName(JDBC);
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;		
	}
	
	public List<shoe> queryName(String name) {
		String sql = "select * from shoe where name like concat('%',?,'%')";
		Connection conn = this.getDb();
		List<shoe> l = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				shoe s = new shoe();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setModel(rs.getString("model"));
				s.setPrice(rs.getInt("price"));
				s.setStock(rs.getInt("stock"));
				l.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
}
