package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import obj.reimbursment;
import obj.user;

public class loginDao {
	private Connection conn=JDBCConnection.getConnection();
	
	public String[] getAll(user u){
		String sql="select * from login where username=? AND password=?;";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				int id2=rs.getInt("id");
				String s=rs.getString("type");
				String[] arr=new String[2];
				arr[0]=s;
				arr[1]=Integer.toString(id2);
				return arr;
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return null;
	}
}
