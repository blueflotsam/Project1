package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import obj.reimbursment;

public class HeadDao {
	private Connection conn=JDBCConnection.getConnection();
	
	public List<reimbursment> getAll(int id){
		List<reimbursment> e=new ArrayList<reimbursment>();
		String sql="select * from supervisor where headId=?;";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				int id2=rs.getInt("id");
				SupervisorDao dao=new SupervisorDao();
					
				List<reimbursment> l=(dao.getAll(id2));
				for(reimbursment r: l) {
					e.add(r);
				}
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return e;
	}
}
