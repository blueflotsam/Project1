package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import obj.reimbursment;

public class EmployeeDao {
	private Connection conn=JDBCConnection.getConnection();
	
	public List<reimbursment> getAll(int id){
		List<reimbursment> e=new ArrayList<reimbursment>();
		String sql="select * from reimbursement where id=?;";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				int id2=rs.getInt("id");
				char grade=rs.getString("grade").charAt(0);
				String type=rs.getString("type");
				float amount=rs.getFloat("amount");
				String status=rs.getString("status");
				int age=rs.getInt("age");
				String info=rs.getString("info");
				reimbursment r=new reimbursment(id2,grade,type,amount,status,age,info);
				e.add(r);
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return e;
	}
}
