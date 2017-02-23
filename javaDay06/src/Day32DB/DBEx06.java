package Day32DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBEx06 {
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append(" update professor ");
		sql.append(" set sal = ? ");
		sql.append(" where name = ? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//��� ����̹� ����
			con = ConnUtil.getConnection();
			//PreparedStatement ��ü ���
			pstmt = con.prepareStatement(sql.toString());
			//�Ķ���� ����
			//������ ? (���ε� ����)�� ��ü�� ���� �� �����ϱ�
			pstmt.setInt(1, 500);
			pstmt.setString(2, "ȫ�浿");
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �����Ǿ����ϴ�.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
	       	
	       	try {
	       		
		            if(pstmt != null) {
		            	pstmt.close();
		            }
		 
		            if(con != null) {
		                con.close();
		            }
	       	} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	       }
	}
}
