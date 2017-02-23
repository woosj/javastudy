package Day32DB;

import java.sql.*;
import java.io.*;
import java.util.*;

public class DBEx10 {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		//�������� ��ü ���
		Properties pro = new Properties();	//util���� ����
		
		//�������� �ҷ����� 
		pro.load(new FileInputStream("src/department.properties"));
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			pstmt.setInt(1, 33);
			pstmt.setString(2, "�ٰ�");
			pstmt.setString(3, "3ȣ��");
			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �߰� �Ǿ����ϴ�.");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
	       	//pstmt �� ����
	       	try {
	            if(pstmt != null) {
	            	pstmt.close();
	            }
		 
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       	
	       	//con�� ����
	       	try {
	       		if(con != null) {
	                con.close();
	            }
	       	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

       }//end of finally
		
	}

}
